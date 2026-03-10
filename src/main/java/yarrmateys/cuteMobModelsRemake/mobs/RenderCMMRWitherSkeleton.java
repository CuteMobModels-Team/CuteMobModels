//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.entity.monster.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.mobs.layers.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.client.renderer.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRWitherSkeleton extends RenderLiving<EntityWitherSkeleton>
{
    private static final ResourceLocation SKELETON;
    private static final ResourceLocation WITHER_SKELETON;
    private static final ResourceLocation STRAY_SKELETON;
    private static final ResourceLocation SKELETON_BL;
    private static final ResourceLocation WITHER_SKELETON_BL;
    private static final ResourceLocation STRAY_SKELETON_BL;
    protected ModelCMMRSkeleton ModelCMMRSkeletonMain;
    protected float field_40296_d;
    
    public RenderCMMRWitherSkeleton(final ModelCMMRSkeleton modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRSkeletonHeldItem((RenderLivingBase)this));
    }
    
    protected void updateSkeletonScale(final EntityWitherSkeleton par1EntitySkeleton, final float par2) {
        final float f1 = 1.0f;
        final float f2 = 1.25f;
        final float f3 = 1.0f;
        GlStateManager.scale(f1, f2, f3);
    }
    
    protected void preRenderCallback(final EntityWitherSkeleton entitylivingbaseIn, final float partialTickTime) {
        GlStateManager.scale(1.2f, 1.2f, 1.2f);
    }
    
    protected ResourceLocation getEntityTexture(final EntityWitherSkeleton entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRWitherSkeleton.WITHER_SKELETON;
        }
        return RenderCMMRWitherSkeleton.WITHER_SKELETON_BL;
    }
    
    static {
        SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/Skeleton.png");
        WITHER_SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/SkeletonW.png");
        STRAY_SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/SkeletonS.png");
        SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSkeleton.png");
        WITHER_SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSkeletonW.png");
        STRAY_SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSkeletonS.png");
    }
}
