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
public class RenderCMMRGhast extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture2Bl;
    protected ModelCMMRGhast cuteModel;
    
    public RenderCMMRGhast(final ModelCMMRGhast modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected void updateGhastScale(final EntityGhast par1EntityGhast, final float par2) {
        if (YarrCuteMobModelsRemake.GhastUseAccurateModelSize) {
            final float f1 = 2.0f;
            final float f2 = 2.0f;
            final float f3 = 2.0f;
            GlStateManager.scale(f1, f2, f3);
        }
        else {
            final float f1 = 1.0f;
            final float f2 = 1.0f;
            final float f3 = 1.0f;
            GlStateManager.scale(f1, f2, f3);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateGhastScale((EntityGhast)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityGhast par1EntityGhast) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return par1EntityGhast.isAttacking() ? RenderCMMRGhast.texture2 : RenderCMMRGhast.texture1;
        }
        return par1EntityGhast.isAttacking() ? RenderCMMRGhast.texture2Bl : RenderCMMRGhast.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityGhast)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Ghast1.png");
        texture2 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Ghast2.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGhast1.png");
        texture2Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGhast2.png");
    }
}
