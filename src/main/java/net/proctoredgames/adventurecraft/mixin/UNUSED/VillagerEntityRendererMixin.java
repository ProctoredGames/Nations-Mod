//package net.proctoredgames.adventurecraft.mixin.UNUSED;
//
//import net.minecraft.client.render.entity.EntityRendererFactory;
//import net.minecraft.client.render.entity.MobEntityRenderer;
//import net.minecraft.client.render.entity.VillagerEntityRenderer;
//import net.minecraft.client.render.entity.feature.FeatureRendererContext;
//import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
//import net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer;
//import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.client.render.entity.model.EntityModelLayers;
//import net.minecraft.client.render.entity.model.VillagerResemblingModel;
//import net.minecraft.entity.passive.VillagerEntity;
//import net.minecraft.util.Identifier;
//import net.minecraft.village.VillagerProfession;
//import net.proctoredgames.adventurecraft.Adventurecraft;
//import net.proctoredgames.adventurecraft.entity.client.ModModelLayers;
//import net.proctoredgames.adventurecraft.entity.client.villagers.Empire4ButcherVillager;
//import net.proctoredgames.adventurecraft.EmpireBased;
//import net.proctoredgames.adventurecraft.entity.client.villagers.Empire4FishermanVillager;
//import net.proctoredgames.adventurecraft.entity.client.villagers.Empire4LibrarianVillager;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(VillagerEntityRenderer.class)
//public abstract class VillagerEntityRendererMixin extends MobEntityRenderer<VillagerEntity, EntityModel<VillagerEntity>> {
//    private EntityRendererFactory.Context context;
//    private int lastTextureId = 0;
//
//    public VillagerEntityRendererMixin(EntityRendererFactory.Context context) {
//        super(context, new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER)), 0.5F);
//    }
//
//    @Inject(method = "<init>", at = @At("TAIL"), cancellable = false)
//    public void editInit(EntityRendererFactory.Context context, CallbackInfo ci) {
//        this.context = context;
//    }
//
//    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
//    private void getModifiedAppearance(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
//        if(villager instanceof EmpireBased && context != null){
//            int textureId = ((EmpireBased) villager).getEmpire();
//
//            this.features.clear();
//            switch(textureId){
//                case 1:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 2:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 3:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 4:
//                    if (villager.getVillagerData().getProfession() == VillagerProfession.BUTCHER) {
//                        super.model = new Empire4ButcherVillager(context.getPart(ModModelLayers.EMPIRE_3_BUTCHER));
//                    } else if (villager.getVillagerData().getProfession() == VillagerProfession.FISHERMAN) {
//                        super.model = new Empire4FishermanVillager(context.getPart(ModModelLayers.EMPIRE_3_FISHERMAN));
//                    } else if (villager.getVillagerData().getProfession() == VillagerProfession.LIBRARIAN) {
//                        super.model = new Empire4LibrarianVillager(context.getPart(ModModelLayers.EMPIRE_3_LIBRARIAN));
//                    } else {
//                        super.model = new Empire4ButcherVillager(context.getPart(ModModelLayers.EMPIRE_3_BUTCHER));
//                    }
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 5:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 6:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 7:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 8:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                case 9:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//                default:
//                    super.model = new VillagerResemblingModel<>(context.getPart(EntityModelLayers.VILLAGER));
//                    this.addFeature(new HeadFeatureRenderer<>((FeatureRendererContext)this, context.getModelLoader(), context.getHeldItemRenderer()));
//                    this.addFeature(new VillagerClothingFeatureRenderer<>((FeatureRendererContext)this, context.getResourceManager(), "villager"));
//                    this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
//                    break;
//            }
//
//            Identifier texture = switch (textureId) {
//                case 1 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_1.png");
//                case 2 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_1.png");
//                case 3 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_1.png");
//                case 4 -> getEmpire4VillagerTexture(villager.getVillagerData().getProfession());
//                case 5 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_4.png");
//                case 6 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_5.png");
//                case 7 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_6.png");
//                case 8 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_7.png");
//                case 9 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_8.png");
//                case 10 -> Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_9.png");
//                default -> Identifier.ofVanilla("textures/entity/villager/villager.png");
//            };
//
//            cir.setReturnValue(texture);
//            lastTextureId = textureId;
//        }
//    }
//
//    public Identifier getEmpire4VillagerTexture(VillagerProfession profession) {
//        if (profession.equals(VillagerProfession.BUTCHER)) {
//            return Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_3_butcher.png");
//        } else if (profession.equals(VillagerProfession.FISHERMAN)) {
//            return Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_3_fisherman.png");
//        } else if (profession.equals(VillagerProfession.LIBRARIAN)) {
//            return Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_3_librarian.png");
//        } else {
//            return Identifier.of(Adventurecraft.MOD_ID, "textures/entity/villager/empire/empire_3_butcher.png");
//        }
//    }
//
//}
