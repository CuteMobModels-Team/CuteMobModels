//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.layers.*;
import yarrmateys.cuteMobModelsRemake.*;
import yarrmateys.cuteMobModelsRemake.mobs.layers.*;
import net.minecraft.entity.monster.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraft.block.state.*;

@SideOnly(Side.CLIENT)
public class RenderCMMREnderman extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    private ModelCMMREnderman cuteModel;
    private Random rnd;
    
    public RenderCMMREnderman(final ModelCMMREnderman modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.rnd = new Random();
        this.cuteModel = (ModelCMMREnderman)super.mainModel;
        this.addLayer((LayerRenderer)new LayerCMMREndermanEyes(this));
        if (YarrCuteMobModelsRemake.separateEntities) {
            this.addLayer((LayerRenderer)new LayerCMMREndermanHeldBlockSeparate(this));
        }
        else {
            this.addLayer((LayerRenderer)new LayerCMMREndermanHeldBlock(this));
        }
    }
    
    protected void updateEndermanScale(final EntityEnderman par1EntityEnderman, final float par2) {
        if (YarrCuteMobModelsRemake.EndermanUseAccurateModelSize) {
            final float f1 = 1.1f;
            final float f2 = 1.5f;
            final float f3 = 1.1f;
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
        this.updateEndermanScale((EntityEnderman)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityEnderman par1EntityEnderman) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMREnderman.texture1;
        }
        return RenderCMMREnderman.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityEnderman)entity);
    }
    
    public void doRender(final EntityEnderman entity, double x, final double y, double z, final float entityYaw, final float partialTicks) {
        final IBlockState iblockstate = entity.getHeldBlockState();
        this.cuteModel.isCarrying = (iblockstate != null);
        this.cuteModel.isAttacking = entity.isScreaming();
        if (entity.isScreaming()) {
            final double d0 = 0.02;
            x += this.rnd.nextGaussian() * d0;
            z += this.rnd.nextGaussian() * d0;
        }
        super.doRender((EntityLiving)entity, x, y, z, entityYaw, partialTicks);
    }
    
    public void doRender(final Entity entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityEnderman)entity, x, y, z, entityYaw, partialTicks);
    }
    
    public void doRender(final EntityLiving entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityEnderman)entity, x, y, z, entityYaw, partialTicks);
    }
    
    public void doRender(final EntityLivingBase entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        this.doRender((EntityEnderman)entity, x, y, z, entityYaw, partialTicks);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Enderman.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlEnderman.png");
    }
}
