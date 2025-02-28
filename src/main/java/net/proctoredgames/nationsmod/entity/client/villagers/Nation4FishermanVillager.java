package net.proctoredgames.nationsmod.entity.client.villagers;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Nation4FishermanVillager extends EntityModel<VillagerEntity> {
    private final ModelPart head;
    private final ModelPart headwear;
    private final ModelPart headwear2;
    private final ModelPart rotation;
    private final ModelPart nose;
    private final ModelPart body;
    private final ModelPart pant;
    private final ModelPart body_head;
    private final ModelPart bone;
    private final ModelPart head_leave;
    private final ModelPart body_sub_4;
    private final ModelPart head_eyebrow;
    private final ModelPart body_sub_6;
    private final ModelPart eye;
    private final ModelPart body_sub_8;
    private final ModelPart fisher;
    private final ModelPart right;
    private final ModelPart left;
    private final ModelPart armR;
    private final ModelPart hammer2;
    private final ModelPart body_sub_14;
    private final ModelPart knife2;
    private final ModelPart body_sub_16;
    private final ModelPart farmer2;
    private final ModelPart armL;
    private final ModelPart arms_sub_2;
    private final ModelPart book2;
    private final ModelPart bodywear;
    private final ModelPart arms;
    private final ModelPart arms_rotation;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    public Nation4FishermanVillager(ModelPart root) {
        this.head = root.getChild("head");
        this.headwear = root.getChild("headwear");
        this.headwear2 = root.getChild("headwear2");
        this.rotation = this.headwear2.getChild("rotation");
        this.nose = root.getChild("nose");
        this.body = root.getChild("body");
        this.pant = this.body.getChild("pant");
        this.body_head = this.body.getChild("body_head");
        this.bone = this.body_head.getChild("bone");
        this.head_leave = this.body_head.getChild("head_leave");
        this.body_sub_4 = this.head_leave.getChild("body_sub_4");
        this.head_eyebrow = this.body_head.getChild("head_eyebrow");
        this.body_sub_6 = this.head_eyebrow.getChild("body_sub_6");
        this.eye = this.body_head.getChild("eye");
        this.body_sub_8 = this.eye.getChild("body_sub_8");
        this.fisher = this.body.getChild("fisher");
        this.right = this.body.getChild("right");
        this.left = this.body.getChild("left");
        this.armR = this.body.getChild("armR");
        this.hammer2 = this.armR.getChild("hammer2");
        this.body_sub_14 = this.hammer2.getChild("body_sub_14");
        this.knife2 = this.armR.getChild("knife2");
        this.body_sub_16 = this.knife2.getChild("body_sub_16");
        this.farmer2 = this.armR.getChild("farmer2");
        this.armL = this.body.getChild("armL");
        this.arms_sub_2 = this.armL.getChild("arms_sub_2");
        this.book2 = this.armL.getChild("book2");
        this.bodywear = root.getChild("bodywear");
        this.arms = root.getChild("arms");
        this.arms_rotation = this.arms.getChild("arms_rotation");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headwear = modelPartData.addChild("headwear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headwear2 = modelPartData.addChild("headwear2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rotation = headwear2.addChild("rotation", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData nose = modelPartData.addChild("nose", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 20).cuboid(-5.0F, 11.0F, -5.0F, 10.0F, 8.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData pant = body.addChild("pant", ModelPartBuilder.create().uv(44, 9).cuboid(-4.5F, 0.0F, -4.5F, 9.0F, 1.0F, 9.0F, new Dilation(0.0F))
                .uv(60, 1).cuboid(3.0F, -3.0F, -6.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(68, 0).cuboid(2.5F, -3.5F, -6.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(41, 20).cuboid(-5.0F, -9.0F, -5.0F, 10.0F, 13.0F, 10.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 19.0F, 0.0F));

        ModelPartData body_head = body.addChild("body_head", ModelPartBuilder.create().uv(31, 0).cuboid(-4.0F, -11.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.0F, -10.0F, -5.0F, 10.0F, 9.0F, 10.0F, new Dilation(0.0F))
                .uv(88, 0).cuboid(-5.0F, -12.0F, -5.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.5F))
                .uv(92, 40).cuboid(-4.5F, -13.0F, -4.5F, 9.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData bone = body_head.addChild("bone", ModelPartBuilder.create().uv(94, 22).cuboid(-8.0F, -8.0F, -0.5F, 16.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, 0.5F, -1.5708F, 0.0F, 0.0F));

        ModelPartData head_leave = body_head.addChild("head_leave", ModelPartBuilder.create().uv(17, 39).cuboid(-2.5F, -35.0F, -2.5F, 5.0F, 12.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 39).cuboid(-2.0F, -38.0F, -2.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 59).cuboid(-5.0F, -32.0F, 0.0F, 10.0F, 9.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 107).cuboid(-7.5F, -25.0F, -7.5F, 15.0F, 2.0F, 15.0F, new Dilation(0.0F))
                .uv(0, 91).cuboid(-6.5F, -26.0F, -6.5F, 13.0F, 1.0F, 13.0F, new Dilation(0.0F))
                .uv(44, 105).cuboid(-10.5F, -23.0F, -10.5F, 21.0F, 2.0F, 21.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData body_sub_4 = head_leave.addChild("body_sub_4", ModelPartBuilder.create().uv(20, 49).mirrored().cuboid(0.0F, -32.0F, -5.0F, 0.0F, 9.0F, 10.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head_eyebrow = body_head.addChild("head_eyebrow", ModelPartBuilder.create().uv(42, 10).cuboid(-5.5F, -19.0F, -6.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData body_sub_6 = head_eyebrow.addChild("body_sub_6", ModelPartBuilder.create().uv(42, 10).mirrored().cuboid(2.5F, -19.0F, -6.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData eye = body_head.addChild("eye", ModelPartBuilder.create().uv(42, 13).cuboid(-5.5F, -1.5F, -5.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

        ModelPartData body_sub_8 = eye.addChild("body_sub_8", ModelPartBuilder.create().uv(42, 13).mirrored().cuboid(3.5F, -1.5F, -5.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData fisher = body.addChild("fisher", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData right = body.addChild("right", ModelPartBuilder.create().uv(31, 22).cuboid(-6.5F, 0.0F, -2.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 20.0F, 0.0F));

        ModelPartData left = body.addChild("left", ModelPartBuilder.create().uv(31, 22).cuboid(3.5F, 0.0F, -2.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 20.0F, 0.0F));

        ModelPartData armR = body.addChild("armR", ModelPartBuilder.create().uv(82, 27).cuboid(-8.0F, 0.0F, -0.1F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(82, 35).cuboid(-7.7F, 4.0F, -1.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(82, 22).cuboid(-7.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.5F, 0.15F));

        ModelPartData hammer2 = armR.addChild("hammer2", ModelPartBuilder.create().uv(24, 80).cuboid(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.5F, 5.0F, -3.0F));

        ModelPartData body_sub_14 = hammer2.addChild("body_sub_14", ModelPartBuilder.create().uv(13, 80).mirrored().cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData knife2 = armR.addChild("knife2", ModelPartBuilder.create().uv(38, 74).cuboid(-7.0F, 4.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body_sub_16 = knife2.addChild("body_sub_16", ModelPartBuilder.create().uv(23, 68).mirrored().cuboid(-6.5F, 4.5F, -8.0F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData farmer2 = armR.addChild("farmer2", ModelPartBuilder.create().uv(36, 65).cuboid(-7.0F, 5.5F, -13.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
                .uv(62, 81).cuboid(-9.0F, 5.5F, -12.5F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.2F));

        ModelPartData armL = body.addChild("armL", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 11.5F, 0.15F));

        ModelPartData arms_sub_2 = armL.addChild("arms_sub_2", ModelPartBuilder.create().uv(82, 27).mirrored().cuboid(6.0F, 0.0F, -0.1F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(82, 35).mirrored().cuboid(5.7F, 4.0F, -1.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(82, 22).mirrored().cuboid(5.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData book2 = armL.addChild("book2", ModelPartBuilder.create().uv(42, 56).cuboid(5.3F, 2.0F, -4.0F, 1.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bodywear = modelPartData.addChild("bodywear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 11.0F, 0.0F));

        ModelPartData arms = modelPartData.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, 0.3F));

        ModelPartData arms_rotation = arms.addChild("arms_rotation", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, 0.0F));

        ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        head.render(matrices, vertices, light, overlay);
        headwear.render(matrices, vertices, light, overlay);
        headwear2.render(matrices, vertices, light, overlay);
        nose.render(matrices, vertices, light, overlay);
        body.render(matrices, vertices, light, overlay);
        bodywear.render(matrices, vertices, light, overlay);
        arms.render(matrices, vertices, light, overlay);
        right_leg.render(matrices, vertices, light, overlay);
        left_leg.render(matrices, vertices, light, overlay);
    }

    @Override
    public void setAngles(VillagerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        boolean bl = false;
        if (entity instanceof MerchantEntity) {
            bl = ((MerchantEntity)entity).getHeadRollingTimeLeft() > 0;
        }

        this.head.yaw = headYaw * (float) (Math.PI / 180.0);
        this.head.pitch = headPitch * (float) (Math.PI / 180.0);
        if (bl) {
            this.head.roll = 0.3F * MathHelper.sin(0.45F * animationProgress);
            this.head.pitch = 0.4F;
        } else {
            this.head.roll = 0.0F;
        }

        this.right_leg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance * 0.5F;
        this.left_leg.pitch = MathHelper.cos(limbAngle * 0.6662F + (float) Math.PI) * 1.4F * limbDistance * 0.5F;
        this.right_leg.yaw = 0.0F;
        this.left_leg.yaw = 0.0F;
    }
}
