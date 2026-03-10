//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.mobs.layers.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.entity.passive.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRWolf extends RenderLiving
{
    private static final ResourceLocation wolfTextures;
    private static final ResourceLocation tamedWolfTextures;
    private static final ResourceLocation anrgyWolfTextures;
    private static final ResourceLocation wolfCollarTextures;
    private static final ResourceLocation wolfTexturesBl;
    private static final ResourceLocation tamedWolfTexturesBl;
    private static final ResourceLocation anrgyWolfTexturesBl;
    private static final ResourceLocation wolfCollarTexturesBl;
    private ModelCMMRWolf cuteModel;
    
    public RenderCMMRWolf(final ModelCMMRWolf modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRWolfCollar(this));
    }
    
    protected void preRenderWolf(final EntityWolf par1EntityWolf, final float par2) {
        float f1;
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            f1 = 0.9375f;
        }
        else {
            f1 = 0.5f;
        }
        if (par1EntityWolf.getGrowingAge() < 0) {
            f1 *= 0.5;
            this.shadowSize = 0.25f;
        }
        else {
            this.shadowSize = 0.5f;
        }
        GlStateManager.scale(f1, f1, f1);
    }
    
    protected float getTailRotation(final EntityWolf par1EntityWolf, final float par2) {
        return par1EntityWolf.getTailRotation();
    }
    
    protected float handleRotationFloat(final EntityLivingBase par1EntityLivingBase, final float par2) {
        return this.getTailRotation((EntityWolf)par1EntityLivingBase, par2);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.preRenderWolf((EntityWolf)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityWolf par1EntityWolf) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return par1EntityWolf.isTamed() ? RenderCMMRWolf.tamedWolfTextures : (par1EntityWolf.isAngry() ? RenderCMMRWolf.anrgyWolfTextures : RenderCMMRWolf.wolfTextures);
        }
        return par1EntityWolf.isTamed() ? RenderCMMRWolf.tamedWolfTexturesBl : (par1EntityWolf.isAngry() ? RenderCMMRWolf.anrgyWolfTexturesBl : RenderCMMRWolf.wolfTexturesBl);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityWolf)entity);
    }
    
    static {
        wolfTextures = new ResourceLocation("yarrmateys_cutemobmodels:textures/Wolf.png");
        tamedWolfTextures = new ResourceLocation("yarrmateys_cutemobmodels:textures/Wolf_Tamed.png");
        anrgyWolfTextures = new ResourceLocation("yarrmateys_cutemobmodels:textures/Wolf_Angry.png");
        wolfCollarTextures = new ResourceLocation("yarrmateys_cutemobmodels:textures/Wolf_Collar.png");
        wolfTexturesBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlWolf.png");
        tamedWolfTexturesBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlWolf_Tamed.png");
        anrgyWolfTexturesBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlWolf_Angry.png");
        wolfCollarTexturesBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlWolf_Collar.png");
    }
}
