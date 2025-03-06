//package net.proctoredgames.nationsmod.entity.client;
//
//import net.minecraft.client.render.OverlayTexture;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.VertexConsumerProvider;
//import net.minecraft.client.render.entity.EntityRenderer;
//import net.minecraft.client.render.entity.EntityRendererFactory;
//import net.minecraft.client.render.item.ItemRenderer;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.util.math.RotationAxis;
//
//import net.fabricmc.api.EnvType;
//import net.fabricmc.api.Environment;
//import net.minecraft.client.render.entity.model.EntityModelLayers;
//import net.minecraft.client.render.entity.model.TridentEntityModel;
//import net.minecraft.entity.projectile.TridentEntity;
//import net.proctoredgames.nationsmod.NationsMod;
//import net.proctoredgames.nationsmod.entity.custom.Nation4TridentEntity;
//
//@Environment(EnvType.CLIENT)
//public class Nation4TridentEntityRenderer extends EntityRenderer<Nation4TridentEntity> {
//    public static final Identifier TEXTURE = Identifier.of(NationsMod.MOD_ID,"textures/item/nation_4_bow.png");
//    private final TridentEntityModel model;
//
//    public Nation4TridentEntityRenderer(EntityRendererFactory.Context context) {
//        super(context);
//        this.model = new TridentEntityModel(context.getPart(EntityModelLayers.TRIDENT));
//    }
//
//    public void render(Nation4TridentEntity tridentEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
//        matrixStack.push();
//        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, tridentEntity.prevYaw, tridentEntity.getYaw()) - 90.0F));
//        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, tridentEntity.prevPitch, tridentEntity.getPitch()) + 90.0F));
//        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(
//                vertexConsumerProvider, this.model.getLayer(this.getTexture(tridentEntity)), false, tridentEntity.isEnchanted()
//        );
//        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
//        matrixStack.pop();
//        super.render(tridentEntity, f, g, matrixStack, vertexConsumerProvider, i);
//    }
//
//    public Identifier getTexture(Nation4TridentEntity tridentEntity) {
//        return TEXTURE;
//    }
//}
