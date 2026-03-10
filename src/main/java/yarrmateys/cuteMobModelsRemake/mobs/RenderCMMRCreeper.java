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
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRCreeper extends RenderLiving
{
    private static final ResourceLocation armoredCreeperTextures;
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture1Bl;
    private static final ResourceLocation texture2Bl;
    public ModelCMMRCreeper cuteModel;
    
    public RenderCMMRCreeper(final ModelCMMRCreeper model, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)model, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRCreeperCharge(this));
    }
    
    protected void updateCreeperScale(final EntityCreeper par1EntityCreeper, final float par2) {
        float f1 = par1EntityCreeper.getCreeperFlashIntensity(par2);
        final float f2 = 1.0f + MathHelper.sin(f1 * 100.0f) * f1 * 0.01f;
        if (f1 < 0.0f) {
            f1 = 0.0f;
        }
        if (f1 > 1.0f) {
            f1 = 1.0f;
        }
        f1 *= f1;
        f1 *= f1;
        final float f3 = (1.0f + f1 * 0.4f) * f2;
        final float f4 = (1.0f + f1 * 0.1f) / f2;
        GlStateManager.scale(f3, f4, f3);
    }
    
    protected int func_180571_a(final EntityCreeper p_180571_1_, final float p_180571_2_, final float p_180571_3_) {
        final float f2 = p_180571_1_.getCreeperFlashIntensity(p_180571_3_);
        if ((int)(f2 * 10.0f) % 2 == 0) {
            return 0;
        }
        int i = (int)(f2 * 0.2f * 255.0f);
        i = MathHelper.clamp(i, 0, 255);
        return i << 24 | 0xFFFFFF;
    }
    
    protected ResourceLocation getEntityTextures(final EntityCreeper par1EntityCreeper) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return par1EntityCreeper.getPowered() ? RenderCMMRCreeper.texture2 : RenderCMMRCreeper.texture1;
        }
        return par1EntityCreeper.getPowered() ? RenderCMMRCreeper.texture2Bl : RenderCMMRCreeper.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity par1Entity) {
        return this.getEntityTextures((EntityCreeper)par1Entity);
    }
    
    protected int getColorMultiplier(final EntityLivingBase entitylivingbaseIn, final float lightBrightness, final float partialTickTime) {
        return this.func_180571_a((EntityCreeper)entitylivingbaseIn, lightBrightness, partialTickTime);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.updateCreeperScale((EntityCreeper)par1EntityLivingBase, par2);
    }
    
    static {
        armoredCreeperTextures = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Creeper.png");
        texture2 = new ResourceLocation("yarrmateys_cutemobmodels:textures/CreeperP.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlCreeper.png");
        texture2Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlCreeperP.png");
    }
}
