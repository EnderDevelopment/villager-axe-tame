package com.enderdevelopment.blockling;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlocklingMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKLING_TAB =
            CREATIVE_TABS.register("blockling",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.blockling"))
                            .icon(() -> new ItemStack(ModItems.BLOCKLING_SPAWN_EGG))
                            .displayItems((params, output) ->
                                    output.accept(ModItems.BLOCKLING_SPAWN_EGG))
                            .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_TABS.register(modEventBus);
    }
}
