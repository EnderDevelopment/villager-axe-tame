package com.enderdevelopment.blockling.client;

import com.enderdevelopment.blockling.entity.BlocklingEntity;
import net.minecraft.client.model.VillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlocklingRenderer extends MobRenderer<BlocklingEntity, VillagerModel<BlocklingEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation("textures/entity/villager/villager.png");

    public BlocklingRenderer(EntityRendererProvider.Context context) {
        super(context, new VillagerModel<>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BlocklingEntity entity) {
        return TEXTURE;
    }
}
