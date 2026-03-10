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
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRStray extends RenderLiving<EntityStray>
{
    private static final ResourceLocation SKELETON;
    private static final ResourceLocation WITHER_SKELETON;
    private static final ResourceLocation STRAY_SKELETON;
    private static final ResourceLocation SKELETON_BL;
    private static final ResourceLocation WITHER_SKELETON_BL;
    private static final ResourceLocation STRAY_SKELETON_BL;
    protected ModelCMMRSkeleton ModelCMMRSkeletonMain;
    protected float field_40296_d;
    
    public RenderCMMRStray(final ModelCMMRSkeleton modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRSkeletonHeldItem((RenderLivingBase)this));
    }
    
    protected ResourceLocation getEntityTexture(final EntityStray entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRStray.STRAY_SKELETON;
        }
        return RenderCMMRStray.STRAY_SKELETON_BL;
    }
    
    static {
        SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/skeleton.png");
        WITHER_SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/skeletonw.png");
        STRAY_SKELETON = new ResourceLocation("yarrmateys_cutemobmodels:textures/skeletons.png");
        SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/blskeleton.png");
        WITHER_SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/blskeletonw.png");
        STRAY_SKELETON_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/blskeletons.png");
    }
}
