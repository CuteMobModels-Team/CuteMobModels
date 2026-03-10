//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs.layers;

import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.entity.monster.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class LayerCMMRCreeperCharge implements LayerRenderer
{
    private static final ResourceLocation LIGHTNING_TEXTURE;
    private final RenderCMMRCreeper creeperRenderer;
    private final ModelCMMRCreeper creeperModel;
    
    public LayerCMMRCreeperCharge(final RenderCMMRCreeper par1) {
        this.creeperModel = new ModelCMMRCreeper(2.0f, 0.0f);
        this.creeperRenderer = par1;
    }
    
    public void doRenderLayer(final EntityCreeper par1EntityCreeper, final float p_177169_2_, final float p_177169_3_, final float p_177169_4_, final float p_177169_5_, final float p_177169_6_, final float p_177169_7_, final float p_177169_8_) {
        if (par1EntityCreeper.getPowered()) {
            GlStateManager.depthMask(!par1EntityCreeper.isInvisible());
            this.creeperRenderer.bindTexture(LayerCMMRCreeperCharge.LIGHTNING_TEXTURE);
            GlStateManager.matrixMode(5890);
            GlStateManager.loadIdentity();
            final float f7 = par1EntityCreeper.ticksExisted + p_177169_4_;
            GlStateManager.translate(f7 * 0.01f, f7 * 0.01f, 0.0f);
            GlStateManager.matrixMode(5888);
            GlStateManager.enableBlend();
            final float f8 = 0.5f;
            GlStateManager.color(f8, f8, f8, 1.0f);
            GlStateManager.disableLighting();
            GlStateManager.blendFunc(1, 1);
            this.creeperModel.setModelAttributes(this.creeperRenderer.getMainModel());
            this.creeperModel.render((Entity)par1EntityCreeper, p_177169_2_, p_177169_3_, p_177169_5_, p_177169_6_, p_177169_7_, p_177169_8_);
            GlStateManager.matrixMode(5890);
            GlStateManager.loadIdentity();
            GlStateManager.matrixMode(5888);
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
        }
    }
    
    public boolean shouldCombineTextures() {
        return false;
    }
    
    public void doRenderLayer(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        this.doRenderLayer((EntityCreeper)entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    static {
        LIGHTNING_TEXTURE = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    }
}
