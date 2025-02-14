package net.proctoredgames.nationsmod.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerType;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;
import net.proctoredgames.nationsmod.entity.client.villagers.MalbiNationsCatVillagerModel;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntityRenderer.class)
public class VillagerRendererMixin extends MobEntityRenderer<VillagerEntity, VillagerResemblingModel<VillagerEntity>> {

    private static final Identifier CUSTOM_TEXTURE = Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/custom_villager.png");
    private static final Identifier DEFAULT_TEXTURE = Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/villager.png");

    @Inject(method = "<init>", at = @At("TAIL"))
    public void VillagerRendererMixin(EntityRendererFactory.Context context, CallbackInfo ci) {
        super(context, new MalbiNationsCatVillagerModel<>(context.getPart(EntityModelLayers.VILLAGER)), 0.5F);
        this.addFeature(new HeadFeatureRenderer<>(this, context.getModelLoader(), context.getHeldItemRenderer()));
        this.addFeature(new VillagerClothingFeatureRenderer<>(this, context.getResourceManager(), "villager"));
        this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
    }

    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void modifyTexture(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
        VillagerType type = villager.getVillagerData().getType();

        if (type == ModVillagers.NATION_1) {
            cir.setReturnValue(CUSTOM_TEXTURE);
        } else {
            cir.setReturnValue(DEFAULT_TEXTURE);
        }
    }

    @Override
    public Identifier getTexture(VillagerEntity entity) {
        return null;
    }
}

