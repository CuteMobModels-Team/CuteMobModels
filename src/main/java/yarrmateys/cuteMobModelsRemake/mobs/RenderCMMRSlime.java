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
public class RenderCMMRSlime extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture4;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture2Bl;
    private static final ResourceLocation texture4Bl;
    private ModelCMMRSlime cuteModel;
    
    public RenderCMMRSlime(final ModelCMMRSlime modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected void updateSlimeScale(final EntitySlime par1EntitySlime, final float par2) {
        if (YarrCuteMobModelsRemake.SlimeUseAccurateModelSize) {
            final float f1 = 0.25f * par1EntitySlime.getSlimeSize();
            final float f2 = 0.25f * par1EntitySlime.getSlimeSize();
            final float f3 = 0.25f * par1EntitySlime.getSlimeSize();
            this.shadowSize = 0.25f * (par1EntitySlime.getSlimeSize() * 0.5f);
            GlStateManager.scale(f1, f2, f3);
        }
        else {
            final float f1 = 0.6f + par1EntitySlime.getSlimeSize() * 0.1f;
            final float f2 = 0.6f + par1EntitySlime.getSlimeSize() * 0.1f;
            final float f3 = 0.6f + par1EntitySlime.getSlimeSize() * 0.1f;
            this.shadowSize = 3.0f * (par1EntitySlime.getSlimeSize() * 0.05f);
            GlStateManager.scale(f1, f2, f3);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateSlimeScale((EntitySlime)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntitySlime par1EntityLiving) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return (par1EntityLiving.getSlimeSize() >= 3) ? RenderCMMRSlime.texture4 : ((par1EntityLiving.getSlimeSize() == 2) ? RenderCMMRSlime.texture2 : RenderCMMRSlime.texture1);
        }
        return (par1EntityLiving.getSlimeSize() >= 3) ? RenderCMMRSlime.texture4Bl : ((par1EntityLiving.getSlimeSize() == 2) ? RenderCMMRSlime.texture2Bl : RenderCMMRSlime.texture1Bl);
    }
    
    protected ResourceLocation getEntityTexture(final Entity par1Entity) {
        return this.getEntityTextures((EntitySlime)par1Entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Slime1.png");
        texture2 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Slime2.png");
        texture4 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Slime4.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSlime1.png");
        texture2Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSlime2.png");
        texture4Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSlime4.png");
    }
}
