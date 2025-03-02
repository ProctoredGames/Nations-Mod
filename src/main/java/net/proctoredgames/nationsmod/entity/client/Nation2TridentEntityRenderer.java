package net.proctoredgames.nationsmod.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.entity.projectile.TridentEntity;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.custom.Nation2TridentEntity;
import net.proctoredgames.nationsmod.item.ModItems;

@Environment(EnvType.CLIENT)
public class Nation2TridentEntityRenderer extends EntityRenderer<Nation2TridentEntity> {
    private final ItemRenderer itemRenderer;

    public Nation2TridentEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
    }

    @Override
    public void render(Nation2TridentEntity entity, float yaw, // Entity's yaw
            float tickDelta, // Partial ticks
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light
    ) {
        matrices.push();

        // Rotate to match entity motion (same as vanilla trident logic)
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(
                MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F
        ));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(
                MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch()) + 90.0F
        ));

        // Render the item model
        ItemStack stack = new ItemStack(ModItems.NATION_2_TRIDENT); // Your method to get the ItemStack
        itemRenderer.renderItem(
                stack,
                ModelTransformationMode.NONE,
                light,
                OverlayTexture.DEFAULT_UV,
                matrices,
                vertexConsumers,
                entity.getWorld(),
                entity.getId()
        );

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(Nation2TridentEntity entity) {
        return Identifier.of(NationsMod.MOD_ID, "textures/item/nation_2_trident.png"); // Can be dummy
    }
}