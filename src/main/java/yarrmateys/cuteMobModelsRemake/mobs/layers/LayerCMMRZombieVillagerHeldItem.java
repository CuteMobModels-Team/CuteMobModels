//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs.layers;

import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.client.*;

@SideOnly(Side.CLIENT)
public class LayerCMMRZombieVillagerHeldItem implements LayerRenderer
{
    private final RenderLivingBase livingEntityRenderer;
    
    public LayerCMMRZombieVillagerHeldItem(final RenderLivingBase livingEntityRendererIn) {
        this.livingEntityRenderer = livingEntityRendererIn;
    }
    
    public void doRenderLayer(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final boolean flag = entitylivingbaseIn.getPrimaryHand() == EnumHandSide.RIGHT;
        final ItemStack itemstack = flag ? entitylivingbaseIn.getHeldItemOffhand() : entitylivingbaseIn.getHeldItemMainhand();
        final ItemStack itemstack2 = flag ? entitylivingbaseIn.getHeldItemMainhand() : entitylivingbaseIn.getHeldItemOffhand();
        if (itemstack != null || itemstack2 != null) {
            GlStateManager.pushMatrix();
            if (this.livingEntityRenderer.getMainModel().isChild) {
                final float f = 1.0f;
                GlStateManager.translate(0.0f, 0.0f, 0.0f);
                GlStateManager.rotate(0.0f, 0.0f, 0.0f, 0.0f);
                GlStateManager.scale(f, f, f);
            }
            this.renderHeldItem(entitylivingbaseIn, itemstack2, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND, EnumHandSide.RIGHT);
            this.renderHeldItem(entitylivingbaseIn, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND, EnumHandSide.LEFT);
            GlStateManager.popMatrix();
        }
    }
    
    private void renderHeldItem(final EntityLivingBase p_188358_1_, final ItemStack p_188358_2_, final ItemCameraTransforms.TransformType p_188358_3_, final EnumHandSide handSide) {
        if (p_188358_2_ != null) {
            GlStateManager.pushMatrix();
            ((ModelCMMRZombieVillager)this.livingEntityRenderer.getMainModel()).postRenderArm(0.0625f, handSide);
            if (p_188358_1_.isSneaking()) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            GlStateManager.rotate(-90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
            final boolean flag = handSide == EnumHandSide.LEFT;
            GlStateManager.translate(flag ? -0.0625f : 0.0625f, 0.125f, -0.625f);
            Minecraft.getMinecraft().getItemRenderer().renderItemSide(p_188358_1_, p_188358_2_, p_188358_3_, flag);
            GlStateManager.popMatrix();
        }
    }
    
    public boolean shouldCombineTextures() {
        return false;
    }
}
