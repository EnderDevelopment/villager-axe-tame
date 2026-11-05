package com.enderdevelopment.blockling;

import com.enderdevelopment.blockling.entity.BlocklingEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, BlocklingMod.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<BlocklingEntity>> BLOCKLING =
            ENTITY_TYPES.register("blockling",
                    () -> EntityType.Builder.of(BlocklingEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.95f)
                            .build(BlocklingMod.MOD_ID + ":blockling"));

    public static void register(IEventBus modEventBus) {
        ENTITY_TYPES.register(modEventBus);
        modEventBus.addListener(ModEntities::registerAttributes);
    }

    private static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BLOCKLING.get(), BlocklingEntity.createBlocklingAttributes().build());
    }
}
