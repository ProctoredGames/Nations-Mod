//package net.proctoredgames.nationsmod.entity.client;
//
//import net.minecraft.client.render.OverlayTexture;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.VertexConsumerProvider;
//import net.minecraft.client.render.entity.EntityRenderer;
//import net.minecraft.client.render.entity.EntityRendererFactory;
//import net.minecraft.client.render.item.ItemRenderer;
//import net.minecraft.client.render.model.json.ModelTransformationMode;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.item.ItemStack;
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
//import net.proctoredgames.nationsmod.entity.custom.Nation2TridentEntity;
//import net.proctoredgames.nationsmod.item.ModItems;
//
//@Environment(EnvType.CLIENT)
//public class Nation2TridentEntityRenderer extends EntityRenderer<Nation2TridentEntity> {
//    private final ItemRenderer itemRenderer;
//
//    public Nation2TridentEntityRenderer(EntityRendererFactory.Context context) {
//        super(context);
//        this.itemRenderer = context.getItemRenderer();
//    }
//
//    public void render(Nation2TridentEntity entity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
//        matrixStack.push();
//        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, entity.prevYaw, entity.getYaw()) - 90.0F));
//        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, entity.prevPitch, entity.getPitch())));
//        ItemStack stack = new ItemStack(ModItems.NATION_1_TRIDENT); // Your method to get the ItemStack
//        itemRenderer.renderItem(
//                stack,
//                ModelTransformationMode.NONE,
//                i,
//                OverlayTexture.DEFAULT_UV,
//                matrixStack,
//                vertexConsumerProvider,
//                entity.getWorld(),
//                entity.getId()
//        );
//
//        matrixStack.pop();
//        super.render(entity, f, g, matrixStack, vertexConsumerProvider, i);
//    }
//
//    @Override
//    public Identifier getTexture(Nation2TridentEntity entity) {
//        return Identifier.of(NationsMod.MOD_ID, "textures/item/nation_1_trident.png"); // Can be dummy
//    }
//}