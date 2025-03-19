package net.proctoredgames.nationsmod.entity.client.villagers;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Fae extends EntityModel<VillagerEntity> {
    public static final EntityModelLayer FAE = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "fae"), "main");
    private final ModelPart head;
    private final ModelPart bb_main;
    public Fae(ModelPart root) {
        this.head = root.getChild("head");
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -15.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(8, 25).cuboid(0.0F, -8.0F, 0.0F, 4.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -7.0F, -4.0F, 0.0F, -0.48F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 25).cuboid(-4.0F, -8.0F, 0.0F, 4.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -7.0F, -4.0F, 0.0F, 0.48F, 0.0F));

        ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, -8.0F, -0.0474F, 12.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -15.0F, -4.0F, -0.48F, 0.0F, 0.0F));

        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 33).cuboid(-3.0F, -17.0F, -2.0F, 6.0F, 6.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 43).cuboid(-2.0F, -11.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F))
                .uv(20, 43).cuboid(3.0F, -17.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 33).cuboid(-5.0F, -17.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(VillagerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        head.render(matrices, vertices, light, overlay);
        bb_main.render(matrices, vertices, light, overlay);
    }
}

