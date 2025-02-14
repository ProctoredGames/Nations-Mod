package net.proctoredgames.nationsmod.entity.client.villagers;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.*;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Nation4CatVillager extends VillagerResemblingModel {
    private final ModelPart head;
    private final ModelPart headwear;
    private final ModelPart headwear2;
    private final ModelPart rotation;
    private final ModelPart nose;
    private final ModelPart body;
    private final ModelPart bone;
    private final ModelPart bonee5;
    private final ModelPart bonee6;
    private final ModelPart bone4;
    private final ModelPart headbone;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart nose2;
    private final ModelPart right;
    private final ModelPart left;
    private final ModelPart bodywear;
    private final ModelPart arms;
    private final ModelPart arms_rotation;
    private final ModelPart arms_flipped;
    private final ModelPart bone3;
    private final ModelPart arms_sub_3;
    private final ModelPart bone2;

    private final ModelPart root;
    private final ModelPart hat;
    private final ModelPart hatRim;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;
    public Nation4CatVillager(ModelPart root) {
        super(root);
        this.headwear = root.getChild("headwear");
        this.headwear2 = root.getChild("headwear2");
        this.rotation = this.headwear2.getChild("rotation");
        this.body = root.getChild("body");
        this.bone = this.body.getChild("bone");
        this.bonee5 = this.bone.getChild("bonee5");
        this.bonee6 = this.bonee5.getChild("bonee6");
        this.bone4 = this.body.getChild("bone4");
        this.headbone = this.bone4.getChild("headbone");
        this.bone5 = this.headbone.getChild("bone5");
        this.bone6 = this.headbone.getChild("bone6");
        this.nose2 = this.headbone.getChild("nose2");
        this.right = this.body.getChild("right");
        this.left = this.body.getChild("left");
        this.bodywear = root.getChild("bodywear");
        this.arms = root.getChild("arms");
        this.arms_rotation = this.arms.getChild("arms_rotation");
        this.arms_flipped = this.arms_rotation.getChild("arms_flipped");
        this.bone3 = this.arms_flipped.getChild("bone3");
        this.arms_sub_3 = this.bone3.getChild("arms_sub_3");
        this.bone2 = this.arms_rotation.getChild("bone2");

        this.root = root;
        this.head = root.getChild(EntityModelPartNames.HEAD);
        this.hat = this.head.getChild(EntityModelPartNames.HAT);
        this.hatRim = this.hat.getChild(EntityModelPartNames.HAT_RIM);
        this.nose = this.head.getChild(EntityModelPartNames.NOSE);
        this.rightLeg = root.getChild(EntityModelPartNames.RIGHT_LEG);
        this.leftLeg = root.getChild(EntityModelPartNames.LEFT_LEG);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headwear = modelPartData.addChild("headwear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headwear2 = modelPartData.addChild("headwear2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rotation = headwear2.addChild("rotation", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData nose = modelPartData.addChild(EntityModelPartNames.NOSE, ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(27, 17).cuboid(-3.0F, 7.0F, -2.0F, 6.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone = body.addChild("bone", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 16.116F, 1.067F, 0.5236F, 0.0F, 0.0F));

        ModelPartData bonee5 = bone.addChild("bonee5", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.0F, -0.25F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(-0.01F)).mirrored(false), ModelTransform.of(0.0F, 3.625F, 0.0F, 0.5236F, 0.0F, 0.0F));

        ModelPartData bonee6 = bonee5.addChild("bonee6", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.0F, -0.625F, -0.75F, 2.0F, 4.0F, 2.0F, new Dilation(-0.02F)).mirrored(false), ModelTransform.of(0.0F, 4.0F, 0.0F, 0.48F, 0.0F, 0.0F));

        ModelPartData bone4 = body.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 7.0F, 0.0F));

        ModelPartData headbone = bone4.addChild("headbone", ModelPartBuilder.create().uv(0, 5).cuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 42).cuboid(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 5.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone5 = headbone.addChild("bone5", ModelPartBuilder.create().uv(0, 31).cuboid(-0.6667F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 29).cuboid(-0.6667F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 25).cuboid(-1.6667F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.6667F, -6.5F, -0.5F));

        ModelPartData bone6 = headbone.addChild("bone6", ModelPartBuilder.create().uv(8, 31).cuboid(-1.3333F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 29).cuboid(-0.3333F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 25).cuboid(-1.3333F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.6667F, -6.5F, -0.5F));

        ModelPartData nose2 = headbone.addChild("nose2", ModelPartBuilder.create().uv(5, 20).cuboid(-2.5F, -9.0156F, -12.75F, 5.0F, 2.0F, 1.5F, new Dilation(0.0F))
                .uv(9, 20).cuboid(-0.5F, -9.1406F, -13.0F, 1.0F, 1.0F, 1.5F, new Dilation(0.0F))
                .uv(0, 20).cuboid(-1.0F, -7.0F, -12.55F, 2.0F, 1.0F, 1.5F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 8.375F));

        ModelPartData right = body.addChild("right", ModelPartBuilder.create().uv(25, 33).mirrored().cuboid(-5.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, 18.0F, 0.0F));

        ModelPartData left = body.addChild("left", ModelPartBuilder.create().uv(36, 33).cuboid(3.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 18.0F, 0.0F));

        ModelPartData bodywear = modelPartData.addChild("bodywear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData arms = modelPartData.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.5F, 0.3F));

        ModelPartData arms_rotation = arms.addChild("arms_rotation", ModelPartBuilder.create(), ModelTransform.of(0.0F, -3.0F, 0.05F, -0.7505F, 0.0F, 0.0F));

        ModelPartData arms_flipped = arms_rotation.addChild("arms_flipped", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData bone3 = arms_flipped.addChild("bone3", ModelPartBuilder.create(), ModelTransform.of(3.5F, -18.0F, 5.0F, 0.6981F, 0.3491F, 0.0F));

        ModelPartData arms_sub_3 = bone3.addChild("arms_sub_3", ModelPartBuilder.create().uv(41, 40).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone2 = arms_rotation.addChild("bone2", ModelPartBuilder.create().uv(33, 41).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 6.0F, 5.0F, 0.6981F, -0.3491F, 0.0F));

        ModelPartData right_leg = modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        ModelPartData left_leg = modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));


        ModelPartData modelPartData3 = head.addChild(
                EntityModelPartNames.HAT, ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -10.0F, -4.0F, 0.0F, 0.0F, 0.0F, new Dilation(0.51F)), ModelTransform.NONE
        );
        modelPartData3.addChild(
                EntityModelPartNames.HAT_RIM,
                ModelPartBuilder.create().uv(30, 47).cuboid(-8.0F, -8.0F, -6.0F, 0.0F, 0.0F, 0.0F),
                ModelTransform.rotation((float) (-Math.PI / 2), 0.0F, 0.0F)
        );
        head.addChild(
                EntityModelPartNames.NOSE, ModelPartBuilder.create().uv(24, 0).cuboid(-1.0F, -1.0F, -6.0F, 0.0F, 0.0F, 0.0F), ModelTransform.pivot(0.0F, -2.0F, 0.0F)
        );

        return TexturedModelData.of(modelData, 64, 64);
    }
}