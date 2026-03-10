//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;

@SideOnly(Side.CLIENT)
public class ModelCMMRSkeleton extends ModelBase
{
    ModelRenderer Hat2;
    ModelRenderer Hat1;
    ModelRenderer Hair;
    ModelRenderer BHair;
    ModelRenderer RHair;
    ModelRenderer LHair;
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer Body;
    ModelRenderer BustTop;
    ModelRenderer BustFront;
    ModelRenderer BustBottom;
    ModelRenderer Body2;
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
    public static boolean getTarget;
    
    public ModelCMMRSkeleton(final float modelSize, final float offset) {
        this.heldItemLeft = 0;
        this.heldItemRight = 0;
        this.isSneak = false;
        this.aimedBow = YarrCuteMobModelsRemake.SkeletonAimedBow;
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.Hat2 = new ModelRenderer((ModelBase)this, 38, 37)).addBox(-3.5f, -10.0f, -3.0f, 7, 1, 6);
        this.Hat2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hat2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hat2.mirror = true;
        this.setRotation(this.Hat2, 0.0f, 0.0f, 0.0f);
        (this.Hat1 = new ModelRenderer((ModelBase)this, 0, 26)).addBox(-4.0f, -9.0f, -3.5f, 8, 3, 7);
        this.Hat1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hat1.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hat1.mirror = true;
        this.setRotation(this.Hat1, 0.0f, 0.0f, 0.0f);
        (this.Hair = new ModelRenderer((ModelBase)this, 0, 12)).addBox(-4.0f, -6.0f, -3.5f, 8, 7, 7);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hair.mirror = true;
        this.setRotation(this.Hair, 0.0f, 0.0f, 0.0f);
        (this.BHair = new ModelRenderer((ModelBase)this, 0, 36)).addBox(-4.0f, 0.2f, 2.4f, 8, 10, 1);
        this.BHair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BHair.setTextureSize(this.textureWidth, this.textureHeight);
        this.BHair.mirror = true;
        this.setRotation(this.BHair, 0.1745329f, 0.0f, 0.0f);
        (this.RHair = new ModelRenderer((ModelBase)this, 18, 36)).addBox(1.0f, 0.0f, 1.3f, 2, 10, 1);
        this.RHair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.RHair.setTextureSize(this.textureWidth, this.textureHeight);
        this.RHair.mirror = true;
        this.setRotation(this.RHair, 0.1745329f, 0.0f, -0.0698132f);
        (this.LHair = new ModelRenderer((ModelBase)this, 24, 36)).addBox(-3.0f, 0.0f, 1.3f, 2, 10, 1);
        this.LHair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LHair.setTextureSize(this.textureWidth, this.textureHeight);
        this.LHair.mirror = true;
        this.setRotation(this.LHair, 0.1745329f, 0.0f, 0.0698132f);
        (this.Head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-3.5f, -6.0f, -3.0f, 7, 6, 6);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.setTextureSize(this.textureWidth, this.textureHeight);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        (this.Neck = new ModelRenderer((ModelBase)this, 52, 47)).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.setTextureSize(this.textureWidth, this.textureHeight);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, 0.0f, 0.0f, 0.0f);
        (this.RArm = new ModelRenderer((ModelBase)this, 36, 0)).addBox(-2.0f, -1.0f, -1.0f, 2, 12, 2);
        this.RArm.setRotationPoint(-3.5f, 2.0f, 0.0f);
        this.RArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.RArm.mirror = true;
        this.setRotation(this.RArm, 0.0f, 0.0f, 0.0f);
        (this.LArm = new ModelRenderer((ModelBase)this, 44, 0)).addBox(0.0f, -1.0f, -1.0f, 2, 12, 2);
        this.LArm.setRotationPoint(3.5f, 2.0f, 0.0f);
        this.LArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.LArm.mirror = true;
        this.setRotation(this.LArm, 0.0f, 0.0f, 0.0f);
        (this.Body = new ModelRenderer((ModelBase)this, 0, 47)).addBox(-3.5f, 0.0f, -1.5f, 7, 5, 3);
        this.Body.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Body.setTextureSize(this.textureWidth, this.textureHeight);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
        (this.BustTop = new ModelRenderer((ModelBase)this, 48, 52)).addBox(-3.0f, 0.0f, 0.0f, 6, 2, 2);
        this.BustTop.setRotationPoint(0.0f, 1.9f, -1.5f);
        this.BustTop.setTextureSize(this.textureWidth, this.textureHeight);
        this.BustTop.mirror = true;
        this.setRotation(this.BustTop, -0.7853982f, 0.0f, 0.0f);
        (this.BustFront = new ModelRenderer((ModelBase)this, 48, 56)).addBox(-3.0f, 3.3f, -2.9f, 6, 2, 2);
        this.BustFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BustFront.setTextureSize(this.textureWidth, this.textureHeight);
        this.BustFront.mirror = true;
        this.setRotation(this.BustFront, 0.0f, 0.0f, 0.0f);
        (this.BustBottom = new ModelRenderer((ModelBase)this, 48, 60)).addBox(-3.0f, 0.0f, 0.0f, 6, 2, 2);
        this.BustBottom.setRotationPoint(0.0f, 3.5f, -2.0f);
        this.BustBottom.setTextureSize(this.textureWidth, this.textureHeight);
        this.BustBottom.mirror = true;
        this.setRotation(this.BustBottom, -0.4363323f, 0.0f, 0.0f);
        (this.Body2 = new ModelRenderer((ModelBase)this, 0, 55)).addBox(-3.0f, 6.0f, -1.5f, 6, 6, 3);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Body2.mirror = true;
        this.setRotation(this.Body2, 0.0f, 0.0f, 0.0f);
        (this.Skirt2 = new ModelRenderer((ModelBase)this, 42, 30)).addBox(-3.5f, 0.0f, -2.0f, 7, 3, 4);
        this.Skirt2.setRotationPoint(0.0f, 10.0f, 0.0f);
        this.Skirt2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Skirt2.mirror = true;
        this.setRotation(this.Skirt2, 0.0f, 0.0f, 0.0f);
        (this.RLeg = new ModelRenderer((ModelBase)this, 52, 0)).addBox(-1.5f, -1.0f, -1.5f, 3, 11, 3);
        this.RLeg.setRotationPoint(-2.0f, 14.0f, 0.0f);
        this.RLeg.setTextureSize(this.textureWidth, this.textureHeight);
        this.RLeg.mirror = true;
        this.setRotation(this.RLeg, 0.0f, 0.0f, 0.0f);
        (this.LLeg = new ModelRenderer((ModelBase)this, 52, 14)).addBox(-1.5f, -1.0f, -1.5f, 3, 11, 3);
        this.LLeg.setRotationPoint(2.0f, 14.0f, 0.0f);
        this.LLeg.setTextureSize(this.textureWidth, this.textureHeight);
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
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setLivingAnimations(final EntityLivingBase par1EntityLivingBase, final float par2, final float par3, final float par4) {
        final ItemStack itemstack = par1EntityLivingBase.getHeldItem(EnumHand.MAIN_HAND);
        if (itemstack != null) {
            if (itemstack.getItem() == Items.BOW) {
                this.aimedBow = true;
            }
            else {
                this.aimedBow = false;
            }
        }
        super.setLivingAnimations(par1EntityLivingBase, par2, par3, par4);
    }
    
    public void setRotationAngles(final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, final Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        final ItemStack itemstack = ((EntityLivingBase)entityIn).getHeldItem(EnumHand.MAIN_HAND);
        this.Head.rotateAngleY = netHeadYaw / 57.295776f;
        this.Head.rotateAngleX = headPitch / 57.295776f;
        this.Hat2.rotateAngleY = this.Head.rotateAngleY;
        this.Hat2.rotateAngleX = this.Head.rotateAngleX;
        this.Hat1.rotateAngleY = this.Head.rotateAngleY;
        this.Hat1.rotateAngleX = this.Head.rotateAngleX;
        this.Hair.rotateAngleY = this.Head.rotateAngleY;
        this.Hair.rotateAngleX = this.Head.rotateAngleX;
        this.RHair.rotateAngleY = this.Head.rotateAngleY;
        this.RHair.rotateAngleX = 0.1745329f + this.Head.rotateAngleX;
        this.RHair.rotateAngleZ = -0.0698132f;
        this.LHair.rotateAngleY = this.Head.rotateAngleY;
        this.LHair.rotateAngleX = 0.1745329f + this.Head.rotateAngleX;
        this.LHair.rotateAngleZ = 0.0698132f;
        this.BHair.rotateAngleY = this.Head.rotateAngleY / 1.25f;
        this.BHair.rotateAngleX = 0.1745329f;
        this.Neck.rotateAngleY = this.Head.rotateAngleY / 2.0f;
        this.Neck.rotateAngleY = this.Head.rotateAngleY / 2.0f;
        this.LArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 0.5f * limbSwingAmount;
        this.LArm.rotateAngleY = 0.0f;
        this.LArm.rotateAngleZ = -0.1f;
        final ModelRenderer lArm = this.LArm;
        lArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
        this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 0.5f * limbSwingAmount;
        this.RArm.rotateAngleY = 0.0f;
        this.RArm.rotateAngleZ = 0.1f;
        final ModelRenderer rArm = this.RArm;
        rArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
        this.RLeg.rotateAngleY = 0.0f;
        this.LLeg.rotateAngleY = 0.0f;
        this.RLeg.offsetY = 0.0f;
        this.LLeg.offsetY = 0.0f;
        if ((entityIn.onGround && !this.isOnLadder) || entityIn.isInWater() || this.isRiding) {
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(ageInTicks * 0.1f) + 0.1f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(ageInTicks * 0.1f) - 0.1f;
            this.RArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleY = 0.0f;
        }
        else {
            final float varX = -2.317994f;
            final float varY = 0.617994f;
            this.RArm.rotateAngleX = varX;
            this.RArm.rotateAngleY = varY;
            this.LArm.rotateAngleX = varX;
            this.LArm.rotateAngleY = -varY;
        }
        if (this.isRiding) {
            this.RLeg.rotateAngleX = -1.2566371f;
            this.LLeg.rotateAngleX = -1.2566371f;
            this.RLeg.rotateAngleY = 0.31415927f;
            this.LLeg.rotateAngleY = -0.31415927f;
            this.RLeg.offsetY = -0.15f;
            this.LLeg.offsetY = -0.15f;
        }
        if (this.heldItemLeft != 0) {
            this.LArm.rotateAngleX = this.LArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
        }
        if (this.heldItemRight != 0) {
            this.RArm.rotateAngleX = this.RArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
        }
        if (itemstack != null && itemstack.getItem() == Items.BOW && YarrCuteMobModelsRemake.SkeletonAimedBow) {
            final float var9 = 0.0f;
            final float var10 = 0.0f;
            this.RArm.rotateAngleZ = 0.0f;
            this.LArm.rotateAngleZ = 0.0f;
            this.RArm.rotateAngleY = -(0.1f - var9 * 0.6f) + this.Head.rotateAngleY;
            this.LArm.rotateAngleY = 0.1f - var9 * 0.6f + this.Head.rotateAngleY + 0.4f;
            this.RArm.rotateAngleX = -1.5707964f + this.Head.rotateAngleX;
            this.LArm.rotateAngleX = -1.5707964f + this.Head.rotateAngleX;
            final ModelRenderer rArm2 = this.RArm;
            rArm2.rotateAngleX -= var9 * 1.2f - var10 * 0.4f;
            final ModelRenderer lArm2 = this.LArm;
            lArm2.rotateAngleX -= var9 * 1.2f - var10 * 0.4f;
            final ModelRenderer rArm3 = this.RArm;
            rArm3.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer lArm3 = this.LArm;
            lArm3.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer rArm4 = this.RArm;
            rArm4.rotateAngleX += MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
            final ModelRenderer lArm4 = this.LArm;
            lArm4.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
        }
        else {
            this.LArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 0.6f * limbSwingAmount;
            this.LArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(ageInTicks * 0.1f) - 0.1f;
            this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 0.6f * limbSwingAmount;
            this.RArm.rotateAngleY = 0.0f;
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(ageInTicks * 0.1f) + 0.1f;
        }
        this.bypedHead.rotateAngleY = netHeadYaw / 57.295776f;
        this.bypedHead.rotateAngleX = headPitch / 57.295776f;
        this.bypedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
        this.bypedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
        this.bypedRightArm.rotateAngleZ = 0.0f;
        this.bypedLeftArm.rotateAngleZ = 0.0f;
        this.bypedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
        this.bypedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
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
            float f = this.swingProgress;
            this.bypedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f) * 3.1415927f * 2.0f) * 0.2f;
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
            f = 1.0f - this.swingProgress;
            f *= f;
            f *= f;
            f = 1.0f - f;
            final float f2 = MathHelper.sin(f * 3.1415927f);
            final float f3 = MathHelper.sin(this.swingProgress * 3.1415927f) * -(this.bypedHead.rotateAngleX - 0.7f) * 0.75f;
            this.bypedRightArm.rotateAngleX -= (float)(f2 * 1.2 + f3);
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
        bypedRightArm6.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedLeftArm5 = this.bypedLeftArm;
        bypedLeftArm5.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedRightArm7 = this.bypedRightArm;
        bypedRightArm7.rotateAngleX += MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
        final ModelRenderer bypedLeftArm6 = this.bypedLeftArm;
        bypedLeftArm6.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
        if (this.aimedBow) {
            final float f4 = 0.0f;
            final float f5 = 0.0f;
            this.bypedRightArm.rotateAngleZ = 0.0f;
            this.bypedLeftArm.rotateAngleZ = 0.0f;
            this.bypedRightArm.rotateAngleY = -(0.1f - f4 * 0.6f) + this.bypedHead.rotateAngleY;
            this.bypedLeftArm.rotateAngleY = 0.1f - f4 * 0.6f + this.bypedHead.rotateAngleY + 0.4f;
            this.bypedRightArm.rotateAngleX = -1.5707964f + this.bypedHead.rotateAngleX;
            this.bypedLeftArm.rotateAngleX = -1.5707964f + this.bypedHead.rotateAngleX;
            final ModelRenderer bypedRightArm8 = this.bypedRightArm;
            bypedRightArm8.rotateAngleX -= f4 * 1.2f - f5 * 0.4f;
            final ModelRenderer bypedLeftArm7 = this.bypedLeftArm;
            bypedLeftArm7.rotateAngleX -= f4 * 1.2f - f5 * 0.4f;
            final ModelRenderer bypedRightArm9 = this.bypedRightArm;
            bypedRightArm9.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bypedLeftArm8 = this.bypedLeftArm;
            bypedLeftArm8.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bypedRightArm10 = this.bypedRightArm;
            bypedRightArm10.rotateAngleX += MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
            final ModelRenderer bypedLeftArm9 = this.bypedLeftArm;
            bypedLeftArm9.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
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
            this.Hat2.render(scale);
            this.Hat1.render(scale);
            this.Hair.render(scale);
            this.BHair.render(scale);
            this.RHair.render(scale);
            this.LHair.render(scale);
            this.Head.render(scale);
            this.Neck.render(scale);
            this.RArm.render(scale);
            this.LArm.render(scale);
            this.Body.render(scale);
            this.BustTop.render(scale);
            this.BustFront.render(scale);
            this.BustBottom.render(scale);
            this.Body2.render(scale);
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
            this.bypedBodyWear.render(scale);
            this.bypedLeftArmwear.render(scale);
            this.bypedRightArmwear.render(scale);
            this.bypedLeftLegwear.render(scale);
            this.bypedRightLegwear.render(scale);
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
            this.bypedBodyWear.render(scale);
            this.bypedLeftArmwear.render(scale);
            this.bypedRightArmwear.render(scale);
            this.bypedLeftLegwear.render(scale);
            this.bypedRightLegwear.render(scale);
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
