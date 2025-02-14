package net.proctoredgames.nationsmod.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;
import net.proctoredgames.nationsmod.entity.client.villagers.MalbiNationsCatVillagerModel;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import net.proctoredgames.nationsmod.villager.NationVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntityRenderer.class)
public abstract class VillagerEntityRendererMixin extends MobEntityRenderer<VillagerEntity, SinglePartEntityModel<VillagerEntity>> {
    private EntityRendererFactory.Context context;
    private int lastTextureId = 0;

    public VillagerEntityRendererMixin(EntityRendererFactory.Context context) {
        super(context, new MalbiNationsCatVillagerModel<>(context.getPart(EntityModelLayers.VILLAGER)), 0.5F);
    }

    @Inject(method = "<init>", at = @At("TAIL"), cancellable = false)
    public void editInit(EntityRendererFactory.Context context, CallbackInfo ci) {
        this.context = context;
    }

    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void getModifiedAppearance(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
        if(villager instanceof NationVillager && context != null){
            int textureId = ((NationVillager) villager).getNation();

            if(lastTextureId != textureId){
                this.features.clear();
                switch(textureId){
                    case 1:
                        loadNationsModel();
                        break;
                    case 2:
                        loadNationsModel();
                        break;
                    case 3:
                        loadNationsModel();
                        break;
                    case 4:
                        super.model = new MalbiNationsCatVillagerModel<>(context.getPart(ModModelLayers.NATION_4_VILLAGER));
                        this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
                        break;
                    case 5:
                        loadNationsModel();
                        break;
                    case 6:
                        loadNationsModel();
                        break;
                    case 7:
                        loadNationsModel();
                        break;
                    case 8:
                        loadNationsModel();
                        break;
                    default:
                        loadVanillaModel();
                        break;
                }
                this.model.handSwingProgress = 0;
                this.model.animateModel(villager, 0,0,0);
            }

            Identifier texture = switch (textureId) {
                case 1 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_1.png");
                case 2 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_2.png");
                case 3 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_3.png");
                case 4 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_4.png");
                case 5 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_5.png");
                case 6 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_6.png");
                case 7 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_7.png");
                case 8 -> Identifier.of(NationsMod.MOD_ID, "textures/entity/villager/nation/nation_8.png");
                default -> Identifier.ofVanilla("textures/entity/villager/villager.png");
            };

            cir.setReturnValue(texture);
            lastTextureId = textureId;
        }
    }

    private void loadVanillaModel(){
        super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
        this.addFeature(new HeadFeatureRenderer<>((FeatureRendererContext)this, context.getModelLoader(), context.getHeldItemRenderer()));
        this.addFeature(new VillagerClothingFeatureRenderer<>((FeatureRendererContext)this, context.getResourceManager(), "villager"));
        this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
    }

    private void loadNationsModel(){
        super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
        this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
    }
}
