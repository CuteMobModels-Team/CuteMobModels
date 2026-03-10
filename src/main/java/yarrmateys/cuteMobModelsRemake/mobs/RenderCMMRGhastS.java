//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRGhastS extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    protected ModelCMMRGhastS cuteModel;
    
    public RenderCMMRGhastS(final ModelCMMRGhastS modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected void updateGhastScale(final EntityCMMRGhastS par1EntityGhast, final float par2) {
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
        this.updateGhastScale((EntityCMMRGhastS)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTexture(final Entity par1Entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRGhastS.texture1;
        }
        return RenderCMMRGhastS.texture1Bl;
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/GhastS1.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGhastS1.png");
    }
}
