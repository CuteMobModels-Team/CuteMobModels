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
public class RenderCMMRSilverfish extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    protected ModelCMMRSilverfish cuteModel;
    
    public RenderCMMRSilverfish(final ModelCMMRSilverfish modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected void updateSilverfishScale(final EntitySilverfish par1EntitySilverfish, final float par2) {
        if (YarrCuteMobModelsRemake.SilverfishUseAccurateModelSize) {
            final float f1 = 0.2f;
            final float f2 = 0.2f;
            final float f3 = 0.2f;
            GlStateManager.scale(f1, f2, f3);
        }
        else {
            final float f1 = 0.9f;
            final float f2 = 0.9f;
            final float f3 = 0.9f;
            GlStateManager.scale(f1, f2, f3);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateSilverfishScale((EntitySilverfish)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntitySilverfish par1EntitySilverfish) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRSilverfish.texture1;
        }
        return RenderCMMRSilverfish.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntitySilverfish)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/SFish.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSFish.png");
    }
}
