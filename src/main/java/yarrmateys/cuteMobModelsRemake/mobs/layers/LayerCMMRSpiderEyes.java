//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs.layers;

import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.entity.monster.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class LayerCMMRSpiderEyes implements LayerRenderer
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    private final RenderCMMRSpider param1;
    
    public LayerCMMRSpiderEyes(final RenderCMMRSpider spiderRendererIn) {
        this.param1 = spiderRendererIn;
    }
    
    public void doRenderLayerEX(final EntitySpider entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            this.param1.bindTexture(LayerCMMRSpiderEyes.texture1);
        }
        else {
            this.param1.bindTexture(LayerCMMRSpiderEyes.texture1Bl);
        }
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.blendFunc(1, 1);
        if (entitylivingbaseIn.isInvisible()) {
            GlStateManager.depthMask(false);
        }
        else {
            GlStateManager.depthMask(true);
        }
        int i = 61680;
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
        this.param1.getMainModel().render((Entity)entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
        i = entitylivingbaseIn.getBrightnessForRender();
        j = i % 65536;
        k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        this.param1.setLightmap((EntityLiving)entitylivingbaseIn);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }
    
    public boolean shouldCombineTextures() {
        return false;
    }
    
    public void doRenderLayer(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        this.doRenderLayerEX((EntitySpider)entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Spider_eyes.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSpider_eyes.png");
    }
}
