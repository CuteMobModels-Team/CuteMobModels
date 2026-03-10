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
public class LayerCMMRGuardianEyes implements LayerRenderer
{
    private static final ResourceLocation texture1a;
    private static final ResourceLocation texture1b;
    private static final ResourceLocation texture1aBl;
    private static final ResourceLocation texture1bBl;
    private final RenderCMMRGuardian Renderer;
    
    public LayerCMMRGuardianEyes(final RenderCMMRGuardian par1) {
        this.Renderer = par1;
    }
    
    public void doRenderLayerEX(final EntityGuardian entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            this.Renderer.bindTexture(LayerCMMRGuardianEyes.texture1a);
        }
        else {
            this.Renderer.bindTexture(LayerCMMRGuardianEyes.texture1aBl);
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
        this.Renderer.getMainModel().render((Entity)entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
        i = entitylivingbaseIn.getBrightnessForRender();
        j = i % 65536;
        k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        this.Renderer.setLightmap((EntityLiving)entitylivingbaseIn);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }
    
    public boolean shouldCombineTextures() {
        return false;
    }
    
    public void doRenderLayer(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        this.doRenderLayerEX((EntityGuardian)entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    static {
        texture1a = new ResourceLocation("yarrmateys_cutemobmodels:textures/Guardian_eye.png");
        texture1b = new ResourceLocation("yarrmateys_cutemobmodels:textures/GuardianE_eye.png");
        texture1aBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGuardian_eye.png");
        texture1bBl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGuardianE_eye.png");
    }
}
