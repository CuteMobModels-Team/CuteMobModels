//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;

@SideOnly(Side.CLIENT)
public class ModelCMMRSpider extends ModelBase
{
    ModelRenderer HTop;
    ModelRenderer REye;
    ModelRenderer LEye;
    ModelRenderer Hair;
    ModelRenderer Ponytail;
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer RArm;
    ModelRenderer RArm2;
    ModelRenderer LArm;
    ModelRenderer LArm2;
    ModelRenderer Body;
    ModelRenderer Body2;
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
    
    public ModelCMMRSpider(final float modelSize, final float offset) {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.HTop = new ModelRenderer((ModelBase)this, 0, 28)).addBox(-3.5f, -8.0f, -3.0f, 7, 1, 6);
        this.HTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HTop.setTextureSize(this.textureWidth, this.textureHeight);
        this.HTop.mirror = true;
        this.setRotation(this.HTop, 0.0f, 0.0f, 0.0f);
        (this.REye = new ModelRenderer((ModelBase)this, 26, 0)).addBox(-3.0f, -9.0f, -2.0f, 2, 1, 1);
        this.REye.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.REye.setTextureSize(this.textureWidth, this.textureHeight);
        this.REye.mirror = true;
        this.setRotation(this.REye, 0.0f, 0.0f, 0.0f);
        (this.LEye = new ModelRenderer((ModelBase)this, 26, 2)).addBox(1.0f, -9.0f, -2.0f, 2, 1, 1);
        this.LEye.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LEye.setTextureSize(this.textureWidth, this.textureHeight);
        this.LEye.mirror = true;
        this.setRotation(this.LEye, 0.0f, 0.0f, 0.0f);
        (this.Hair = new ModelRenderer((ModelBase)this, 0, 13)).addBox(-4.0f, -7.0f, -3.5f, 8, 8, 7);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hair.mirror = true;
        this.setRotation(this.Hair, 0.0f, 0.0f, 0.0f);
        (this.Ponytail = new ModelRenderer((ModelBase)this, 20, 39)).addBox(-1.5f, -9.0f, 3.0f, 3, 22, 3);
        this.Ponytail.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Ponytail.setTextureSize(this.textureWidth, this.textureHeight);
        this.Ponytail.mirror = true;
        this.setRotation(this.Ponytail, 0.0f, 0.0f, 0.0f);
        (this.Head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-3.5f, -7.0f, -3.0f, 7, 7, 6);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.setTextureSize(this.textureWidth, this.textureHeight);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        (this.Neck = new ModelRenderer((ModelBase)this, 0, 35)).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.setTextureSize(this.textureWidth, this.textureHeight);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, 0.0f, 0.0f, 0.0f);
        (this.RArm = new ModelRenderer((ModelBase)this, 36, 0)).addBox(-2.0f, -1.0f, -1.0f, 2, 12, 2);
        this.RArm.setRotationPoint(-3.5f, 2.0f, 0.0f);
        this.RArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.RArm.mirror = true;
        this.setRotation(this.RArm, 0.0f, 0.0f, 0.0f);
        (this.RArm2 = new ModelRenderer((ModelBase)this, 40, 22)).addBox(-2.5f, 5.0f, -1.5f, 3, 5, 3);
        this.RArm2.setRotationPoint(-3.5f, 2.0f, 0.0f);
        this.RArm2.setTextureSize(this.textureWidth, this.textureHeight);
        this.RArm2.mirror = true;
        this.setRotation(this.RArm2, 0.0f, 0.0f, 0.0f);
        (this.LArm = new ModelRenderer((ModelBase)this, 44, 0)).addBox(0.0f, -1.0f, -1.0f, 2, 12, 2);
        this.LArm.setRotationPoint(3.5f, 2.0f, 0.0f);
        this.LArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.LArm.mirror = true;
        this.setRotation(this.LArm, 0.0f, 0.0f, 0.0f);
        (this.LArm2 = new ModelRenderer((ModelBase)this, 40, 14)).addBox(-0.5f, 5.0f, -1.5f, 3, 5, 3);
        this.LArm2.setRotationPoint(3.5f, 2.0f, 0.0f);
        this.LArm2.setTextureSize(this.textureWidth, this.textureHeight);
        this.LArm2.mirror = true;
        this.setRotation(this.LArm2, 0.0f, 0.0f, 0.0f);
        (this.Body = new ModelRenderer((ModelBase)this, 0, 47)).addBox(-3.5f, 0.0f, -1.5f, 7, 5, 3);
        this.Body.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Body.setTextureSize(this.textureWidth, this.textureHeight);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
        (this.Body2 = new ModelRenderer((ModelBase)this, 0, 55)).addBox(-3.0f, 6.0f, -1.5f, 6, 6, 3);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Body2.mirror = true;
        this.setRotation(this.Body2, 0.0f, 0.0f, 0.0f);
        (this.Skirt1 = new ModelRenderer((ModelBase)this, 42, 30)).addBox(-3.5f, 0.0f, -2.0f, 7, 2, 4);
        this.Skirt1.setRotationPoint(0.0f, 10.0f, 0.0f);
        this.Skirt1.setTextureSize(this.textureWidth, this.textureHeight);
        this.Skirt1.mirror = true;
        this.setRotation(this.Skirt1, 0.0f, 0.0f, 0.0f);
        (this.Skirt2 = new ModelRenderer((ModelBase)this, 38, 36)).addBox(-4.0f, 0.0f, -2.5f, 8, 2, 5);
        this.Skirt2.setRotationPoint(0.0f, 12.0f, 0.0f);
        this.Skirt2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Skirt2.mirror = true;
        this.setRotation(this.Skirt2, 0.0f, 0.0f, 0.0f);
        (this.RLeg = new ModelRenderer((ModelBase)this, 52, 0)).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.RLeg.setTextureSize(this.textureWidth, this.textureHeight);
        this.RLeg.mirror = true;
        this.setRotation(this.RLeg, 0.0f, 0.0f, 0.0f);
        (this.LLeg = new ModelRenderer((ModelBase)this, 52, 15)).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
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
    
    private void setRotation(final ModelRenderer var1, final float var2, final float var3, final float var4) {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        final float par7 = par4 / 57.295776f;
        final float par8 = par5 / 57.295776f;
        this.Head.rotateAngleY = par7;
        this.Head.rotateAngleX = par8;
        this.REye.rotateAngleY = this.Head.rotateAngleY;
        this.REye.rotateAngleX = this.Head.rotateAngleX;
        this.LEye.rotateAngleY = this.Head.rotateAngleY;
        this.LEye.rotateAngleX = this.Head.rotateAngleX;
        this.Hair.rotateAngleY = this.Head.rotateAngleY;
        this.Hair.rotateAngleX = this.Head.rotateAngleX;
        this.HTop.rotateAngleY = this.Head.rotateAngleY;
        this.HTop.rotateAngleX = this.Head.rotateAngleX;
        this.Ponytail.rotateAngleY = this.Head.rotateAngleY;
        this.Ponytail.offsetX = 0.0f;
        this.Ponytail.offsetY = 0.0f;
        this.Ponytail.offsetZ = 0.0f;
        this.Ponytail.rotateAngleX = 0.1647198f + this.Head.rotateAngleX / 1.05f;
        this.Ponytail.rotateAngleZ = MathHelper.cos(par1 * 0.6662f) * 0.1f * par2;
        this.Neck.rotateAngleY = this.Head.rotateAngleY / 2.0f;
        this.RLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
        this.LLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
        this.RLeg.rotateAngleY = 0.0f;
        this.LLeg.rotateAngleY = 0.0f;
        this.RArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
        this.LArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
        this.RArm2.rotateAngleX = this.RArm.rotateAngleX;
        this.LArm2.rotateAngleX = this.LArm.rotateAngleX;
        this.Skirt2.rotateAngleX = 0.0f;
        this.Skirt2.rotateAngleY = 0.0f;
        if ((par7Entity.onGround && !this.isOnLadder) || par7Entity.isInWater() || this.isRiding) {
            this.RArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleY = 0.0f;
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par3 * 0.1f) + 0.1f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par3 * 0.1f) - 0.1f;
            this.RArm2.rotateAngleY = this.RArm.rotateAngleY;
            this.LArm2.rotateAngleY = this.LArm.rotateAngleY;
            this.RArm2.rotateAngleZ = this.RArm.rotateAngleZ;
            this.LArm2.rotateAngleZ = this.LArm.rotateAngleZ;
        }
        else {
            final float varX = -2.317994f;
            final float varY = 0.617994f;
            this.RArm.rotateAngleX = varX;
            this.LArm.rotateAngleX = varX;
            this.RArm.rotateAngleY = varY;
            this.LArm.rotateAngleY = -varY;
            this.RArm2.rotateAngleX = this.RArm.rotateAngleX;
            this.LArm2.rotateAngleX = this.LArm.rotateAngleX;
            this.RArm2.rotateAngleY = this.RArm.rotateAngleY;
            this.LArm2.rotateAngleY = this.LArm.rotateAngleY;
        }
        if (this.isRiding) {
            final ModelRenderer rArm = this.RArm;
            rArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer lArm = this.LArm;
            lArm.rotateAngleX -= 0.62831855f;
            this.RArm2.rotateAngleX = this.RArm.rotateAngleX;
            this.LArm2.rotateAngleX = this.LArm.rotateAngleX;
            this.RLeg.rotateAngleX = -1.2566371f;
            this.LLeg.rotateAngleX = -1.2566371f;
            this.RLeg.rotateAngleY = 0.31415927f;
            this.LLeg.rotateAngleY = -0.31415927f;
            this.Skirt2.rotateAngleX = this.RLeg.rotateAngleX;
            this.Skirt2.rotateAngleY = 0.0f;
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
        bypedRightArm6.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedLeftArm5 = this.bypedLeftArm;
        bypedLeftArm5.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bypedRightArm7 = this.bypedRightArm;
        bypedRightArm7.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bypedLeftArm6 = this.bypedLeftArm;
        bypedLeftArm6.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
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
            this.REye.render(scale);
            this.LEye.render(scale);
            this.Hair.render(scale);
            this.Ponytail.render(scale);
            this.Head.render(scale);
            this.Neck.render(scale);
            this.RArm.render(scale);
            this.RArm2.render(scale);
            this.LArm.render(scale);
            this.LArm2.render(scale);
            this.Body.render(scale);
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
}
