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
import net.minecraft.client.renderer.culling.*;
import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRGuardian extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture2Bl;
    private static final ResourceLocation texture_beam;
    int param1;
    
    public RenderCMMRGuardian(final ModelCMMRGuardian modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.param1 = ((ModelCMMRGuardian)this.mainModel).func_178706_a();
        this.addLayer((LayerRenderer)new LayerCMMRGuardianEyes(this));
    }
    
    protected void updateGuardianScale(final EntityGuardian par1Entity, final float par2) {
        if (YarrCuteMobModelsRemake.GuardianUseAccurateModelSize) {
            final float f1 = 0.5f;
            final float f2 = 0.5f;
            final float f3 = 0.5f;
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
        this.updateGuardianScale((EntityGuardian)par1EntityLivingBase, par2);
    }
    
    public boolean shouldRender(final EntityGuardian livingEntity, final ICamera camera, final double camX, final double camY, final double camZ) {
        if (super.shouldRender((EntityLiving)livingEntity, camera, camX, camY, camZ)) {
            return true;
        }
        if (livingEntity.hasTargetedEntity()) {
            final EntityLivingBase entitylivingbase = livingEntity.getTargetedEntity();
            if (entitylivingbase != null) {
                final Vec3d vec3d = this.getPosition(entitylivingbase, entitylivingbase.height * 0.5, 1.0f);
                final Vec3d vec3d2 = this.getPosition((EntityLivingBase)livingEntity, livingEntity.getEyeHeight(), 1.0f);
                if (camera.isBoundingBoxInFrustum(new AxisAlignedBB(vec3d2.x, vec3d2.y, vec3d2.z, vec3d.x, vec3d.y, vec3d.z))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private Vec3d getPosition(final EntityLivingBase entityLivingBaseIn, final double p_177110_2_, final float p_177110_4_) {
        final double d1 = entityLivingBaseIn.lastTickPosX + (entityLivingBaseIn.posX - entityLivingBaseIn.lastTickPosX) * p_177110_4_;
        final double d2 = p_177110_2_ + entityLivingBaseIn.lastTickPosY + (entityLivingBaseIn.posY - entityLivingBaseIn.lastTickPosY) * p_177110_4_;
        final double d3 = entityLivingBaseIn.lastTickPosZ + (entityLivingBaseIn.posZ - entityLivingBaseIn.lastTickPosZ) * p_177110_4_;
        return new Vec3d(d1, d2, d3);
    }
    
    public void doRender(final EntityGuardian entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        if (this.param1 != ((ModelCMMRGuardian)this.mainModel).func_178706_a()) {
            this.param1 = ((ModelCMMRGuardian)this.mainModel).func_178706_a();
        }
        super.doRender((EntityLiving)entity, x, y, z, entityYaw, partialTicks);
        final EntityLivingBase entitylivingbase = entity.getTargetedEntity();
        if (entitylivingbase != null) {
            final float f = entity.getAttackAnimationScale(partialTicks);
            final Tessellator tessellator = Tessellator.getInstance();
            final BufferBuilder worldrenderer = tessellator.getBuffer();
            this.bindTexture(RenderCMMRGuardian.texture_beam);
            GL11.glTexParameterf(3553, 10242, 10497.0f);
            GL11.glTexParameterf(3553, 10243, 10497.0f);
            GlStateManager.disableLighting();
            GlStateManager.disableCull();
            GlStateManager.disableBlend();
            GlStateManager.depthMask(true);
            final float f2 = 240.0f;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, f2, f2);
            GlStateManager.tryBlendFuncSeparate(770, 1, 1, 0);
            final float f3 = entity.world.getTotalWorldTime() + partialTicks;
            final float f4 = f3 * 0.5f % 1.0f;
            final float f5 = entity.getEyeHeight();
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y + f5, (float)z);
            final Vec3d vec3 = this.getPosition(entitylivingbase, entitylivingbase.height * 0.5, partialTicks);
            final Vec3d vec4 = this.getPosition((EntityLivingBase)entity, f5, partialTicks);
            Vec3d vec5 = vec3.subtract(vec4);
            final double d0 = vec5.length() + 1.0;
            vec5 = vec5.normalize();
            final float f6 = (float)Math.acos(vec5.y);
            final float f7 = (float)Math.atan2(vec5.z, vec5.x);
            GlStateManager.rotate((1.5707964f + -f7) * 57.295776f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(f6 * 57.295776f, 1.0f, 0.0f, 0.0f);
            final int i = 1;
            final double d2 = f3 * 0.05 * (1.0 - (i & 0x1) * 2.5);
            worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            final float f8 = f * f;
            final int j = 64 + (int)(f8 * 240.0f);
            final int k = 32 + (int)(f8 * 192.0f);
            final int l = 128 - (int)(f8 * 64.0f);
            final double d3 = i * 0.2;
            final double d4 = d3 * 1.41;
            final double d5 = 0.0 + Math.cos(d2 + 2.356194490192345) * d4;
            final double d6 = 0.0 + Math.sin(d2 + 2.356194490192345) * d4;
            final double d7 = 0.0 + Math.cos(d2 + 0.7853981633974483) * d4;
            final double d8 = 0.0 + Math.sin(d2 + 0.7853981633974483) * d4;
            final double d9 = 0.0 + Math.cos(d2 + 3.9269908169872414) * d4;
            final double d10 = 0.0 + Math.sin(d2 + 3.9269908169872414) * d4;
            final double d11 = 0.0 + Math.cos(d2 + 5.497787143782138) * d4;
            final double d12 = 0.0 + Math.sin(d2 + 5.497787143782138) * d4;
            final double d13 = 0.0 + Math.cos(d2 + 3.141592653589793) * d3;
            final double d14 = 0.0 + Math.sin(d2 + 3.141592653589793) * d3;
            final double d15 = 0.0 + Math.cos(d2 + 0.0) * d3;
            final double d16 = 0.0 + Math.sin(d2 + 0.0) * d3;
            final double d17 = 0.0 + Math.cos(d2 + 1.5707963267948966) * d3;
            final double d18 = 0.0 + Math.sin(d2 + 1.5707963267948966) * d3;
            final double d19 = 0.0 + Math.cos(d2 + 4.71238898038469) * d3;
            final double d20 = 0.0 + Math.sin(d2 + 4.71238898038469) * d3;
            final double d21 = 0.0;
            final double d22 = 0.4999;
            final double d23 = -1.0f + f4;
            final double d24 = d0 * (0.5 / d3) + d23;
            worldrenderer.pos(d13, d0, d14).tex(0.4999, d24).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d13, 0.0, d14).tex(0.4999, d23).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d15, 0.0, d16).tex(0.0, d23).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d15, d0, d16).tex(0.0, d24).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d17, d0, d18).tex(0.4999, d24).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d17, 0.0, d18).tex(0.4999, d23).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d19, 0.0, d20).tex(0.0, d23).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d19, d0, d20).tex(0.0, d24).color(j, k, l, 255).endVertex();
            double d25 = 0.0;
            if (entity.ticksExisted % 2 == 0) {
                d25 = 0.5;
            }
            worldrenderer.pos(d5, d0, d6).tex(0.5, d25 + 0.5).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d7, d0, d8).tex(1.0, d25 + 0.5).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d11, d0, d12).tex(1.0, d25).color(j, k, l, 255).endVertex();
            worldrenderer.pos(d9, d0, d10).tex(0.5, d25).color(j, k, l, 255).endVertex();
            tessellator.draw();
            GlStateManager.popMatrix();
        }
    }
    
    public void doRender(final EntityLiving entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityGuardian)entity, x, y, z, entityYaw, partialTicks);
    }
    
    public boolean func_177104_a(final EntityLiving p_177104_1_, final ICamera p_177104_2_, final double p_177104_3_, final double p_177104_5_, final double p_177104_7_) {
        return this.shouldRender((EntityGuardian)p_177104_1_, p_177104_2_, p_177104_3_, p_177104_5_, p_177104_7_);
    }
    
    public void doRender(final EntityLivingBase entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityGuardian)entity, x, y, z, entityYaw, partialTicks);
    }
    
    protected ResourceLocation getEntityTextures(final EntityGuardian par1Entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRGuardian.texture1;
        }
        return RenderCMMRGuardian.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityGuardian)entity);
    }
    
    public void doRender(final Entity entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityGuardian)entity, x, y, z, entityYaw, partialTicks);
    }
    
    public boolean shouldRender(final Entity livingEntity, final ICamera camera, final double camX, final double camY, final double camZ) {
        return this.shouldRender((EntityGuardian)livingEntity, camera, camX, camY, camZ);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Guardian.png");
        texture2 = new ResourceLocation("yarrmateys_cutemobmodels:textures/GuardianE.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGuardian.png");
        texture2Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlGuardianE.png");
        texture_beam = new ResourceLocation("textures/entity/guardian_beam.png");
    }
}
