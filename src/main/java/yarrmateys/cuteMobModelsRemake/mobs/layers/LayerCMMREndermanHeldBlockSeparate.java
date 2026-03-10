//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs.layers;

import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.relauncher.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class LayerCMMREndermanHeldBlockSeparate implements LayerRenderer<EntityCMMREnderman>
{
    private final RenderCMMREnderman endermanRenderer;
    
    public LayerCMMREndermanHeldBlockSeparate(final RenderCMMREnderman renderCMMREnderman) {
        this.endermanRenderer = renderCMMREnderman;
    }
    
    public void doRenderLayer(final EntityCMMREnderman entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final IBlockState iblockstate = entitylivingbaseIn.getHeldBlockState();
        if (iblockstate != null) {
            final BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
            GlStateManager.enableRescaleNormal();
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 0.6875f, -0.75f);
            GlStateManager.rotate(20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(45.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.25f, 0.1875f, 0.25f);
            final float f = 0.5f;
            GlStateManager.scale(-0.5f, -0.5f, 0.5f);
            final int i = entitylivingbaseIn.getBrightnessForRender();
            final int j = i % 65536;
            final int k = i / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.endermanRenderer.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            blockrendererdispatcher.renderBlockBrightness(iblockstate, 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
        }
    }
    
    public boolean shouldCombineTextures() {
        return false;
    }
}
