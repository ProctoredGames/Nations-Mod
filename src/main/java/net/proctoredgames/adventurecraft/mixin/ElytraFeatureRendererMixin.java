package net.proctoredgames.adventurecraft.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.ElytraEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.proctoredgames.adventurecraft.Adventurecraft;
import net.proctoredgames.adventurecraft.item.ModItems;
import net.proctoredgames.adventurecraft.item.custom.EmpireElytraItem;
import net.proctoredgames.adventurecraft.item.custom.EmpireEssenceItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ElytraFeatureRenderer.class)
public abstract class ElytraFeatureRendererMixin <T extends LivingEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {
    private static final Identifier SKIN = Identifier.ofVanilla("textures/entity/elytra.png");
    private ElytraEntityModel<T> elytra;

    public ElytraFeatureRendererMixin(FeatureRendererContext<T, M> context, EntityModelLoader loader) {
        super(context);
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    public void renderEmpireElytra(
            MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T livingEntity,
            float f, float g, float h, float j, float k, float l, CallbackInfo ci
    ) {
        ItemStack itemStack = livingEntity.getEquippedStack(EquipmentSlot.CHEST);
        if (itemStack.getItem() instanceof ElytraItem) {
            if (elytra == null) { // Initialize model only when needed
                elytra = new ElytraEntityModel<>(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.ELYTRA));
            }
            Identifier identifier;
            if (livingEntity instanceof AbstractClientPlayerEntity abstractClientPlayerEntity) {
                SkinTextures skinTextures = abstractClientPlayerEntity.getSkinTextures();
                if (skinTextures.elytraTexture() != null) {
                    identifier = skinTextures.elytraTexture();
                } else if (skinTextures.capeTexture() != null && abstractClientPlayerEntity.isPartVisible(PlayerModelPart.CAPE)) {
                    identifier = skinTextures.capeTexture();
                } else {
                    Item item = itemStack.getItem();
                    if(item instanceof EmpireElytraItem){
                        identifier = getSkinOfEmpire(((EmpireElytraItem) itemStack.getItem()).getEmpire());
                    } else{
                        identifier = SKIN;
                    }
                }
            } else {
                Item item = itemStack.getItem();
                if(item instanceof EmpireElytraItem){
                    identifier = getSkinOfEmpire(((EmpireElytraItem) itemStack.getItem()).getEmpire());
                } else{
                    identifier = SKIN;
                }
            }

            matrixStack.push();
            matrixStack.translate(0.0F, 0.0F, 0.125F);
            this.getContextModel().copyStateTo(this.elytra);
            this.elytra.setAngles(livingEntity, f, g, j, k, l);
            VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(
                    vertexConsumerProvider, RenderLayer.getArmorCutoutNoCull(identifier), itemStack.hasGlint()
            );
            this.elytra.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
            matrixStack.pop();
            ci.cancel(); // Cancel the original render
        }
    }

    Identifier getSkinOfEmpire(int empire){
        Identifier texture = switch (empire) {
            case 1 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_1_elytra.png");
            case 2 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_2_elytra.png");
            case 3 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_3_elytra.png");
            case 4 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_4_elytra.png");
            case 5 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_5_elytra.png");
            case 6 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_6_elytra.png");
            case 7 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_7_elytra.png");
            case 8 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_8_elytra.png");
            case 9 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/empire_9_elytra.png");
            default -> Identifier.ofVanilla("textures/entity/elytra.png");
        };
        return texture;
    }
}
