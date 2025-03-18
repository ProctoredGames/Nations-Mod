package net.proctoredgames.nationsmod.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.client.render.entity.feature.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.proctoredgames.nationsmod.NationsMod;
//import net.proctoredgames.nationsmod.entity.client.villagers.Nation4ButcherVillager;
import net.proctoredgames.nationsmod.NationBased;
//import net.proctoredgames.nationsmod.entity.client.villagers.Nation4FishermanVillager;
//import net.proctoredgames.nationsmod.entity.client.villagers.Nation4LibrarianVillager;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation3Villager;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Mixin(VillagerEntityRenderer.class)
public abstract class VillagerEntityRendererMixin extends MobEntityRenderer<VillagerEntity, EntityModel<VillagerEntity>> {
    private EntityRendererFactory.Context context;
    private EntityModel<VillagerEntity> defaultModel; // Store the default model

    public VillagerEntityRendererMixin(EntityRendererFactory.Context context) {
        super(context, new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER)), 0.5F);
    }

    @Inject(method = "<init>", at = @At("TAIL"), cancellable = false)
    public void editInit(EntityRendererFactory.Context context, CallbackInfo ci) {
        this.context = context;
        this.defaultModel = this.model; // Store the default model
    }

    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void getModifiedAppearance(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
        if(villager instanceof NationBased && context != null){
            int nationNumber = ((NationBased) villager).getNation();

            if (nationNumber == 3) {
                this.model = new Nation3Villager(context.getPart(Nation3Villager.NATION_3_VILLAGER));
                this.features.clear();
                this.features.add(new VillagerHeldItemFeatureRenderer((FeatureRendererContext<VillagerEntity, EntityModel<VillagerEntity>>) this, context.getHeldItemRenderer()));
            } else {
                // Reset to the default model and features for other nations
                this.model = defaultModel;
                this.addFeature(new HeadFeatureRenderer<>((FeatureRendererContext) this, context.getModelLoader(), context.getHeldItemRenderer()));
                this.addFeature(new VillagerClothingFeatureRenderer<>((FeatureRendererContext) this, context.getResourceManager(), "villager"));
                this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
            }

            Identifier texture = switch (nationNumber) {
                case 3 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_3.png");
                case 4 -> getNation4VillagerTexture(villager.getVillagerData().getProfession(), villager.getVillagerData().getType());
                case 9 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_9.png");
                default -> Identifier.ofVanilla("textures/entity/villager/villager.png");
            };

            cir.setReturnValue(texture);
        }
    }

    public Identifier getNation4VillagerTexture(VillagerProfession profession, VillagerType type) {
        if (profession.equals(VillagerProfession.FARMER)) {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_4_farmer.png");
        } else if (profession.equals(VillagerProfession.FISHERMAN)) {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_4_fisherman.png");
        } else {
            if(type == ModVillagers.NATION_4_PINK){
                return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_4_farmer.png");
            } else {
                return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/type/nation_4_fisherman.png");
            }
        }
    }

}
