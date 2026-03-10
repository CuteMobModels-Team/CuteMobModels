//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.passive.*;
import net.minecraft.util.math.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.*;

@SideOnly(Side.CLIENT)
public class ModelCMMRWolf extends ModelBase
{
    ModelRenderer REar;
    ModelRenderer LEar;
    ModelRenderer HTop;
    ModelRenderer Hood1;
    ModelRenderer Hood2;
    ModelRenderer Head;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer Body;
    ModelRenderer Skirt1;
    ModelRenderer Skirt2;
    ModelRenderer Tail;
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
    
    public ModelCMMRWolf(final float modelSize, final float offset) {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.REar = new ModelRenderer((ModelBase)this, 26, 0)).addBox(-4.0f, -10.0f, 0.0f, 2, 3, 1);
        this.REar.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.REar.setTextureSize(this.textureWidth, this.textureHeight);
        this.REar.mirror = true;
        this.setRotation(this.REar, 0.0f, 0.0f, 0.0f);
        (this.LEar = new ModelRenderer((ModelBase)this, 26, 4)).addBox(2.0f, -10.0f, 0.0f, 2, 3, 1);
        this.LEar.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.LEar.setTextureSize(this.textureWidth, this.textureHeight);
        this.LEar.mirror = true;
        this.setRotation(this.LEar, 0.0f, 0.0f, 0.0f);
        (this.HTop = new ModelRenderer((ModelBase)this, 0, 28)).addBox(-3.5f, -8.0f, -3.0f, 7, 1, 6);
        this.HTop.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.HTop.setTextureSize(this.textureWidth, this.textureHeight);
        this.HTop.mirror = true;
        this.setRotation(this.HTop, 0.0f, 0.0f, 0.0f);
        (this.Hood1 = new ModelRenderer((ModelBase)this, 0, 13)).addBox(-4.0f, -7.0f, -3.5f, 8, 8, 7);
        this.Hood1.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Hood1.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hood1.mirror = true;
        this.setRotation(this.Hood1, 0.0f, 0.0f, 0.0f);
        (this.Hood2 = new ModelRenderer((ModelBase)this, 30, 17)).addBox(-5.0f, -5.0f, -3.5f, 10, 5, 6);
        this.Hood2.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Hood2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Hood2.mirror = true;
        this.setRotation(this.Hood2, 0.0f, 0.0f, 0.0f);
        (this.Head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-3.5f, -7.0f, -3.0f, 7, 7, 6);
        this.Head.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Head.setTextureSize(this.textureWidth, this.textureHeight);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        (this.Neck1 = new ModelRenderer((ModelBase)this, 26, 8)).addBox(-2.5f, 0.0f, -2.5f, 5, 1, 5);
        this.Neck1.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Neck1.setTextureSize(this.textureWidth, this.textureHeight);
        this.Neck1.mirror = true;
        this.setRotation(this.Neck1, 0.0f, 0.0f, 0.0f);
        (this.Neck2 = new ModelRenderer((ModelBase)this, 42, 28)).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3);
        this.Neck2.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Neck2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Neck2.mirror = true;
        this.setRotation(this.Neck2, 0.0f, 0.0f, 0.0f);
        (this.RArm = new ModelRenderer((ModelBase)this, 32, 0)).addBox(-2.0f, -1.0f, -1.0f, 2, 6, 2);
        this.RArm.setRotationPoint(-2.5f, 15.0f, 0.0f);
        this.RArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.RArm.mirror = true;
        this.setRotation(this.RArm, 0.0f, 0.0f, 0.0f);
        (this.LArm = new ModelRenderer((ModelBase)this, 40, 0)).addBox(0.0f, -1.0f, -1.0f, 2, 6, 2);
        this.LArm.setRotationPoint(2.5f, 15.0f, 0.0f);
        this.LArm.setTextureSize(this.textureWidth, this.textureHeight);
        this.LArm.mirror = true;
        this.setRotation(this.LArm, 0.0f, 0.0f, 0.0f);
        (this.Body = new ModelRenderer((ModelBase)this, 26, 28)).addBox(-2.5f, 0.0f, -1.5f, 5, 5, 3);
        this.Body.setRotationPoint(0.0f, 14.0f, 0.0f);
        this.Body.setTextureSize(this.textureWidth, this.textureHeight);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
        (this.Skirt1 = new ModelRenderer((ModelBase)this, 0, 35)).addBox(-3.5f, 0.0f, -2.0f, 7, 2, 4);
        this.Skirt1.setRotationPoint(0.0f, 17.0f, 0.0f);
        this.Skirt1.setTextureSize(this.textureWidth, this.textureHeight);
        this.Skirt1.mirror = true;
        this.setRotation(this.Skirt1, 0.0f, 0.0f, 0.0f);
        (this.Skirt2 = new ModelRenderer((ModelBase)this, 0, 41)).addBox(-4.0f, 2.0f, -2.5f, 8, 3, 5);
        this.Skirt2.setRotationPoint(0.0f, 17.0f, 0.0f);
        this.Skirt2.setTextureSize(this.textureWidth, this.textureHeight);
        this.Skirt2.mirror = true;
        this.setRotation(this.Skirt2, 0.0f, 0.0f, 0.0f);
        (this.Tail = new ModelRenderer((ModelBase)this, 48, 7)).addBox(-1.0f, -1.0f, -1.0f, 2, 7, 2);
        this.Tail.setRotationPoint(0.0f, 18.0f, 2.0f);
        this.Tail.setTextureSize(this.textureWidth, this.textureHeight);
        this.Tail.mirror = true;
        this.setRotation(this.Tail, 0.0f, 0.0f, 0.0f);
        (this.RLeg = new ModelRenderer((ModelBase)this, 48, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
        this.RLeg.setRotationPoint(-1.5f, 19.0f, 0.0f);
        this.RLeg.setTextureSize(this.textureWidth, this.textureHeight);
        this.RLeg.mirror = true;
        this.setRotation(this.RLeg, 0.0f, 0.0f, 0.0f);
        (this.LLeg = new ModelRenderer((ModelBase)this, 56, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
        this.LLeg.setRotationPoint(1.5f, 19.0f, 0.0f);
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
        final EntityWolf entitywolf = (EntityWolf)par1EntityLivingBase;
        if (entitywolf.isAngry()) {
            this.Tail.rotateAngleY = 0.0f;
        }
        else {
            this.Tail.rotateAngleY = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        }
        if (entitywolf.isSitting()) {
            if (!YarrCuteMobModelsRemake.humanMobsModels) {
                this.Head.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.LEar.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.REar.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.HTop.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.Hood1.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.Hood2.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.Neck1.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.Neck2.setRotationPoint(0.0f, 16.0f, 0.0f);
                this.Body.setRotationPoint(0.0f, 17.0f, 0.0f);
                this.RArm.setRotationPoint(-2.5f, 18.0f, 0.0f);
                this.LArm.setRotationPoint(2.5f, 18.0f, 0.0f);
                this.Skirt1.setRotationPoint(0.0f, 20.0f, -0.25f);
                this.Skirt2.setRotationPoint(0.0f, 19.0f, -0.5f);
                this.Tail.setRotationPoint(0.0f, 21.0f, 2.0f);
                this.RLeg.setRotationPoint(-1.5f, 23.0f, 0.0f);
                this.LLeg.setRotationPoint(1.5f, 23.0f, 0.0f);
                this.RLeg.rotateAngleX = 4.712389f;
                this.LLeg.rotateAngleX = 4.712389f;
                this.RArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 0.6f * par3;
                this.RArm.rotateAngleY = 0.0f;
                this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par4 * 0.1f) + 0.1f;
                this.LArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 0.6f * par3;
                this.LArm.rotateAngleY = 0.0f;
                this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par4 * 0.1f) - 0.1f;
            }
            else {
                this.bypedHead.setRotationPoint(0.0f, 12.0f, 0.0f);
                this.bypedBody.setRotationPoint(0.0f, 12.0f, 0.0f);
                this.bypedRightArm.setRotationPoint(-5.0f, 14.0f, 0.0f);
                this.bypedLeftArm.setRotationPoint(5.0f, 14.0f, 0.0f);
                this.bypedRightLeg.setRotationPoint(-2.0f, 22.0f, -2.0f);
                this.bypedLeftLeg.setRotationPoint(2.0f, 22.0f, -2.0f);
                this.bypedRightArm.rotateAngleX = 0.0f;
                this.bypedLeftArm.rotateAngleX = 0.0f;
                this.bypedRightArm.rotateAngleZ = 0.2f;
                this.bypedLeftArm.rotateAngleZ = -0.2f;
                this.bypedRightLeg.rotateAngleX = -1.6f;
                this.bypedRightLeg.rotateAngleY = 0.25f;
                this.bypedLeftLeg.rotateAngleX = -1.6f;
                this.bypedLeftLeg.rotateAngleY = -0.25f;
            }
        }
        else if (!YarrCuteMobModelsRemake.humanMobsModels) {
            this.Head.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.LEar.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.REar.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.HTop.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.Hood1.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.Hood2.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.Neck1.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.Neck2.setRotationPoint(0.0f, 13.0f, 0.0f);
            this.Body.setRotationPoint(0.0f, 14.0f, 0.0f);
            this.RArm.setRotationPoint(-2.5f, 15.0f, 0.0f);
            this.LArm.setRotationPoint(2.5f, 15.0f, 0.0f);
            this.Skirt1.setRotationPoint(0.0f, 17.0f, 0.0f);
            this.Skirt2.setRotationPoint(0.0f, 17.0f, 0.0f);
            this.Tail.setRotationPoint(0.0f, 18.0f, 2.0f);
            this.RLeg.setRotationPoint(-1.5f, 19.0f, 0.0f);
            this.LLeg.setRotationPoint(1.5f, 19.0f, 0.0f);
            this.RLeg.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 0.6f * par3;
            this.LLeg.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 0.6f * par3;
            this.RArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 0.6f * par3;
            this.RArm.rotateAngleY = 0.0f;
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par4 * 0.1f) + 0.1f;
            this.LArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 0.6f * par3;
            this.LArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par4 * 0.1f) - 0.1f;
        }
        else {
            this.bypedHead.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.bypedBody.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.bypedRightArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
            this.bypedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.bypedRightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
            this.bypedLeftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
            this.bypedRightArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 2.0f * par3 * 0.5f;
            final ModelRenderer bypedRightArm = this.bypedRightArm;
            bypedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
            this.bypedRightArm.rotateAngleZ = 0.0f;
            final ModelRenderer bypedRightArm2 = this.bypedRightArm;
            bypedRightArm2.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            this.bypedLeftArm.rotateAngleZ = 0.0f;
            final ModelRenderer bypedLeftArm = this.bypedLeftArm;
            bypedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            this.bypedLeftArm.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 2.0f * par3 * 0.5f;
            final ModelRenderer bypedLeftArm2 = this.bypedLeftArm;
            bypedLeftArm2.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
            this.bypedRightLeg.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
            this.bypedLeftLeg.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
            this.bypedRightLeg.rotateAngleY = 0.0f;
            this.bypedLeftLeg.rotateAngleY = 0.0f;
        }
        this.Head.rotateAngleZ = entitywolf.getInterestedAngle(par4) + entitywolf.getShakeAngle(par4, 0.0f);
        this.REar.rotateAngleZ = this.Head.rotateAngleZ;
        this.LEar.rotateAngleZ = this.Head.rotateAngleZ;
        this.HTop.rotateAngleZ = this.Head.rotateAngleZ;
        this.Hood1.rotateAngleZ = this.Head.rotateAngleZ;
        this.Hood2.rotateAngleZ = this.Head.rotateAngleZ;
        this.Tail.rotateAngleZ = entitywolf.getShakeAngle(par4, -0.2f);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        final EntityWolf entitywolf = (EntityWolf)par7Entity;
        this.Head.rotateAngleY = par4 / 57.295776f;
        this.Head.rotateAngleX = par5 / 57.295776f;
        this.REar.rotateAngleY = this.Head.rotateAngleY;
        this.REar.rotateAngleX = this.Head.rotateAngleX;
        this.LEar.rotateAngleY = this.Head.rotateAngleY;
        this.LEar.rotateAngleX = this.Head.rotateAngleX;
        this.HTop.rotateAngleY = this.Head.rotateAngleY;
        this.HTop.rotateAngleX = this.Head.rotateAngleX;
        this.Hood1.rotateAngleY = this.Head.rotateAngleY;
        this.Hood1.rotateAngleX = this.Head.rotateAngleX;
        this.Hood2.rotateAngleY = this.Head.rotateAngleY;
        this.Hood2.rotateAngleX = this.Head.rotateAngleX;
        this.Neck1.rotateAngleY = this.Head.rotateAngleY / 4.0f;
        this.Neck2.rotateAngleY = this.Head.rotateAngleY / 2.0f;
        this.Skirt1.rotateAngleX = 0.0f;
        this.Skirt1.rotateAngleY = 0.0f;
        this.Skirt2.rotateAngleX = this.Skirt1.rotateAngleX;
        this.Skirt2.rotateAngleY = this.Skirt1.rotateAngleY;
        this.Tail.rotateAngleX = par3;
        if ((par7Entity.onGround && !this.isOnLadder) || par7Entity.isInWater() || this.isRiding) {
            this.RArm.rotateAngleZ = 0.1f * MathHelper.sin(par3 * 0.1f) + 0.1f;
            this.LArm.rotateAngleZ = -0.1f * MathHelper.sin(par3 * 0.1f) - 0.1f;
            this.RArm.rotateAngleX = 0.0f;
            this.RArm.rotateAngleY = 0.0f;
            this.LArm.rotateAngleX = 0.0f;
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
            final ModelRenderer rArm = this.RArm;
            rArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer lArm = this.LArm;
            lArm.rotateAngleX -= 0.62831855f;
            this.RLeg.rotateAngleX = -1.2566371f;
            this.LLeg.rotateAngleX = -1.2566371f;
            this.RLeg.rotateAngleY = 0.31415927f;
            this.LLeg.rotateAngleY = -0.31415927f;
            this.RLeg.setRotationPoint(-1.5f, 19.0f, 0.0f);
            this.LLeg.setRotationPoint(1.5f, 19.0f, 0.0f);
            this.Skirt1.setRotationPoint(0.0f, 16.0f, -0.25f);
            this.Skirt2.setRotationPoint(0.0f, 15.0f, -0.5f);
        }
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
            this.REar.renderWithRotation(scale);
            this.LEar.renderWithRotation(scale);
            this.HTop.renderWithRotation(scale);
            this.Hood1.renderWithRotation(scale);
            this.Hood2.renderWithRotation(scale);
            this.Head.renderWithRotation(scale);
            this.Neck1.render(scale);
            this.Neck2.render(scale);
            this.RArm.render(scale);
            this.LArm.render(scale);
            this.Body.render(scale);
            this.Skirt1.render(scale);
            this.Skirt2.render(scale);
            this.Tail.renderWithRotation(scale);
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
