//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.entity.passive.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRMooshroom extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1a;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture1Bla;
    protected ModelCMMRMooshroom cuteModel;
    
    protected void updateMooshroomScale(final EntityMooshroom par1EntityMooshroom, final float par2) {
        float f1;
        if (YarrCuteMobModelsRemake.MooshroomUseAccurateModelSize) {
            if (!YarrCuteMobModelsRemake.humanMobsModels) {
                f1 = 0.7675f;
            }
            else {
                f1 = 0.7075f;
            }
        }
        else {
            f1 = 0.9375f;
        }
        if (par1EntityMooshroom.getGrowingAge() < 0) {
            f1 *= 0.5;
            this.shadowSize = 0.25f;
        }
        else {
            this.shadowSize = 0.5f;
        }
        GlStateManager.scale(f1, f1, f1);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateMooshroomScale((EntityMooshroom)par1EntityLivingBase, par2);
    }
    
    public RenderCMMRMooshroom(final ModelCMMRMooshroom modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected ResourceLocation getEntityTextures(final EntityMooshroom par1EntityMooshroom) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return (par1EntityMooshroom.getGrowingAge() < 0) ? RenderCMMRMooshroom.texture1a : RenderCMMRMooshroom.texture1;
        }
        return (par1EntityMooshroom.getGrowingAge() < 0) ? RenderCMMRMooshroom.texture1Bla : RenderCMMRMooshroom.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityMooshroom)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Mooshroom.png");
        texture1a = new ResourceLocation("yarrmateys_cutemobmodels:textures/MooshroomK.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlMooshroom.png");
        texture1Bla = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlMooshroomK.png");
    }
}
