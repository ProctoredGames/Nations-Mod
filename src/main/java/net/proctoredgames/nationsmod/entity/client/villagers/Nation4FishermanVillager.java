package net.proctoredgames.nationsmod.entity.client.villagers;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.*;
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
    private final ModelPart head2;
    private final ModelPart villager;
    private final ModelPart mirror;
    private final ModelPart nose2;
    private final ModelPart left_horn;
    private final ModelPart right_horn;
    private final ModelPart necklol;
    private final ModelPart nose;
    private final ModelPart body3;
    private final ModelPart body2;
    private final ModelPart body;
    private final ModelPart leg2;
    private final ModelPart leg1;
    private final ModelPart arms2;
    private final ModelPart leg3;
    private final ModelPart leg4;
    private final ModelPart bodywear;
    private final ModelPart arms;
    private final ModelPart mirrored;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    public Nation4FishermanVillager(ModelPart root) {
        this.head = root.getChild("head");
        this.head2 = this.head.getChild("head2");
        this.villager = this.head2.getChild("villager");
        this.mirror = this.head2.getChild("mirror");
        this.nose2 = this.head2.getChild("nose2");
        this.left_horn = this.head2.getChild("left_horn");
        this.right_horn = this.head2.getChild("right_horn");
        this.necklol = this.head2.getChild("necklol");
        this.nose = root.getChild("nose");
        this.body3 = root.getChild("body3");
        this.body2 = this.body3.getChild("body2");
        this.body = this.body2.getChild("body");
        this.leg2 = this.body2.getChild("leg2");
        this.leg1 = this.body2.getChild("leg1");
        this.arms2 = this.body2.getChild("arms2");
        this.leg3 = this.arms2.getChild("leg3");
        this.leg4 = this.arms2.getChild("leg4");
        this.bodywear = root.getChild("bodywear");
        this.arms = root.getChild("arms");
        this.mirrored = this.arms.getChild("mirrored");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head2 = head.addChild("head2", ModelPartBuilder.create().uv(23, 52).cuboid(-0.5F, -7.0F, -8.0F, 0.0F, 7.0F, 5.0F, new Dilation(0.0F))
                .uv(2, 61).cuboid(-6.0F, -15.0F, -4.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 14.0F, 0.0F));

        ModelPartData villager = head2.addChild("villager", ModelPartBuilder.create(), ModelTransform.pivot(-0.5F, -14.0F, 0.0F));

        ModelPartData mirror = head2.addChild("mirror", ModelPartBuilder.create().uv(2, 61).mirrored().cuboid(2.5F, -25.0F, -4.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-0.5F, 10.0F, 0.0F));

        ModelPartData nose2 = head2.addChild("nose2", ModelPartBuilder.create().uv(34, 46).cuboid(-3.0F, -3.5208F, -0.8048F, 5.0F, 7.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, -8.0F, 0.6545F, 0.0F, 0.0F));

        ModelPartData left_horn = head2.addChild("left_horn", ModelPartBuilder.create().uv(12, 55).cuboid(-0.01F, -20.0F, -4.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_horn = head2.addChild("right_horn", ModelPartBuilder.create().uv(12, 55).cuboid(-2.99F, -20.0F, -4.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData necklol = head2.addChild("necklol", ModelPartBuilder.create().uv(8, 18).cuboid(-2.0F, -16.0F, -2.0F, 3.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, -9.0F, -0.4363F, 0.0F, 0.0F));

        ModelPartData nose = modelPartData.addChild("nose", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData body3 = modelPartData.addChild("body3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body2 = body3.addChild("body2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = body2.addChild("body", ModelPartBuilder.create().uv(0, 1).cuboid(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 13.0F, -8.0F, -1.3963F, 0.0F, 0.0F));

        ModelPartData leg2 = body2.addChild("leg2", ModelPartBuilder.create().uv(1, 0).cuboid(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 14.0F, 4.0F));

        ModelPartData leg1 = body2.addChild("leg1", ModelPartBuilder.create().uv(1, 0).mirrored().cuboid(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-3.5F, 14.0F, 4.0F));

        ModelPartData arms2 = body2.addChild("arms2", ModelPartBuilder.create(), ModelTransform.of(-3.5F, 5.0F, 2.0F, 0.2182F, 0.0F, 0.0F));

        ModelPartData leg3 = arms2.addChild("leg3", ModelPartBuilder.create().uv(37, 2).cuboid(-2.2F, 0.0F, 0.0F, 2.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

        ModelPartData leg4 = arms2.addChild("leg4", ModelPartBuilder.create().uv(36, 2).cuboid(4.2F, -0.01F, -0.3F, 2.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

        ModelPartData bodywear = modelPartData.addChild("bodywear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData arms = modelPartData.addChild("arms", ModelPartBuilder.create(), ModelTransform.of(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));

        ModelPartData mirrored = arms.addChild("mirrored", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.05F, 1.05F));

        ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        head.render(matrices, vertices, light, overlay);
        nose.render(matrices, vertices, light, overlay);
        body3.render(matrices, vertices, light, overlay);
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