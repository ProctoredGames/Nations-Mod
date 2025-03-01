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
public class Nation4LibrarianVillager extends EntityModel<VillagerEntity> {
    private final ModelPart head;
    private final ModelPart nose;
    private final ModelPart headwear;
    private final ModelPart headwear2;
    private final ModelPart body;
    private final ModelPart bodywear;
    private final ModelPart arms;
    private final ModelPart arms_2;
    //    private final ModelPart mirrored;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    public Nation4LibrarianVillager(ModelPart root) {
        this.head = root.getChild("head");
        this.nose = root.getChild("nose");
        this.headwear = root.getChild("headwear");
        this.headwear2 = root.getChild("headwear2");
        this.body = root.getChild("body");
        this.bodywear = root.getChild("bodywear");
        this.arms = root.getChild("arms");
        this.arms_2 = root.getChild("arms_2");
//        this.mirrored = this.arms.getChild("mirrored");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 1).cuboid(-4.0F, 4.0F, -5.0F, 8.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 40).cuboid(-7.0F, 2.0F, -1.0F, 3.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 40).cuboid(4.0F, 2.0F, -1.0F, 3.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(3, 37).cuboid(-4.0F, 1.0F, -1.0F, 8.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(38, 0).cuboid(-4.0F, 1.0F, -5.0F, 8.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

        ModelPartData nose = modelPartData.addChild("nose", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData headwear = modelPartData.addChild("headwear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headwear2 = modelPartData.addChild("headwear2", ModelPartBuilder.create(), ModelTransform.of(0.0F, -2.0F, -2.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(22, 12).cuboid(-4.0F, 9.0F, -3.0F, 8.0F, 10.0F, 4.0F, new Dilation(0.0F))
                .uv(1, 16).cuboid(0.0F, 10.0F, -3.0F, 0.0F, 9.0F, 5.0F, new Dilation(0.0F))
                .uv(2, 19).cuboid(-0.01F, 15.0F, -3.0F, 0.0F, 5.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

        ModelPartData bodywear = modelPartData.addChild("bodywear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData arms = modelPartData.addChild("arms", ModelPartBuilder.create().uv(2, 10).cuboid(-4.01F, 5.5822F, 3.138F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));

        ModelPartData arms_2 = modelPartData.addChild("arms_2", ModelPartBuilder.create().uv(2, 10).cuboid(4.01F, 5.5822F, 3.138F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));

        ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(2, 13).cuboid(-2.0F, 7.0F, -1.0F, 3.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 1.0F));

        ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(2, 13).cuboid(-1.0F, 7.0F, -1.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 12.0F, 1.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        head.render(matrices, vertices, light, overlay);
        nose.render(matrices, vertices, light, overlay);
        headwear.render(matrices, vertices, light, overlay);
        headwear2.render(matrices, vertices, light, overlay);
        body.render(matrices, vertices, light, overlay);
        bodywear.render(matrices, vertices, light, overlay);
        arms.render(matrices, vertices, light, overlay);
        arms_2.render(matrices, vertices, light, overlay);
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