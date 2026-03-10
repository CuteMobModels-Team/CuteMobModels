//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.monster.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRIronGolem extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    protected ModelCMMRIronGolem cuteModel;
    
    public RenderCMMRIronGolem(final ModelCMMRIronGolem modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected void updateIronGolemScale(final EntityIronGolem par1EntityIronGolem, final float par2) {
        if (YarrCuteMobModelsRemake.IronGolemUseAccurateModelSize) {
            final float f1 = 1.5f;
            final float f2 = 1.55f;
            final float f3 = 1.5f;
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
        this.updateIronGolemScale((EntityIronGolem)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityIronGolem par1EntityIronGolem) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRIronGolem.texture1;
        }
        return RenderCMMRIronGolem.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityIronGolem)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/IGolem.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlIGolem.png");
    }
}
