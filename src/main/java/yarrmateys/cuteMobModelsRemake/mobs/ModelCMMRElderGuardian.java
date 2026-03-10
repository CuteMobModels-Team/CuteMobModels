//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.monster.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class ModelCMMRElderGuardian extends ModelBase
{
    ModelRenderer HTop;
    ModelRenderer Hair;
    ModelRenderer Head;
    ModelRenderer RHorn;
    ModelRenderer LHorn;
    ModelRenderer REar;
    ModelRenderer LEar;
    ModelRenderer Neck;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer Body;
    ModelRenderer BustTop;
    ModelRenderer BustFront;
    ModelRenderer BustBottom;
    ModelRenderer Body2;
    ModelRenderer[] Tail;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Skirt1;
    ModelRenderer Skirt2;
    ModelRenderer RLeg;
    ModelRenderer LLeg;
    public ModelRenderer bypedHead;
    public ModelRenderer bypedBody;
    public ModelRenderer bypedRightArm;
    public ModelRenderer bypedLeftArm;
    public ModelRenderer bypedRightLeg;
    public ModelRenderer bypedLeftLeg;
    public ModelRenderer bypedHeadwear;
    public ModelRenderer bypedBodyWear;
    public ModelRenderer bypedLeftArmwear;
    public ModelRenderer bypedRightArmwear;
    public ModelRenderer bypedLeftLegwear;
    public ModelRenderer bypedRightLegwear;
    public ModelRenderer bypedCape;
    public ModelRenderer[] bypedTail;
    public int heldItemLeft;
    public int heldItemRight;
    public boolean isOnLadder;
    public boolean onGround;
    public boolean inWater;
    public boolean inWater2;
    public boolean isSneak;
    public boolean aimedBow;
    private int textureWidthbyped;
    private int textureHeightbyped;
    
    public ModelCMMRElderGuardian(final float modelSize, final float offset) {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.HTop = new ModelRenderer((ModelBase)this, 0, 28)).addBox(-3.5f, -8.0f, -3.0f, 7, 1, 6);
        this.HTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HTop.setTextureSize(64, 64);
        this.HTop.mirror = true;
        this.setRotation(this.HTop, 0.0f, 0.0f, 0.0f);
        (this.Hair = new ModelRenderer((ModelBase)this, 0, 13)).addBox(-4.0f, -7.0f, -3.5f, 8, 8, 7);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.setTextureSize(64, 64);
        this.Hair.mirror = true;
        this.setRotation(this.Hair, 0.0f, 0.0f, 0.0f);
        (this.Head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-3.5f, -7.0f, -3.0f, 7, 7, 6);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.setTextureSize(64, 64);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        (this.RHorn = new ModelRenderer((ModelBase)this, 0, 37)).addBox(-5.0f, -7.5f, -1.0f, 2, 1, 1);
        this.RHorn.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.RHorn.setTextureSize(64, 64);
        this.RHorn.mirror = true;
        (this.LHorn = new ModelRenderer((ModelBase)this, 0, 35)).addBox(3.0f, -7.5f, -1.0f, 2, 1, 1);
        this.LHorn.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LHorn.setTextureSize(64, 64);
        this.LHorn.mirror = true;
        (this.REar = new ModelRenderer((ModelBase)this, 18, 56)).addBox(-5.5f, -4.0f, -1.5f, 2, 3, 1);
        this.REar.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.REar.setTextureSize(64, 64);
        this.REar.mirror = true;
        this.setRotation(this.REar, 0.0f, 0.0f, 0.0f);
        (this.LEar = new ModelRenderer((ModelBase)this, 18, 60)).addBox(3.5f, -4.0f, -1.5f, 2, 3, 1);
        this.LEar.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LEar.setTextureSize(64, 64);
        this.LEar.mirror = true;
        this.setRotation(this.LEar, 0.0f, 0.0f, 0.0f);
        (this.Neck = new ModelRenderer((ModelBase)this, 52, 47)).addBox(-1.5f, -0.5f, -1.5f, 3, 2, 3);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.setTextureSize(64, 64);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, 0.0f, 0.0f, 0.0f);
        (this.RArm = new ModelRenderer((ModelBase)this, 56, 15)).addBox(-2.0f, -1.0f, -1.0f, 2, 12, 2);
        this.RArm.setRotationPoint(-3.5f, 2.0f, 0.0f);
        this.RArm.setTextureSize(64, 64);
        this.RArm.mirror = true;
        this.setRotation(this.RArm, 0.0f, 0.0f, 0.0f);
        (this.LArm = new ModelRenderer((ModelBase)this, 32, 0)).addBox(0.0f, -1.0f, -1.0f, 2, 12, 2);
        this.LArm.setRotationPoint(3.5f, 2.0f, 0.0f);
        this.LArm.setTextureSize(64, 64);
        this.LArm.mirror = true;
        this.setRotation(this.LArm, 0.0f, 0.0f, 0.0f);
        (this.Body = new ModelRenderer((ModelBase)this, 0, 47)).addBox(-3.5f, 0.0f, -1.5f, 7, 5, 3);
        this.Body.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Body.setTextureSize(64, 64);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
        (this.BustTop = new ModelRenderer((ModelBase)this, 48, 52)).addBox(-3.0f, 0.0f, 0.0f, 6, 2, 2);
        this.BustTop.setRotationPoint(0.0f, 1.9f, -1.5f);
        this.BustTop.setTextureSize(64, 64);
        this.BustTop.mirror = true;
        this.setRotation(this.BustTop, -0.7853982f, 0.0f, 0.0f);
        (this.BustFront = new ModelRenderer((ModelBase)this, 48, 56)).addBox(-3.0f, 3.3f, -2.9f, 6, 2, 2);
        this.BustFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BustFront.setTextureSize(64, 64);
        this.BustFront.mirror = true;
        this.setRotation(this.BustFront, 0.0f, 0.0f, 0.0f);
        (this.BustBottom = new ModelRenderer((ModelBase)this, 48, 60)).addBox(-3.0f, 0.0f, 0.0f, 6, 2, 2);
        this.BustBottom.setRotationPoint(0.0f, 3.5f, -2.0f);
        this.BustBottom.setTextureSize(64, 64);
        this.BustBottom.mirror = true;
        this.setRotation(this.BustBottom, -0.4363323f, 0.0f, 0.0f);
        (this.Body2 = new ModelRenderer((ModelBase)this, 0, 55)).addBox(-3.0f, 6.0f, -1.5f, 6, 6, 3);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.setTextureSize(64, 64);
        this.Body2.mirror = true;
        this.setRotation(this.Body2, 0.0f, 0.0f, 0.0f);
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            this.Tail = new ModelRenderer[3];
            (this.Tail[0] = new ModelRenderer((ModelBase)this, 32, 15)).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 8);
            (this.Tail[1] = new ModelRenderer((ModelBase)this, 18, 36)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 7);
            this.Tail[2] = new ModelRenderer((ModelBase)this);
            this.Tail[2].setTextureOffset(0, 39).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
            this.Tail[2].setTextureOffset(28, 46).addBox(0.0f, -4.5f, 5.5f, 1, 9, 9);
            this.Body2.addChild(this.Tail[0]);
            this.Tail[0].addChild(this.Tail[1]);
            this.Tail[1].addChild(this.Tail[2]);
        }
        (this.Skirt1 = new ModelRenderer((ModelBase)this, 42, 29)).addBox(-3.5f, 0.0f, -2.0f, 7, 4, 4);
        this.Skirt1.setRotationPoint(0.0f, 9.0f, 0.0f);
        this.Skirt1.setTextureSize(64, 64);
        this.Skirt1.mirror = true;
        this.setRotation(this.Skirt1, 0.0f, 0.0f, 0.0f);
        (this.Skirt2 = new ModelRenderer((ModelBase)this, 38, 37)).addBox(-4.0f, 3.0f, -2.5f, 8, 4, 5);
        this.Skirt2.setRotationPoint(0.0f, 9.0f, 0.0f);
        this.Skirt2.setTextureSize(64, 64);
        this.Skirt2.mirror = true;
        this.setRotation(this.Skirt2, 0.0f, 0.0f, 0.0f);
        (this.RLeg = new ModelRenderer((ModelBase)this, 52, 0)).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.RLeg.setTextureSize(64, 64);
        this.RLeg.mirror = true;
        this.setRotation(this.RLeg, 0.0f, 0.0f, 0.0f);
        (this.LLeg = new ModelRenderer((ModelBase)this, 40, 0)).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LLeg.setTextureSize(64, 64);
        this.LLeg.mirror = true;
        this.setRotation(this.LLeg, 0.0f, 0.0f, 0.0f);
        this.textureWidthbyped = 64;
        this.textureHeightbyped = 64;
        (this.bypedHead = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, modelSize);
        this.bypedHead.setRotationPoint(0.0f, 0.0f + offset, 0.0f);
        this.bypedHead.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedBody = new ModelRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, modelSize);
        this.bypedBody.setRotationPoint(0.0f, 0.0f + offset, 0.0f);
        this.bypedBody.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedRightArm = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, modelSize);
        this.bypedRightArm.setRotationPoint(-5.0f, 2.0f + offset, 0.0f);
        this.bypedRightArm.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedLeftArm = new ModelRenderer((ModelBase)this, 32, 48)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, modelSize);
        this.bypedLeftArm.setRotationPoint(5.0f, 2.0f + offset, 0.0f);
        this.bypedLeftArm.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedRightLeg = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, modelSize);
        this.bypedRightLeg.setRotationPoint(-1.9f, 12.0f + offset, 0.0f);
        this.bypedRightLeg.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedLeftLeg = new ModelRenderer((ModelBase)this, 16, 48)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, modelSize);
        this.bypedLeftLeg.setRotationPoint(1.9f, 12.0f + offset, 0.0f);
        this.bypedLeftLeg.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedHeadwear = new ModelRenderer((ModelBase)this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, modelSize + 0.5f);
        this.bypedHeadwear.setRotationPoint(0.0f, 0.0f + offset, 0.0f);
        this.bypedHeadwear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedBodyWear = new ModelRenderer((ModelBase)this, 16, 32)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, modelSize + 0.25f);
        this.bypedBodyWear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bypedBodyWear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedLeftArmwear = new ModelRenderer((ModelBase)this, 48, 48)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, modelSize + 0.25f);
        this.bypedLeftArmwear.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.bypedLeftArmwear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedRightArmwear = new ModelRenderer((ModelBase)this, 40, 32)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, modelSize + 0.25f);
        this.bypedRightArmwear.setRotationPoint(-5.0f, 2.0f, 10.0f);
        this.bypedRightArmwear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedLeftLegwear = new ModelRenderer((ModelBase)this, 0, 48)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, modelSize + 0.25f);
        this.bypedLeftLegwear.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.bypedLeftLegwear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        (this.bypedRightLegwear = new ModelRenderer((ModelBase)this, 0, 32)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, modelSize + 0.25f);
        this.bypedRightLegwear.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.bypedRightLegwear.setTextureSize(this.textureWidthbyped, this.textureHeightbyped);
        if (YarrCuteMobModelsRemake.humanMobsModels) {
            this.Tail = new ModelRenderer[3];
            (this.Tail[0] = new ModelRenderer((ModelBase)this, 0, 32)).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 8);
            (this.Tail[1] = new ModelRenderer((ModelBase)this, 24, 32)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 7);
            this.Tail[2] = new ModelRenderer((ModelBase)this);
            this.Tail[2].setTextureOffset(0, 56).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
            this.Tail[2].setTextureOffset(44, 32).addBox(0.0f, -4.5f, 5.5f, 1, 9, 9);
            this.bypedBody.addChild(this.Tail[0]);
            this.Tail[0].addChild(this.Tail[1]);
            this.Tail[1].addChild(this.Tail[2]);
        }
    }
    
    public int func_178706_a() {
        return 54;
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        final EntityElderGuardian entityguardian = (EntityElderGuardian)par7Entity;
        final float f6 = par3 - entityguardian.ticksExisted;
        this.BustTop.isHidden = false;
        this.BustFront.isHidden = false;
        this.BustBottom.isHidden = false;
        final float f7 = entityguardian.getTailAnimation(f6);
        this.Tail[0].rotateAngleY = MathHelper.sin(f7) * 3.1415927f * 0.05f;
        this.Tail[0].rotationPointX = 0.0f;
        this.Tail[0].rotationPointY = 10.0f;
        this.Tail[0].rotationPointZ = 1.0f;
        this.Tail[1].rotateAngleY = MathHelper.sin(f7) * 3.1415927f * 0.1f;
        this.Tail[1].rotationPointX = 0.0f;
        this.Tail[1].rotationPointY = 0.0f;
        this.Tail[1].rotationPointZ = 7.0f;
        this.Tail[2].rotateAngleY = MathHelper.sin(f7) * 3.1415927f * 0.15f;
        this.Tail[2].rotationPointX = 0.0f;
        this.Tail[2].rotationPointY = 0.0f;
        this.Tail[2].rotationPointZ = 6.0f;
        this.Body.rotateAngleX = 0.0f;
        this.Body2.rotateAngleX = 0.0f;
        this.Head.rotateAngleY = par4 / 57.295776f;
        this.Head.rotateAngleX = par5 / 57.295776f;
        this.HTop.rotateAngleY = this.Head.rotateAngleY;
        this.HTop.rotateAngleX = this.Head.rotateAngleX;
        this.Hair.rotateAngleY = this.Head.rotateAngleY;
        this.Hair.rotateAngleX = this.Head.rotateAngleX;
        this.RHorn.rotateAngleZ = this.Head.rotateAngleZ;
        this.RHorn.rotateAngleY = this.Head.rotateAngleY;
        this.RHorn.rotateAngleX = this.Head.rotateAngleX;
        this.LHorn.rotateAngleZ = this.Head.rotateAngleZ;
        this.LHorn.rotateAngleY = this.Head.rotateAngleY;
        this.LHorn.rotateAngleX = this.Head.rotateAngleX;
        this.REar.rotateAngleY = this.Head.rotateAngleY;
        this.REar.rotateAngleX = this.Head.rotateAngleX;
        this.LEar.rotateAngleY = this.Head.rotateAngleY;
        this.LEar.rotateAngleX = this.Head.rotateAngleX;
        if (par7Entity.isInWater()) {
            this.RArm.rotateAngleX = 0.2f * MathHelper.sin(par3 * 0.2f) + 0.15f;
            this.RArm.rotateAngleZ = 0.08f * MathHelper.sin(par3 * 0.2f) + 0.35f;
            this.LArm.rotateAngleX = 0.2f * MathHelper.sin(par3 * 0.2f) + 0.15f;
            this.LArm.rotateAngleZ = -0.08f * MathHelper.sin(par3 * 0.2f) - 0.35f;
            this.RLeg.rotateAngleX = 0.25f * MathHelper.sin(par3 * 0.2f) + 0.3f;
            this.LLeg.rotateAngleX = 0.25f * MathHelper.sin(par3 * 0.2f) + 0.3f;
            this.Skirt1.rotateAngleX = 0.06f * MathHelper.sin(par3 * 0.2f) + 0.1f;
            this.Skirt2.rotateAngleX = 0.1f * MathHelper.sin(par3 * 0.2f) + 0.2f;
        }
        else if (this.isRiding) {
            this.RArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleY = 0.0f;
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par3 * 0.1f) + 0.1f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par3 * 0.1f) - 0.1f;
            final ModelRenderer rArm = this.RArm;
            rArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer lArm = this.LArm;
            lArm.rotateAngleX -= 0.62831855f;
            this.RLeg.rotateAngleX = -1.2566371f;
            this.LLeg.rotateAngleX = -1.2566371f;
            this.RLeg.rotateAngleY = 0.31415927f;
            this.LLeg.rotateAngleY = -0.31415927f;
            this.Skirt2.rotateAngleX = this.RLeg.rotateAngleX;
            this.Skirt2.rotateAngleY = 0.0f;
        }
        else {
            final float varX = -2.317994f;
            final float varY = 0.617994f;
            this.RArm.rotateAngleX = varX;
            this.LArm.rotateAngleX = varX;
            this.RArm.rotateAngleY = varY;
            this.LArm.rotateAngleY = -varY;
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par3 * 0.1f) + 0.1f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par3 * 0.1f) - 0.1f;
            this.RLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
            this.LLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
            this.RLeg.rotateAngleY = 0.0f;
            this.LLeg.rotateAngleY = 0.0f;
            this.Skirt1.rotateAngleX = 0.0f;
            this.Skirt2.rotateAngleX = 0.0f;
        }
        this.bypedHead.rotateAngleY = par4 / 57.295776f;
        this.bypedHead.rotateAngleX = par5 / 57.295776f;
        this.bypedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
        this.bypedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
        this.bypedRightArm.rotateAngleZ = 0.0f;
        this.bypedLeftArm.rotateAngleZ = 0.0f;
        this.bypedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
        this.bypedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
        this.bypedRightLeg.rotateAngleY = 0.0f;
        this.bypedLeftLeg.rotateAngleY = 0.0f;
        if (this.isRiding) {
            final ModelRenderer bypedRightArm = this.bypedRightArm;
            bypedRightArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer bypedLeftArm = this.bypedLeftArm;
            bypedLeftArm.rotateAngleX -= 0.62831855f;
            this.bypedRightLeg.rotateAngleX = -1.2566371f;
            this.bypedLeftLeg.rotateAngleX = -1.2566371f;
            this.bypedRightLeg.rotateAngleY = 0.31415927f;
            this.bypedLeftLeg.rotateAngleY = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.bypedLeftArm.rotateAngleX = this.bypedLeftArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
        }
        this.bypedRightArm.rotateAngleY = 0.0f;
        this.bypedRightArm.rotateAngleZ = 0.0f;
        switch (this.heldItemRight) {
            case 1: {
                this.bypedRightArm.rotateAngleX = this.bypedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
                break;
            }
            case 3: {
                this.bypedRightArm.rotateAngleX = this.bypedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
                this.bypedRightArm.rotateAngleY = -0.5235988f;
                break;
            }
        }
        this.bypedLeftArm.rotateAngleY = 0.0f;
        if (this.swingProgress > -9990.0f) {
            float f8 = this.swingProgress;
            this.bypedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f8) * 3.1415927f * 2.0f) * 0.2f;
            this.bypedRightArm.rotationPointZ = MathHelper.sin(this.bypedBody.rotateAngleY) * 5.0f;
            this.bypedRightArm.rotationPointX = -MathHelper.cos(this.bypedBody.rotateAngleY) * 5.0f;
            this.bypedLeftArm.rotationPointZ = -MathHelper.sin(this.bypedBody.rotateAngleY) * 5.0f;
            this.bypedLeftArm.rotationPointX = MathHelper.cos(this.bypedBody.rotateAngleY) * 5.0f;
            final ModelRenderer bypedRightArm2 = this.bypedRightArm;
            bypedRightArm2.rotateAngleY += this.bypedBody.rotateAngleY;
            final ModelRenderer bypedLeftArm2 = this.bypedLeftArm;
            bypedLeftArm2.rotateAngleY += this.bypedBody.rotateAngleY;
            final ModelRenderer bypedLeftArm3 = this.bypedLeftArm;
            bypedLeftArm3.rotateAngleX += this.bypedBody.rotateAngleY;
            f8 = 1.0f - this.swingProgress;
            f8 *= f8;
            f8 *= f8;
            f8 = 1.0f - f8;
            final float f9 = MathHelper.sin(f8 * 3.1415927f);
            final float f10 = MathHelper.sin(this.swingProgress * 3.1415927f) * -(this.bypedHead.rotateAngleX - 0.7f) * 0.75f;
            this.bypedRightArm.rotateAngleX -= (float)(f9 * 1.2 + f10);
            final ModelRenderer bypedRightArm3 = this.bypedRightArm;
            bypedRightArm3.rotateAngleY += this.bypedBody.rotateAngleY * 2.0f;
            final ModelRenderer bypedRightArm4 = this.bypedRightArm;
            bypedRightArm4.rotateAngleZ += MathHelper.sin(this.swingProgress * 3.1415927f) * -0.4f;
        }
        if (this.isSneak) {
            this.bypedBody.rotateAngleX = 0.5f;
            final ModelRenderer bypedRightArm5 = this.bypedRightArm;
            bypedRightArm5.rotateAngleX += 0.4f;
            final ModelRenderer bypedLeftArm4 = this.bypedLeftArm;
            bypedLeftArm4.rotateAngleX += 0.4f;
            this.bypedRightLeg.rotationPointZ = 4.0f;
            this.bypedLeftLeg.rotationPointZ = 4.0f;
            this.bypedRightLeg.rotationPointY = 9.0f;
            this.bypedLeftLeg.rotationPointY = 9.0f;
            this.bypedHead.rotationPointY = 1.0f;
        }
        else {
            this.bypedBody.rotateAngleX = 0.0f;
            this.bypedRightLeg.rotationPointZ = 0.1f;
            this.bypedLeftLeg.rotationPointZ = 0.1f;
            this.bypedRightLeg.rotationPointY = 12.0f;
            this.bypedLeftLeg.rotationPointY = 12.0f;
            this.bypedHead.rotationPointY = 0.0f;
        }
        final ModelRenderer bypedRightArm6 = this.bypedRightArm;
        bypedRightArm6.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedLeftArm5 = this.bypedLeftArm;
        bypedLeftArm5.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedRightArm7 = this.bypedRightArm;
        bypedRightArm7.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bypedLeftArm6 = this.bypedLeftArm;
        bypedLeftArm6.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
        if (this.aimedBow) {
            final float f11 = 0.0f;
            final float f12 = 0.0f;
            this.bypedRightArm.rotateAngleZ = 0.0f;
            this.bypedLeftArm.rotateAngleZ = 0.0f;
            this.bypedRightArm.rotateAngleY = -(0.1f - f11 * 0.6f) + this.bypedHead.rotateAngleY;
            this.bypedLeftArm.rotateAngleY = 0.1f - f11 * 0.6f + this.bypedHead.rotateAngleY + 0.4f;
            this.bypedRightArm.rotateAngleX = -1.5707964f + this.bypedHead.rotateAngleX;
            this.bypedLeftArm.rotateAngleX = -1.5707964f + this.bypedHead.rotateAngleX;
            final ModelRenderer bypedRightArm8 = this.bypedRightArm;
            bypedRightArm8.rotateAngleX -= f11 * 1.2f - f12 * 0.4f;
            final ModelRenderer bypedLeftArm7 = this.bypedLeftArm;
            bypedLeftArm7.rotateAngleX -= f11 * 1.2f - f12 * 0.4f;
            final ModelRenderer bypedRightArm9 = this.bypedRightArm;
            bypedRightArm9.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bypedLeftArm8 = this.bypedLeftArm;
            bypedLeftArm8.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bypedRightArm10 = this.bypedRightArm;
            bypedRightArm10.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
            final ModelRenderer bypedLeftArm9 = this.bypedLeftArm;
            bypedLeftArm9.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
        }
        copyModelAngles(this.bypedHead, this.bypedHeadwear);
        copyModelAngles(this.bypedBody, this.bypedBodyWear);
        copyModelAngles(this.bypedRightArm, this.bypedRightArmwear);
        copyModelAngles(this.bypedLeftArm, this.bypedLeftArmwear);
        copyModelAngles(this.bypedRightLeg, this.bypedRightLegwear);
        copyModelAngles(this.bypedLeftLeg, this.bypedLeftLegwear);
    }
    
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float scale) {
        super.render(par1Entity, par2, par3, par4, par5, par6, scale);
        this.setRotationAngles(par2, par3, par4, par5, par6, scale, par1Entity);
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            this.HTop.render(scale);
            this.Hair.render(scale);
            this.Head.render(scale);
            this.RHorn.render(scale);
            this.LHorn.render(scale);
            this.REar.render(scale);
            this.LEar.render(scale);
            this.Neck.render(scale);
            this.RArm.render(scale);
            this.LArm.render(scale);
            this.Body.render(scale);
            this.BustTop.render(scale);
            this.BustFront.render(scale);
            this.BustBottom.render(scale);
            this.Body2.render(scale);
            this.Skirt1.render(scale);
            this.Skirt2.render(scale);
            this.RLeg.render(scale);
            this.LLeg.render(scale);
        }
        else if (this.isChild) {
            final float f1 = 1.5f;
            final float f2 = 2.0f;
            GlStateManager.scale(f1 / f2, f1 / f2, f1 / f2);
            GlStateManager.translate(0.0f, 8.0f * scale, 0.0f);
            this.bypedHead.render(scale);
            this.bypedHeadwear.render(scale);
            this.bypedBody.render(scale);
            this.bypedRightArm.render(scale);
            this.bypedLeftArm.render(scale);
            this.bypedRightLeg.render(scale);
            this.bypedLeftLeg.render(scale);
        }
        else {
            if (par1Entity.isSneaking()) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.bypedHead.render(scale);
            this.bypedHeadwear.render(scale);
            this.bypedBody.render(scale);
            this.bypedRightArm.render(scale);
            this.bypedLeftArm.render(scale);
            this.bypedRightLeg.render(scale);
            this.bypedLeftLeg.render(scale);
        }
    }
    
    public void postRenderArm(final float scale, final EnumHandSide side) {
        this.getArmForSide(side).postRender(scale);
    }
    
    protected ModelRenderer getArmForSide(final EnumHandSide side) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return (side == EnumHandSide.LEFT) ? this.LArm : this.RArm;
        }
        return (side == EnumHandSide.LEFT) ? this.bypedLeftArm : this.bypedRightArm;
    }
    
    protected EnumHandSide getMainHand(final Entity par1) {
        return (par1 instanceof EntityLivingBase) ? ((EntityLivingBase)par1).getPrimaryHand() : EnumHandSide.RIGHT;
    }
}
