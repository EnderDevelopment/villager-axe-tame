package com.enderdevelopment.blockling;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(BlocklingMod.MOD_ID);

    public static final DeferredHolder<Item, Item> BLOCKLING_SPAWN_EGG =
            ITEMS.register("blockling_spawn_egg",
                    () -> new SpawnEggItem(ModEntities.BLOCKLING.get(), 0x8B7D6B, 0x3A6B35,
                            new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
