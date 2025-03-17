//package net.proctoredgames.nationsmod.entity.client.villagers;
//
//// Made with Blockbench 4.12.3
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//import net.minecraft.client.model.ModelPart;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.passive.VillagerEntity;
//
//public class Nation3Villager extends EntityModel<VillagerEntity> {
//    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//    private final ModelPart body;
//    private final ModelPart left_wing;
//    private final ModelPart bone6;
//    private final ModelPart right_wing;
//    private final ModelPart bone7;
//    private final ModelPart front_legs;
//    private final ModelPart middle_legs;
//    private final ModelPart back_legs;
//    private final ModelPart left_antenna;
//    private final ModelPart stinger;
//    private final ModelPart right_antenna;
//    private final ModelPart torso;
//    private final ModelPart bone;
//    private final ModelPart bone4;
//    private final ModelPart bone15;
//    private final ModelPart bone14;
//    private final ModelPart bone13;
//    private final ModelPart bone2;
//    private final ModelPart bone3;
//    private final ModelPart bone5;
//    private final ModelPart bone10;
//    private final ModelPart bone11;
//    private final ModelPart bone8;
//    private final ModelPart bone9;
//    private final ModelPart bone12;
//
//    public Nation3Villager(ModelPart root) {
//        this.body = root.getChild("body");
//        this.left_wing = root.getChild("left_wing");
//        this.bone6 = this.left_wing.getChild("bone6");
//        this.right_wing = root.getChild("right_wing");
//        this.bone7 = this.right_wing.getChild("bone7");
//        this.front_legs = root.getChild("front_legs");
//        this.middle_legs = root.getChild("middle_legs");
//        this.back_legs = root.getChild("back_legs");
//        this.left_antenna = root.getChild("left_antenna");
//        this.stinger = root.getChild("stinger");
//        this.right_antenna = root.getChild("right_antenna");
//        this.torso = root.getChild("torso");
//        this.bone = this.torso.getChild("bone");
//        this.bone4 = this.bone.getChild("bone4");
//        this.bone15 = this.bone4.getChild("bone15");
//        this.bone14 = this.bone4.getChild("bone14");
//        this.bone13 = this.bone4.getChild("bone13");
//        this.bone2 = this.bone.getChild("bone2");
//        this.bone3 = this.bone2.getChild("bone3");
//        this.bone5 = this.torso.getChild("bone5");
//        this.bone10 = this.torso.getChild("bone10");
//        this.bone11 = this.torso.getChild("bone11");
//        this.bone8 = this.torso.getChild("bone8");
//        this.bone9 = this.torso.getChild("bone9");
//        this.bone12 = this.torso.getChild("bone12");
//    }
//
//    public static LayerDefinition createBodyLayer() {
//        MeshDefinition meshdefinition = new MeshDefinition();
//        PartDefinition partdefinition = meshdefinition.getRoot();
//
//        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//        PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 15.0F, -3.0F));
//
//        PartDefinition bone6 = left_wing.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(24, 22).addBox(1.5F, -8.5381F, -3.1913F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 6.4F, 4.7F, 0.3927F, 0.0F, 0.0F));
//
//        PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(24, 28).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 15.0F, -3.0F));
//
//        PartDefinition bone7 = right_wing.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(30, 16).addBox(-10.5F, -9.0F, -3.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 7.0F, 4.0F, 0.3491F, 0.0F, 0.0F));
//
//        PartDefinition front_legs = partdefinition.addOrReplaceChild("front_legs", CubeListBuilder.create(), PartPose.offset(1.5F, 22.0F, -2.0F));
//
//        PartDefinition middle_legs = partdefinition.addOrReplaceChild("middle_legs", CubeListBuilder.create(), PartPose.offset(1.5F, 22.0F, 0.0F));
//
//        PartDefinition back_legs = partdefinition.addOrReplaceChild("back_legs", CubeListBuilder.create(), PartPose.offset(1.5F, 22.0F, 2.0F));
//
//        PartDefinition left_antenna = partdefinition.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(24, 41).addBox(1.5F, -13.25F, -7.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -5.0F));
//
//        PartDefinition stinger = partdefinition.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(8, 48).addBox(0.0F, 2.5F, 5.25F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
//
//        PartDefinition right_antenna = partdefinition.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(32, 41).addBox(-2.5F, -13.25F, -7.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -5.0F));
//
//        PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));
//
//        PartDefinition bone = torso.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-2.9F, -8.4217F, -5.2687F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.75F, -7.25F, -0.5672F, 0.0F, 0.0F));
//
//        PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 22).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5159F, -6.5225F, 0.7854F, 0.0F, 0.0F));
//
//        PartDefinition bone15 = bone4.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(39, 50).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8455F, 9.2259F, 0.6109F, 0.0F, 0.0F));
//
//        PartDefinition bone14 = bone4.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(36, 58).addBox(-5.25F, -6.0F, 4.25F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.0F, -2.5F, 0.0F, 0.4363F, 0.0F));
//
//        PartDefinition bone13 = bone4.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(56, 58).addBox(-3.0F, -6.0F, 3.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.75F, 0.0F, 1.25F, 0.0F, -0.4363F, 0.0F));
//
//        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -6.6654F, 4.6728F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5373F, 0.8434F, 0.1745F, 0.0F, 0.0F));
//
//        PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(40, 41).addBox(-1.0F, -1.6173F, -1.9239F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4009F, 10.6246F, 0.1745F, 0.0F, 0.0F));
//
//        PartDefinition bone5 = torso.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 34).addBox(-2.2F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
//                .texOffs(40, 45).addBox(-5.8F, 2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
//                .texOffs(12, 34).addBox(-5.7F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
//                .texOffs(46, 8).addBox(-1.3F, 2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 4.5F, -2.0F, 0.5672F, 0.0F, 0.0F));
//
//        PartDefinition bone10 = torso.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(46, 12).addBox(1.2F, -0.4401F, -3.8994F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
//                .texOffs(24, 34).addBox(0.3F, -4.4401F, -4.8994F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 4.25F, -2.0F, 0.0F, 1.5708F, 0.6545F));
//
//        PartDefinition bone11 = torso.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 48).addBox(1.2F, -0.5F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
//                .texOffs(36, 34).addBox(1.3F, -4.5F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.0F, -1.25F, 0.0F, 0.0F, -0.48F));
//
//        PartDefinition bone8 = torso.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(48, 0).addBox(1.2F, -0.5F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
//                .texOffs(0, 41).addBox(0.3F, -4.5F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 2.25F, -6.0F, -1.5708F, 1.309F, -1.1345F));
//
//        PartDefinition bone9 = torso.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(48, 4).addBox(0.7649F, -0.5432F, -3.3483F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
//                .texOffs(12, 41).addBox(0.6016F, -4.3897F, -3.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, 2.0F, -5.5F, -0.3957F, 0.1209F, -0.3558F));
//
//        PartDefinition bone12 = torso.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(32, 8).addBox(-1.5F, -6.0F, -11.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.25F, 1.75F, 0.4363F, 0.0F, 0.0F));
//
//        return LayerDefinition.create(meshdefinition, 64, 64);
//    }
//
//    @Override
//    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//    }
//
//    @Override
//    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        front_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        middle_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        back_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        left_antenna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        stinger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        right_antenna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//        torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//    }
//}