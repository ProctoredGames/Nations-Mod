package net.proctoredgames.nationsmod.mixin;

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
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.item.ModItems;
import net.proctoredgames.nationsmod.item.custom.NationElytraItem;
import net.proctoredgames.nationsmod.item.custom.NationEssenceItem;
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
    public void renderNationElytra(
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
                    if(item instanceof NationElytraItem){
                        identifier = getSkinOfNation(((NationElytraItem) itemStack.getItem()).getNation());
                    } else{
                        identifier = SKIN;
                    }
                }
            } else {
                Item item = itemStack.getItem();
                if(item instanceof NationElytraItem){
                    identifier = getSkinOfNation(((NationElytraItem) itemStack.getItem()).getNation());
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

    Identifier getSkinOfNation(int nation){
        Identifier texture = switch (nation) {
            case 1 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_1_elytra.png");
            case 2 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_2_elytra.png");
            case -2 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_2_demon_elytra.png");
            case 3 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_3_elytra.png");
            case 4 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_4_elytra.png");
            case 5 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_5_elytra.png");
            case 6 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_6_elytra.png");
            case 7 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_7_elytra.png");
            case 8 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_8_elytra.png");
            case 9 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_9_elytra.png");
            case 10 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/nation_10_elytra.png");
            default -> Identifier.ofVanilla("textures/entity/elytra.png");
        };
        return texture;
    }
}
