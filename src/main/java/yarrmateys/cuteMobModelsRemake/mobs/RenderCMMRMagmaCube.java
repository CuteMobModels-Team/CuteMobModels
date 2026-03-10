//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.monster.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRMagmaCube extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture4;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture2Bl;
    private static final ResourceLocation texture4Bl;
    private ModelCMMRMagmaCube cuteModel;
    
    public RenderCMMRMagmaCube(final ModelCMMRMagmaCube model, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)model, nameTagRange);
    }
    
    protected void updateMagmaCubeScale(final EntityMagmaCube par1EntityMagmaCube, final float par2) {
        if (YarrCuteMobModelsRemake.MagmaCubeUseAccurateModelSize) {
            final float f1 = 0.25f * par1EntityMagmaCube.getSlimeSize();
            final float f2 = 0.25f * par1EntityMagmaCube.getSlimeSize();
            final float f3 = 0.25f * par1EntityMagmaCube.getSlimeSize();
            this.shadowSize = 0.25f * (par1EntityMagmaCube.getSlimeSize() * 0.5f);
            GlStateManager.scale(f1, f2, f3);
        }
        else {
            final float f1 = 0.6f + par1EntityMagmaCube.getSlimeSize() * 0.1f;
            final float f2 = 0.6f + par1EntityMagmaCube.getSlimeSize() * 0.1f;
            final float f3 = 0.6f + par1EntityMagmaCube.getSlimeSize() * 0.1f;
            this.shadowSize = 3.0f * (par1EntityMagmaCube.getSlimeSize() * 0.05f);
            GlStateManager.scale(f1, f2, f3);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateMagmaCubeScale((EntityMagmaCube)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityMagmaCube par1EntityLiving) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return (par1EntityLiving.getSlimeSize() >= 3) ? RenderCMMRMagmaCube.texture4 : ((par1EntityLiving.getSlimeSize() == 2) ? RenderCMMRMagmaCube.texture2 : RenderCMMRMagmaCube.texture1);
        }
        return (par1EntityLiving.getSlimeSize() >= 3) ? RenderCMMRMagmaCube.texture4Bl : ((par1EntityLiving.getSlimeSize() == 2) ? RenderCMMRMagmaCube.texture2Bl : RenderCMMRMagmaCube.texture1Bl);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityMagmaCube)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/MCube1.png");
        texture2 = new ResourceLocation("yarrmateys_cutemobmodels:textures/MCube2.png");
        texture4 = new ResourceLocation("yarrmateys_cutemobmodels:textures/MCube4.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlMCube1.png");
        texture2Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlMCube2.png");
        texture4Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlMCube4.png");
    }
}
