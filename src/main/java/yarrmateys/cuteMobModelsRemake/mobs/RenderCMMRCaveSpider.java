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
public class RenderCMMRCaveSpider extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    private ModelCMMRCaveSpider cuteModel;
    
    public RenderCMMRCaveSpider(final ModelCMMRCaveSpider modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRCaveSpiderEyes(this));
    }
    
    protected void updateCaveSpiderScale(final EntityCaveSpider par1EntityCaveSpider, final float par2) {
        this.shadowSize = 0.3f;
        if (YarrCuteMobModelsRemake.CaveSpiderUseAccurateModelSize) {
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
        this.updateCaveSpiderScale((EntityCaveSpider)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityCaveSpider par1EntityCaveSpider) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRCaveSpider.texture1;
        }
        return RenderCMMRCaveSpider.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityCaveSpider)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/CSpider.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlCSpider.png");
    }
}
