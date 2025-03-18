package net.proctoredgames.nationsmod.entity.client.villagers;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.VillagerEntity;

// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Nation3Villager extends EntityModel<VillagerEntity> {
    private final ModelPart body;
    private final ModelPart left_wing;
    private final ModelPart bone6;
    private final ModelPart right_wing;
    private final ModelPart bone7;
    private final ModelPart front_legs;
    private final ModelPart middle_legs;
    private final ModelPart back_legs;
    private final ModelPart left_antenna;
    private final ModelPart stinger;
    private final ModelPart right_antenna;
    private final ModelPart torso;
    private final ModelPart bone;
    private final ModelPart bone4;
    private final ModelPart bone15;
    private final ModelPart bone14;
    private final ModelPart bone13;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone5;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone12;
    public Nation3Villager(ModelPart root) {
        this.body = root.getChild("body");
        this.left_wing = this.body.getChild("left_wing");
        this.bone6 = this.left_wing.getChild("bone6");
        this.right_wing = this.body.getChild("right_wing");
        this.bone7 = this.right_wing.getChild("bone7");
        this.front_legs = this.body.getChild("front_legs");
        this.middle_legs = this.body.getChild("middle_legs");
        this.back_legs = this.body.getChild("back_legs");
        this.left_antenna = this.body.getChild("left_antenna");
        this.stinger = this.body.getChild("stinger");
        this.right_antenna = this.body.getChild("right_antenna");
        this.torso = this.body.getChild("torso");
        this.bone = this.torso.getChild("bone");
        this.bone4 = this.bone.getChild("bone4");
        this.bone15 = this.bone4.getChild("bone15");
        this.bone14 = this.bone4.getChild("bone14");
        this.bone13 = this.bone4.getChild("bone13");
        this.bone2 = this.bone.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.bone5 = this.torso.getChild("bone5");
        this.bone10 = this.torso.getChild("bone10");
        this.bone11 = this.torso.getChild("bone11");
        this.bone8 = this.torso.getChild("bone8");
        this.bone9 = this.torso.getChild("bone9");
        this.bone12 = this.torso.getChild("bone12");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData left_wing = body.addChild("left_wing", ModelPartBuilder.create().uv(0, 16).cuboid(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 15.0F, -3.0F));

        ModelPartData bone6 = left_wing.addChild("bone6", ModelPartBuilder.create().uv(24, 22).cuboid(1.5F, -8.5381F, -3.1913F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 6.4F, 4.7F, 0.3927F, 0.0F, 0.0F));

        ModelPartData right_wing = body.addChild("right_wing", ModelPartBuilder.create().uv(24, 28).cuboid(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 15.0F, -3.0F));

        ModelPartData bone7 = right_wing.addChild("bone7", ModelPartBuilder.create().uv(30, 16).cuboid(-10.5F, -9.0F, -3.0F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 7.0F, 4.0F, 0.3491F, 0.0F, 0.0F));

        ModelPartData front_legs = body.addChild("front_legs", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 22.0F, -2.0F));

        ModelPartData middle_legs = body.addChild("middle_legs", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 22.0F, 0.0F));

        ModelPartData back_legs = body.addChild("back_legs", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 22.0F, 2.0F));

        ModelPartData left_antenna = body.addChild("left_antenna", ModelPartBuilder.create().uv(24, 41).cuboid(1.5F, -13.25F, -7.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, -5.0F));

        ModelPartData stinger = body.addChild("stinger", ModelPartBuilder.create().uv(8, 48).cuboid(0.0F, 2.5F, 5.25F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 19.0F, 0.0F));

        ModelPartData right_antenna = body.addChild("right_antenna", ModelPartBuilder.create().uv(32, 41).cuboid(-2.5F, -13.25F, -7.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, -5.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.0F, 0.0F));

        ModelPartData bone = torso.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-2.9F, -8.4217F, -5.2687F, 6.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.75F, -7.25F, -0.5672F, 0.0F, 0.0F));

        ModelPartData bone4 = bone.addChild("bone4", ModelPartBuilder.create().uv(0, 22).cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.5159F, -6.5225F, 0.7854F, 0.0F, 0.0F));

        ModelPartData bone15 = bone4.addChild("bone15", ModelPartBuilder.create().uv(39, 50).cuboid(-3.0F, -7.0F, -3.0F, 6.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.8455F, 9.2259F, 0.6109F, 0.0F, 0.0F));

        ModelPartData bone14 = bone4.addChild("bone14", ModelPartBuilder.create().uv(36, 58).cuboid(-5.25F, -6.0F, 4.25F, 2.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.75F, 0.0F, -2.5F, 0.0F, 0.4363F, 0.0F));

        ModelPartData bone13 = bone4.addChild("bone13", ModelPartBuilder.create().uv(56, 58).cuboid(-3.0F, -6.0F, 3.0F, 2.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.75F, 0.0F, 1.25F, 0.0F, -0.4363F, 0.0F));

        ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, -6.6654F, 4.6728F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5373F, 0.8434F, 0.1745F, 0.0F, 0.0F));

        ModelPartData bone3 = bone2.addChild("bone3", ModelPartBuilder.create().uv(40, 41).cuboid(-1.0F, -1.6173F, -1.9239F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.4009F, 10.6246F, 0.1745F, 0.0F, 0.0F));

        ModelPartData bone5 = torso.addChild("bone5", ModelPartBuilder.create().uv(0, 34).cuboid(-2.2F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
                .uv(40, 45).cuboid(-5.8F, 2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 34).cuboid(-5.7F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
                .uv(46, 8).cuboid(-1.3F, 2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 4.5F, -2.0F, 0.5672F, 0.0F, 0.0F));

        ModelPartData bone10 = torso.addChild("bone10", ModelPartBuilder.create().uv(46, 12).cuboid(1.2F, -0.4401F, -3.8994F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(24, 34).cuboid(0.3F, -4.4401F, -4.8994F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.25F, 4.25F, -2.0F, 0.0F, 1.5708F, 0.6545F));

        ModelPartData bone11 = torso.addChild("bone11", ModelPartBuilder.create().uv(0, 48).cuboid(1.2F, -0.5F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(36, 34).cuboid(1.3F, -4.5F, -4.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 4.0F, -1.25F, 0.0F, 0.0F, -0.48F));

        ModelPartData bone8 = torso.addChild("bone8", ModelPartBuilder.create().uv(48, 0).cuboid(1.2F, -0.5F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 41).cuboid(0.3F, -4.5F, -4.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 2.25F, -6.0F, -1.5708F, 1.309F, -1.1345F));

        ModelPartData bone9 = torso.addChild("bone9", ModelPartBuilder.create().uv(48, 4).cuboid(0.7649F, -0.5432F, -3.3483F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 41).cuboid(0.6016F, -4.3897F, -3.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.75F, 2.0F, -5.5F, -0.3957F, 0.1209F, -0.3558F));

        ModelPartData bone12 = torso.addChild("bone12", ModelPartBuilder.create().uv(32, 8).cuboid(-1.5F, -6.0F, -11.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.25F, 1.75F, 0.4363F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(VillagerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        body.render(matrices, vertices, light, overlay);
        left_wing.render(matrices, vertices, light, overlay);
        right_wing.render(matrices, vertices, light, overlay);
        front_legs.render(matrices, vertices, light, overlay);
        middle_legs.render(matrices, vertices, light, overlay);
        back_legs.render(matrices, vertices, light, overlay);
        left_antenna.render(matrices, vertices, light, overlay);
        stinger.render(matrices, vertices, light, overlay);
        right_antenna.render(matrices, vertices, light, overlay);
        torso.render(matrices, vertices, light, overlay);
    }
}