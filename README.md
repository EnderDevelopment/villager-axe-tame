# Blockling

A Minecraft mod for **NeoForge** and **Minecraft 1.20.1** that adds the **Blockling**: a new villager-like NPC that you can tame by giving it an **axe**.

## Features

- A new creature, the **Blockling**, that looks like a villager.
- **Tame the Blockling** by right-clicking it while holding an axe. The axe is consumed (not in Creative mode).
- Once tamed, the Blockling is your pet: it follows you, and right-clicking it toggles whether it sits.
- Tamed Blocklings do not despawn.
- A spawn egg (`blockling_spawn_egg`) lets you place your own Blocklings. It is found in the **Blockling** creative tab.

## Requirements

- Minecraft **1.20.1**
- NeoForge version **47.x** installed in the launcher

## Installation

1. Download and install NeoForge **47.x** for Minecraft **1.20.1**.
2. Run the game once with the NeoForge profile so the launcher creates the `mods` folder.
3. Copy the built mod jar (`blockling-<version>.jar`) into the `mods` folder.
4. Launch the game with the NeoForge profile.

## How to play

1. Grab a **Blockling Spawn Egg** from the **Blockling** creative tab (`/give @s blockling:blockling_spawn_egg`).
2. Use it to spawn a Blockling (like you would spawn any mob).
3. Hold an **axe** (wooden or better) in your hand and **right-click** the Blockling to tame it.
4. The tamed Blockling will follow you. Right-click it again to make it sit or stand.

## Building

The platform does not compile the mod here. Build it on your machine:

```bash
./gradlew build
```

The built jar appears in `build/libs/`. Place that jar in your `mods` folder (with NeoForge 47.x installed) to play.

## Notes

- The Blockling uses the vanilla villager model and texture for its appearance.
- Mod ID: `blockling`. All creative items/entities are prefixed with `blockling:`.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/5ba960fa-5edf-4086-bd75-1e3fd6dd63d0?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=5ba960fa-5edf-4086-bd75-1e3fd6dd63d0
