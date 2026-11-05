package com.enderdevelopment.blockling;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(BlocklingMod.MOD_ID)
public class BlocklingMod {
    public static final String MOD_ID = "blockling";

    public BlocklingMod(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        ModItemGroups.register(modEventBus);
    }
}
