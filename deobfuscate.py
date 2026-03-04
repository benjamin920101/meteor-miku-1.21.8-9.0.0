#!/usr/bin/env python3
"""
Minecraft 1.21.8 自動反混淆腳本
下載 Yarn mappings 並批量替換所有 Java 文件中的混淆類名
"""

import requests
import zipfile
import io
import os
import re
from pathlib import Path

# 配置
MC_VERSION = "1.21.8"
YARN_BUILD = "1"  # 1.21.8 的最新 build
SOURCE_DIR = "./"  # 修改為你的源代碼目錄

def download_yarn_mappings(mc_version, build):
    """下載 Yarn mappings"""
    url = f"https://maven.fabricmc.net/net/fabricmc/yarn/{mc_version}+build.{build}/yarn-{mc_version}+build.{build}-v2.jar"
    
    print(f"正在下載 Yarn mappings for Minecraft {mc_version}...")
    print(f"URL: {url}")
    
    try:
        response = requests.get(url, timeout=30)
        response.raise_for_status()
        print("✓ 下載成功!")
        return response.content
    except Exception as e:
        print(f"✗ 下載失敗: {e}")
        return None

def parse_tiny_mappings(jar_content):
    """解析 Tiny v2 格式映射"""
    mappings = {
        'classes': {},
        'methods': {},
        'fields': {}
    }
    
    print("正在解析映射文件...")
    
    try:
        with zipfile.ZipFile(io.BytesIO(jar_content)) as jar:
            with jar.open('mappings/mappings.tiny') as f:
                content = f.read().decode('utf-8')
                
                lines = content.split('\n')
                current_class_obf = None
                current_class_named = None
                
                for line in lines:
                    parts = line.strip().split('\t')
                    
                    if not parts or not parts[0]:
                        continue
                    
                    # 類映射: c <intermediary> <named>
                    if parts[0] == 'c':
                        if len(parts) >= 3:
                            obf = parts[1].replace('/', '.')
                            named = parts[2].replace('/', '.')
                            mappings['classes'][obf] = named
                            current_class_obf = parts[1]
                            current_class_named = parts[2]
                    
                    # 方法映射: m <descriptor> <intermediary> <named>
                    elif parts[0] == '\tm' and current_class_obf:
                        if len(parts) >= 4:
                            obf_method = parts[2]
                            named_method = parts[3]
                            key = f"{current_class_obf}.{obf_method}"
                            mappings['methods'][key] = named_method
                    
                    # 字段映射: f <descriptor> <intermediary> <named>
                    elif parts[0] == '\tf' and current_class_obf:
                        if len(parts) >= 4:
                            obf_field = parts[2]
                            named_field = parts[3]
                            key = f"{current_class_obf}.{obf_field}"
                            mappings['fields'][key] = named_field
                
                print(f"✓ 解析完成!")
                print(f"  - 類映射: {len(mappings['classes'])} 個")
                print(f"  - 方法映射: {len(mappings['methods'])} 個")
                print(f"  - 字段映射: {len(mappings['fields'])} 個")
                
                return mappings
    except Exception as e:
        print(f"✗ 解析失敗: {e}")
        return None

def save_mappings_to_file(mappings, filename='mappings_1.21.8.txt'):
    """保存映射到文本文件"""
    print(f"正在保存映射到 {filename}...")
    
    with open(filename, 'w', encoding='utf-8') as f:
        f.write("# Minecraft 1.21.8 Yarn Mappings\n")
        f.write("# Format: obfuscated_name -> deobfuscated_name\n\n")
        
        f.write("## Classes\n")
        for obf, named in sorted(mappings['classes'].items()):
            if 'class_' in obf:
                f.write(f"{obf} -> {named}\n")
    
    print(f"✓ 映射已保存到 {filename}")

def replace_in_file(filepath, class_mappings):
    """替換單個文件中的混淆類名"""
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            content = f.read()
    except UnicodeDecodeError:
        try:
            with open(filepath, 'r', encoding='latin-1') as f:
                content = f.read()
        except:
            return 0
    
    original_content = content
    replacements = 0
    
    # 按長度排序,先替換較長的名稱(避免部分匹配問題)
    sorted_mappings = sorted(class_mappings.items(), key=lambda x: len(x[0]), reverse=True)
    
    for obf_name, named in sorted_mappings:
        if obf_name in content:
            # 使用正則表達式確保只替換完整的類名
            pattern = r'\b' + re.escape(obf_name) + r'\b'
            new_content = re.sub(pattern, named, content)
            if new_content != content:
                replacements += len(re.findall(pattern, content))
                content = new_content
    
    if content != original_content:
        try:
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(content)
            return replacements
        except:
            return 0
    
    return 0

def process_directory(source_dir, class_mappings):
    """批量處理目錄中的所有 Java 文件"""
    print(f"\n開始處理目錄: {source_dir}")
    
    if not os.path.exists(source_dir):
        print(f"✗ 目錄不存在: {source_dir}")
        print(f"請修改腳本中的 SOURCE_DIR 變量為你的源代碼目錄")
        return
    
    java_files = list(Path(source_dir).rglob('*.java'))
    
    if not java_files:
        print(f"✗ 未找到 Java 文件")
        return
    
    print(f"找到 {len(java_files)} 個 Java 文件")
    
    total_replacements = 0
    processed_files = 0
    
    for filepath in java_files:
        replacements = replace_in_file(filepath, class_mappings)
        if replacements > 0:
            processed_files += 1
            total_replacements += replacements
            print(f"  ✓ {filepath.name}: {replacements} 處替換")
    
    print(f"\n完成!")
    print(f"  - 處理了 {processed_files} 個文件")
    print(f"  - 總共替換 {total_replacements} 處")

def main():
    print("=" * 60)
    print("Minecraft 1.21.8 反混淆工具")
    print("=" * 60)
    
    # 1. 下載映射
    jar_content = download_yarn_mappings(MC_VERSION, YARN_BUILD)
    if not jar_content:
        print("\n請檢查網絡連接或手動下載映射文件")
        print(f"下載地址: https://maven.fabricmc.net/net/fabricmc/yarn/{MC_VERSION}+build.{YARN_BUILD}/")
        return
    
    # 2. 解析映射
    mappings = parse_tiny_mappings(jar_content)
    if not mappings:
        return
    
    # 3. 保存映射到文件(可選)
    save_mappings_to_file(mappings)
    
    # 4. 顯示一些示例映射
    print("\n示例映射:")
    example_count = 0
    for obf, named in mappings['classes'].items():
        if 'class_' in obf and example_count < 10:
            print(f"  {obf} -> {named}")
            example_count += 1
    
    # 5. 批量替換
    print("\n" + "=" * 60)
    user_input = input(f"是否要處理目錄 '{SOURCE_DIR}' 中的文件? (y/n): ")
    
    if user_input.lower() == 'y':
        process_directory(SOURCE_DIR, mappings['classes'])
    else:
        print("已取消。你可以:")
        print("  1. 修改腳本中的 SOURCE_DIR 變量")
        print("  2. 查看 mappings_1.21.8.txt 文件中的映射")
        print("  3. 重新運行腳本")

if __name__ == "__main__":
    main()
