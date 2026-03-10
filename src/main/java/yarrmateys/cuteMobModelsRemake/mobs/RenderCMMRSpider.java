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
import net.minecraft.entity.monster.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRSpider extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    private ModelCMMRSpider cuteModel;
    
    public RenderCMMRSpider(final ModelCMMRSpider modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRSpiderEyes(this));
    }
    
    protected void updateSpiderScale(final EntitySpider par1EntitySpider, final float par2) {
        this.shadowSize = 0.3f;
        if (YarrCuteMobModelsRemake.SpiderUseAccurateModelSize) {
            final float f1 = 0.4f;
            final float f2 = 0.4f;
            final float f3 = 0.4f;
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
        this.updateSpiderScale((EntitySpider)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntitySpider par1EntitySpider) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRSpider.texture1;
        }
        return RenderCMMRSpider.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntitySpider)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Spider.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSpider.png");
    }
}
