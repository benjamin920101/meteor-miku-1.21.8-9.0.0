# meteor-miku 1.21.8-9.0.0

> ⚠️ **本 repo 為反編譯（decompiled）產物**，原始碼已透過 **Allatori Obfuscator** 進行高強度混淆，所有類別名稱（如 `IIiiiiiiiI`、`iIiIiIIIii`）及方法名稱（如 `ALLATORIxDEMO`）皆為無意義識別符，字串常量亦已加密。以下分析為根據代碼結構、依賴關係與行為模式推導而來。

---

## 專案概覽

| 項目 | 內容 |
|------|------|
| **類型** | Minecraft Fabric Mod（Meteor Client Addon） |
| **目標版本** | Minecraft 1.21.x（Fabric） |
| **反編譯工具** | CFR 0.152 |
| **混淆器** | Allatori Obfuscator（含字串加密） |
| **主要語言** | Java 100% |
| **入口點** | `com.github.mikumiku.addon.ok.MikuMikuAddon` |

---

## 混淆特徵說明

本代碼使用了以下混淆技術：

- **類別名混淆**：所有自訂類別使用 `I`/`i` 組合的無意義名稱（如 `IIiiiiiiiI`、`iIiIiIIIii`）
- **方法名混淆**：所有方法統一命名為 `ALLATORIxDEMO`（Allatori 試用版的標誌性水印）
- **字串加密**：所有字串常量以 Unicode 編碼或 XOR 加密儲存，於執行時動態解密
- **控制流混淆**：大量使用無意義的位元運算（如 `3 >> 1`、`4 ^ 5`、`2 & 5`）來混淆常數值
- **到期機制（Expiry Check）**：多個類別含有 `new Date().after(new Date(1773504000082L))` 檢查（到期時間約為 **2026年3月**），到期後拋出異常並提示更新

---

## 架構分析

### 入口點

```
com.github.mikumiku.addon.ok.MikuMikuAddon  (extends MeteorAddon)
├── onInitialize()         → 初始化所有模組
├── onRegisterCategories() → 註冊模組分類
└── getRepo()              → 指向 GitHub 來源 repo
```

### 基礎類別

- **`iIiIiIIIii`**（`extends Module`）：所有自訂模組的抽象基底類別，提供 Baritone 路徑整合（`IBaritone`）及世界實例存取
- **`iiiIIIiiii`**（`extends Module`）：輕量模組基底類別，含到期時間檢查與自訂切換訊息
- **`MagicMix`**（`com.github.mikumiku.addon.mixinface`）：Mixin 介面橋接類別，提供模組狀態查詢的靜態方法：
  - `coordinatesisActive()` → 座標偽裝模組是否啟用
  - `oreSimBaritone()` → 礦石模擬 + Baritone 是否啟用
  - `eflyenabled()` → 增強 Elytra 飛行是否啟用

### 模組分類（Categories）

代碼中定義了 **3 個自訂分類**（名稱因混淆而加密，但結構清晰）：
- `iIiIiIIIii.iiiiiIIiIi` — 主要功能分類
- `iIiIiIIIii.iIIiIiiiIi` — 輔助功能分類
- `iIiIiIIIii.ALLATORIxDEMO` — 第三分類

---

## 功能模組詳細分析

### 🗺️ 世界種子與結構尋找系統

這是本 addon 最核心的功能之一，整合了 [SeedFinding 系列函式庫](https://github.com/SeedFinding)。

**`IIiiiiiiiI`** — **結構定位器（Structure Finder）**

可在給定的世界種子與玩家位置附近搜尋以下結構的座標：

- 要塞（Stronghold）
- 沉船（Shipwreck）
- 沙漠神殿（Desert Pyramid）
- 叢林神殿（Jungle Pyramid）
- 雪屋（Igloo）
- 豪宅（Woodland Mansion）
- 廢棄礦坑（Mineshaft）
- 埋藏寶藏（Buried Treasure）
- 下界化石（Nether Fossil）
- 以及更多...

包含 `com.seedfinding.mcfeature` 完整依賴（BiomeSource、ChunkRand、StructureDevice、BiomeDevice），支援多執行緒種子暴力搜尋。

---

### ✈️ Elytra 飛行強化系統

**`iIiiiIIiII`** — **增強 Elytra 自動飛行**

- 整合 BaritoneAPI `ElytraProcess` 自動路徑規劃
- 支援下界快速穿越（Nether travel）
- 管理飛行高度、速度補正
- 狀態機：`SupplyState`（供應狀態管理）

**`IIiiIiIiiI`** — **ElytraFlyPlus（增強版 Elytra 飛行模式）**

- 掛接 `PlayerMoveEvent`
- 支援多種飛行模式（枚舉 `ElytraFlyPlus.Mode`）
- 整合聲音事件過濾（`PlaySoundEvent`）

**Mixin 注入（`LivingEntityMixin`、`EntityMixin`）**：
- 強制讓玩家在非穿著鞘翅時仍被視為 `isFallFlying()`
- 強制讓玩家在 Elytra 飛行時保持衝刺狀態（`isSprinting`）
- 阻止 Elytra 飛行時的碰撞推動（`pushAwayFrom`）

---

### ⛏️ 自動採礦系統

**`IIiIIiIiiI`** — **AutoMiner（自動礦工）**

- 完整狀態機（多達 9 個採礦狀態）
- 整合 BaritoneAPI `CustomGoalProcess` 自動導航至礦石位置
- 支援工具類型選擇（`AutoMiner.ToolType`）：鎬、斧等
- 自動換工具邏輯（掃描背包最佳工具）

**`IiiiIiiIIi`** — **礦石模擬器（OreSim）**

- 整合 BaritoneAPI MineProcess
- 透過 `MineProcessMixin` 攔截 Baritone 原生掃描流程
- 替換為模擬目標列表（`MagicMix.oreGoals`），讓 Baritone 自動挖掘指定位置

---

### 🧭 自動路徑與導航

**`IiiiiIIIII`** — **Elytra 地點傳送（ElytraTeleport）**

- 使用 `BaritoneAPI.getElytraProcess().pathTo(GoalXZ)` 自動飛往目標位置
- 失敗時輸出錯誤訊息

**`IiIiiIIIiI`（工具類）**

- `cancelEverything()` — 取消所有 Baritone 路徑
- `iiiIiIiiIi()` — 判斷是否身處主世界（Overworld）
- 動態類別存在性檢測（用於可選依賴判斷）

---

### 🥊 戰鬥相關

**`iIiIiIiiii`** — **PvP 輔助模組**

引用了 Meteor 內建的戰鬥模組：
- `KillAura` — 自動攻擊
- `CrystalAura` — 水晶 PvP 自動化
- `BedAura` — 床爆自動化
- `AnchorAura` — 重生錨爆炸自動化
- 整合 Baritone 自動逃跑/追擊路徑
- `TickEvent.Pre` 驅動的戰鬥邏輯

**`IiiiiIiiiI`** — **近戰攻擊輔助（MaceCombo 等）**

- 使用模擬攻擊輸入
- 整合 `BaritoneUtil.SwingSide` 揮手方向控制

---

### 📦 物品欄管理

**`iiiIIIiIII`** — **箱子/背包自動整理（含 Shulker Box 支援）**

- `ShulkerBoxItemFetcher.State` 狀態機
- 物品可用性、耐久、附魔分析
- 自動開箱、取物、關閉流程

---

### 🗺️ 座標偽裝（FakeCoordinates）

**`IiiIiiiIII`** — **假座標顯示**

- 支援多種偽裝模式（`FakeCoordinates.ObfuscationMode`）：固定假座標、動態偏移等
- 透過 `MagicMix.coordinatesisActive()` 跨模組啟用
- **`MixinMinimap`**：攔截 Xaero's Minimap 的渲染流程，將顯示座標替換為偽裝座標（`MagicMix.x` / `MagicMix.z`）
- **`MixinRenderHandlerMinihud`**：攔截 MiniHUD 的 X/Z 座標顯示

---

### 💬 Auto Ez / 聊天自動化

**`iiiiiIIIIi`** — **Auto Ez 訊息系統**

- 偵測 `PacketEvent.Receive`（死亡封包），在對手死亡時自動發送嘲諷訊息
- 支援三種訊息模式：隨機預設清單、自訂清單、內建清單
- 支援 `{player}` 佔位符替換

---

### 🏗️ 建築/NBT 系統

**`iiiIiIIiIi`** — **NBT 結構讀取/放置**

- 從 `MeteorClient.FOLDER` 目錄讀取 `.nbt` 檔案
- 支援結構放置預覽與執行

---

### 🔧 其他模組總覽

| 混淆類名 | 推測功能 | 觸發事件 |
|---|---|---|
| `IIIIiiIIiI` | 週期性行為自動化 | `TickEvent.Pre` |
| `IIIIiiiiIi` | 方塊互動自動化 | Block 事件 |
| `IiIIiIIIII` | 後處理 Tick 模組 | `TickEvent.Post` |
| `iIIiIiiiii` | 週期性工具/物品操作 | `TickEvent.Pre` |
| `iIIiiiIiii` | 週期性自動化（含型態衝突） | `TickEvent.Pre` |
| `iIIiiiiIIi` | 週期性自動化 | `TickEvent.Pre` |
| `iiIiiIiiII` | 封包接收處理 | `PacketEvent.Receive` |
| `iiiIIiiiII` | 週期性自動化 | `TickEvent.Pre` |
| `IiiIiIiiii` | 多版本相容方塊/座標處理 | BlockPos 事件 |
| `iiIiIIIIii` | 三參數方塊操作 | `class_2338 + boolean` |
| `IIIiiiIIII` | 封包監聽 + Tick 雙重邏輯 | `PacketEvent + TickEvent` |
| `iIiIiIiiii` | Shulker 箱/物品欄自動化 | `TickEvent` |
| `IIIiiiIIII` | 斷線診斷與重連輔助 | `PacketEvent.Receive` |

---

## 相依函式庫

### 嵌入的第三方函式庫

| 套件 | 功能 |
|---|---|
| `com.seedfinding.mccore` | Minecraft 世界生成核心（RNG、種子計算、ChunkRand） |
| `com.seedfinding.mcfeature` | 結構/礦石生成特徵（Stronghold、Village、DesertPyramid 等 20+ 種） |
| `com.seedfinding.mcbiome` | 生物群系種子搜索裝置（BiomeDevice） |
| `com.seedfinding.mcmath` | 數學工具（Mth、ThreadPool） |
| `com.seedfinding.mcseed` | JRand（Java 隨機數反算） |
| `org.fusesource.hawtjni` | 原生 JNI 回呼橋（用於高效能計算） |
| `cubitect` | 地形/生物群系視覺化輔助 |

### 外部 Mod 相依（Mixin 目標，可選）

| Mod | Mixin 目標類別 | 用途 |
|---|---|---|
| **Xaero's Minimap** | `xaero.hud.minimap.*.InfoDisplayRenderer` | 座標偽裝 |
| **MiniHUD** | `fi.dy.masa.minihud.event.RenderHandler` | 座標偽裝 |
| **Baritone** | `baritone.process.MineProcess` | 礦石模擬目標注入 |

---

## Mixin 列表

| Mixin 類別 | 目標 | 功能 |
|---|---|---|
| `LivingEntityMixin` | `net.minecraft.class_1309` (LivingEntity) | 強制 `isFallFlying()` 返回 true |
| `EntityMixin` | `net.minecraft.class_1297` (Entity) | 強制衝刺狀態；阻止碰撞推動 |
| `MixinMinimap` | `xaero.hud.minimap` Renderer | 座標偽裝渲染注入 |
| `MixinRenderHandlerMinihud` | `fi.dy.masa.minihud.event.RenderHandler` | MiniHUD 座標偽裝 |
| `MineProcessMixin` | `baritone.process.MineProcess` | 礦石模擬目標列表注入 |

---

## ⚠️ 到期機制警告

```java
// 所有含 expiry check 的類別（包含主類）均有以下檢查
if (new Date().after(new Date(1773504000082L))) {
    throw new Throwable("Please update! 請更新到最新版本！");
}
// 1773504000082L ≈ 2026年3月中旬（UTC）
```

> 這意味著本 Mod **在 2026 年 3 月後將無法正常啟動**，會拋出異常並提示更新。

---

## 代碼分析限制

由於 Allatori 混淆器的影響，以下內容**無法被 CFR 完全還原**（見 `summary.txt`）：

- 多個含有 `DOLOOP`/`WHILELOOP` 混淆的方法標記為 `Unable to fully structure code`
- 字串常量全部加密，無法直接讀取模組名稱與描述
- 方法名稱統一為 `ALLATORIxDEMO`，需透過參數類型與上下文推測用途
- 常數值通過位元運算混淆（`3 >> 1` = 1、`4 ^ 5` = 1、`2 & 5` = 0 等）
