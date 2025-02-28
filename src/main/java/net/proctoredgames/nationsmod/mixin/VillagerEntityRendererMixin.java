package net.proctoredgames.nationsmod.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4ButcherVillager;
import net.proctoredgames.nationsmod.NationBased;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4FishermanVillager;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4LibrarianVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntityRenderer.class)
public abstract class VillagerEntityRendererMixin extends MobEntityRenderer<VillagerEntity, EntityModel<VillagerEntity>> {
    private EntityRendererFactory.Context context;
    private int lastTextureId = 0;

    public VillagerEntityRendererMixin(EntityRendererFactory.Context context) {
        super(context, new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER)), 0.5F);
    }

    @Inject(method = "<init>", at = @At("TAIL"), cancellable = false)
    public void editInit(EntityRendererFactory.Context context, CallbackInfo ci) {
        this.context = context;
    }

    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void getModifiedAppearance(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
        if(villager instanceof NationBased && context != null){
            int textureId = ((NationBased) villager).getNation();

            EntityModel<VillagerEntity> oldModel = super.model;
            EntityModel<VillagerEntity> newModel;
            this.features.clear();
            switch(textureId){
                case 1:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 2:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 3:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 4:
                    if (villager.getVillagerData().getProfession() == VillagerProfession.BUTCHER) {
                        newModel = new Nation4ButcherVillager(context.getPart(ModModelLayers.NATION_4_BUTCHER));
                    } else if (villager.getVillagerData().getProfession() == VillagerProfession.FISHERMAN) {
                        newModel = new Nation4FishermanVillager(context.getPart(ModModelLayers.NATION_4_FISHERMAN));
                    } else if (villager.getVillagerData().getProfession() == VillagerProfession.LIBRARIAN) {
                        newModel = new Nation4LibrarianVillager(context.getPart(ModModelLayers.NATION_4_LIBRARIAN));
                    } else {
                        newModel = new Nation4ButcherVillager(context.getPart(ModModelLayers.NATION_4_BUTCHER));
                    }
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 5:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 6:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 7:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 8:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                case 9:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
                default:
                    newModel = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
                    this.addFeature(new HeadFeatureRenderer<>((FeatureRendererContext)this, context.getModelLoader(), context.getHeldItemRenderer()));
                    this.addFeature(new VillagerClothingFeatureRenderer<>((FeatureRendererContext)this, context.getResourceManager(), "villager"));
                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                    break;
            }
            oldModel.copyStateTo(newModel);  // or newModel.copyStateFrom(oldModel)
            super.model = newModel;

            Identifier texture = switch (textureId) {
                case 1 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_1.png");
                case 2 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_2.png");
                case 3 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_3.png");
                case 4 -> getNation4VillagerTexture(villager.getVillagerData().getProfession());
                case 5 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_5.png");
                case 6 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_6.png");
                case 7 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_7.png");
                case 8 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_8.png");
                case 9 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_9.png");
                default -> Identifier.ofVanilla("textures/entity/villager/villager.png");
            };

            cir.setReturnValue(texture);
            lastTextureId = textureId;
        }
    }

    public Identifier getNation4VillagerTexture(VillagerProfession profession) {
        if (profession.equals(VillagerProfession.BUTCHER)) {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_4_butcher.png");
        } else if (profession.equals(VillagerProfession.FISHERMAN)) {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_4_fisherman.png");
        } else if (profession.equals(VillagerProfession.LIBRARIAN)) {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_4_librarian.png");
        } else {
            return Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_4_butcher.png");
        }
    }

}
