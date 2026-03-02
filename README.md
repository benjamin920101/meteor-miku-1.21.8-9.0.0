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

### 🔧 其他模組詳細分析

#### `IIIIiiiiIi` — **水晶/床炸 Blink 輔助（CrystalBlink / AnchorBlink）**
- 整合 Meteor 的 `Blink` 模組，在 PvP 爆炸的關鍵時機凍結封包發送（Blink）
- 監聽 `TickEvent.Pre`，搭配手持物品判斷（`class_1802.field_8233`，疑為重生錨/床）自動切換 Blink 狀態
- 支援 `KeybindSetting` 快捷鍵觸發
- 支援 3D 渲染（`Render3DEvent`）顯示 Blink 預測位置（以顏色框標記）
- 若 ElytraFly 處於 Pitch40 模式則自動停用

---

#### `IiiIIIiIiI` — **自動放水晶/快速炸（AutoCrystalPlace）**
- 整合 `Blink` 模組，在放置水晶瞬間凍結移動封包
- 監聽 `TickEvent.Pre`、`PacketEvent.Send`、`PacketEvent.Receive`（`class_2708` 登入成功封包）
- 使用 `Rotations` 強制旋轉瞄準、`BlockUtils.breakBlock()` 強制破壞方塊
- 支援 3D 渲染標記放置位置
- 自動偵測是否已進入遊戲（`class_2708` 即 `GameJoinS2CPacket`）

---

#### `IiIIIiiIiI` — **近戰攻擊距離/方向輔助（ReachAttack / DirectionalAttack）**
- 監聽 `AttackEntityEvent`（priority=100）攔截普通攻擊
- 支援 `TickEvent.Post` 後處理邏輯
- 包含方向向量計算（`class_243`，即 Vec3d），推測為強制修改攻擊方向或增加攻擊距離判定
- 物品耐久判斷（`class_1799`）、方塊合法性驗證（`class_2338`）

---

#### `iiiiIIiiii` — **斷線重連觸發輔助（DisconnectTrigger / LogoutTrap）**
- 監聽 `PacketEvent.Receive`、`PacketEvent.Send`、`TickEvent.Pre`
- 含 `class_6374`（EntityAttribute，屬性監聽）清單
- 推測功能：偵測特定屬性封包（如被攻擊、血量變化）後自動執行斷線操作或觸發指令
- 含 `onDeactivate()` 清理邏輯

---

#### `iiiIIiiiIi` — **增強 Elytra 飛行（EFly / ElytraFlyEnhanced）**
- `MagicMix.eflyenabled()` 的實際模組來源
- 監聽 `PacketEvent.Receive`（阻止 `class_2645`，即 `PlayerPositionLookS2CPacket` 位置修正封包）→ **反橡皮筋（Anti-Rubber Banding）**
- 監聽 `PlaySoundEvent` 過濾飛行音效
- `ALLATORIxDEMO()` 方法對外暴露啟用狀態供 `MagicMix` 查詢
- 連動 Mixin：使玩家在沒有鞘翅時仍被認定為 Elytra 飛行狀態

---

#### `IIIiiiIIII` — **死亡保護/自動指令（DeathProtect / AutoCommandOnDeath）**
- 監聽 `PacketEvent.Receive`，偵測 `class_2724`（即 `GameStateChangeS2CPacket`，含遊戲狀態碼，如死亡、下雨等）
- 死亡觸發後延遲 N tick 自動執行預設指令（如 `/home`、`/spawn`）
- 支援提前通知（`"死亡觸發，將在 X tick 後發送指令"`）
- 若設定啟用通知則在偵測到死亡時輸出提示訊息

---

#### `iiIiIIIIii` — **斷線自動重連（AutoReconnect Trigger）**
- 監聽 `PacketEvent.Receive`，偵測 `class_2708`（`GameJoinS2CPacket`，即進入遊戲封包）
- 偵測到封包後立即呼叫 `toggle()`，推測為一次性觸發模組（偵測到重連成功即自動關閉）

---

#### `IIIIIiIIii` — **自動死亡操作（AutoActionOnDeath）**
- 監聽 `PacketEvent.Receive`，偵測 `class_2743`（死亡/受傷相關封包）
- 僅在玩家死亡（`method_24828()`）或特定條件（持有特定物品、按鍵被按下）時觸發
- 支援條件：`field_1881`（前進鍵）、`field_1894`（後退鍵）、`field_1913`（左移鍵）、`field_1849`（右移鍵）→ 推測為移動時取消觸發

---

#### `iIIIIiIIII` — **自動物品使用（AutoItem / AutoShield）**
- `TickEvent.Pre` 驅動的自動物品使用模組
- `ALLATORIxDEMO(class_1792)` 方法進行物品合法性判斷（背包搜尋）
- `iiiIiIiiIi()` 進行物品使用後狀態重置
- 推測為自動使用盾牌、圖騰、食物等特定物品

---

#### `iIiiiIiiIi` — **自動補充（AutoReplenish）**
- 監聽 `PacketEvent.Receive`（`class_5892`，即 `ScreenHandlerSlotUpdateS2CPacket`，槽位更新封包）
- 持續追蹤背包槽位變動，在指定物品數量不足時自動從 Shulker Box 或箱子補充
- 含倒數計時器（`IiiIiIiiIi > 0`）防止重複觸發

---

#### `iIiiiIiIIi` — **自動接種/自動合成（AutoCraft / AutoEnchant）**
- `TickEvent.Pre` 驅動，含延遲計時器
- 推測根據物品耐久或數量觸發自動合成或附魔流程

---

#### `IiiiIIiiIi` — **地圖自動命名器（MapNamer）**
- 狀態機：`MapNamer.State`（`iiiiiIIiIi`、`iIIiIiiiIi`、`ALLATORIxDEMO` 等）
- 監聽 `PacketEvent.Receive`：
  - `class_2645`（`InventoryS2CPacket`，背包封包）→ 掃描背包中的地圖物品
  - `class_2855`（`ChatMessageS2CPacket`，聊天封包）→ 過濾特定前綴（`startsWith` 判斷）
  - `class_2596` / `class_2649` → 追蹤地圖 ID
- 監聽 `TickEvent.Pre` 執行命名流程
- 支援排序模式（`MapNamer.Order`），依地圖 ID 排序批次命名
- 完成後輸出進度報告（`"All maps in inventory named. Progress (x: ..., y: ...) saved"`）

---

#### `IiiIIIiIII` — **附近實體監控/自動警報（EntityAlert / ProximityAlert）**
- 依賴 `DamageUtils`、`PlayerUtils`、`Friends`、`EntityTypeListSetting`
- 監聽 `TickEvent.Post`，計算附近生命值（`method_6032()`）
- 偵測血量不足 threshold 時自動切換（`toggle()`）或觸發警報
- 支援友方排除（`Friends.get().isFriend()`）
- 整合 `AutoReconnect`：若自動重連模組啟用，觸發條件成立時自動斷線重連
- 支援圖騰計數判斷（`method_18861(class_1802.field_8288)`，即圖騰數量）

---

#### `iIiiiiiIIi` — **物品整理器（ItemSorter）**
- 狀態機：`ItemSorterModule.ProcessingState`
- `iIIIIIIIIi()` — 暫停整理狀態
- `IiiiiiiIIi()` — 重置/清理方法
- `onDeactivate()` 輸出「整理已停止」訊息並清理狀態
- 推測為自動整理背包、Shulker Box 的完整自動化流程

---

#### `iIIIIIiIiI` — **自動箱子分類（AutoSort）**
- `AutoSort.ClassificationMode` 分類模式枚舉
- `Map<class_2338, iiiiiIiIIi>` — 目標箱子位置與分類規則映射
- `Map<String, List<String>>` — 物品分類規則清單（字串名稱對應）
- `iiIIiIIiii()` — 判斷是否繁忙/完成
- 推測為掃描附近箱子，按物品類型自動分類投入

---

#### `iiIiiIiiII` — **封包分析/反作弊偵測（PacketLogger / AntiCheatBypass）**
- `PacketEvent.Receive` 監聽（CFR 無法完整還原結構）
- 包含玩家非空 null 判斷前置
- 推測為記錄或攔截特定封包（含移動封包、物品欄封包等）用於反作弊分析或繞過

---

#### `IiiIiIiiii` — **雙版本方塊操作（DualBlock / BlockInteract）**
- 包含兩個重載方法 `iiiIiIiiIi()`（無參）與 `iiiIiIiiIi(class_2338)`（帶 BlockPos）
- 推測為在不同條件下操作指定方塊座標（如右鍵方塊、破壞方塊）

---

#### `iiIiIIIIii` — **三參數方塊批次操作（BlockBatch）**
- 方法簽名：`ALLATORIxDEMO(class_2338 boolean boolean boolean)`
- 三個布林參數推測控制：是否渲染、是否發送封包、是否強制執行
- 用於批次方塊互動邏輯

---

#### `IiiiIiiiiI` — **自動行走/路徑跟隨（AutoWalk / PathFollow）**
- `MEnum.WalkMode` 枚舉（多種行走模式）
- `MEnum.WalkDirection` 枚舉（方向設定）
- 整合 `PathManagers.get().stop()` 停止路徑跟隨
- 支援跟隨目標實體（`class_304`，即 GameProfile 相關）
- `onDeactivate()` 依模式選擇停止路徑或重置計步器

---

#### `IiiIIIiIiI` — **自動放置/橋接（AutoPlace / AutoBridge）**
- 整合 `Blink` 模組協同作業（在放置瞬間凍結封包）
- 監聽 `PacketEvent.Receive`（`class_2708`）、`PacketEvent.Send`、`TickEvent.Pre`
- 使用 `Rotations`、`BlockUtils`，`class_1802`（Item 工具類）
- 支援 `class_1511`（FluidState）液體偵測，避免在液體中放置
- 包含 `class_1922`（AbstractDecorator）方塊裝飾判斷
- 3D 渲染（`Render3DEvent`）顯示放置預覽

---

#### `iIIIiIiiiI` — **掃描/偵測模組（Scanner / Detector）**
- 設定群組含「掃描」相關 Setting
- 推測為區域掃描模組（掃描特定方塊、實體或結構）

---

#### `iiiIIIiIII`（summary.txt 中）— **Shulker Box 物品獲取器（ShulkerFetcher）**
- 含雙重 tick 函數（`IIiIiIiiii()`、`IIIIiIIiII()`）
- 推測為完整的 Shulker Box 開箱、取物、關箱自動化流程的核心邏輯

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
