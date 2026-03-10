//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs.layers;

import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.item.*;
import net.minecraft.entity.passive.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class LayerCMMRWolfCollar implements LayerRenderer
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    private final RenderCMMRWolf param1;
    
    public LayerCMMRWolfCollar(final RenderCMMRWolf par1) {
        this.param1 = par1;
    }
    
    public void func_177145_a(final EntityWolf p_177145_1_, final float p_177145_2_, final float p_177145_3_, final float p_177145_4_, final float p_177145_5_, final float p_177145_6_, final float p_177145_7_, final float p_177145_8_) {
        if (p_177145_1_.isTamed() && !p_177145_1_.isInvisible()) {
            if (!YarrCuteMobModelsRemake.humanMobsModels) {
                this.param1.bindTexture(LayerCMMRWolfCollar.texture1);
            }
            else {
                this.param1.bindTexture(LayerCMMRWolfCollar.texture1Bl);
            }
            final EnumDyeColor enumdyecolor = EnumDyeColor.byMetadata(p_177145_1_.getCollarColor().getDyeDamage());
            final float[] afloat = EntitySheep.getDyeRgb(enumdyecolor);
            GlStateManager.color(afloat[0], afloat[1], afloat[2]);
            this.param1.getMainModel().render((Entity)p_177145_1_, p_177145_2_, p_177145_3_, p_177145_5_, p_177145_6_, p_177145_7_, p_177145_8_);
        }
    }
    
    public boolean shouldCombineTextures() {
        return true;
    }
    
    public void doRenderLayer(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        this.func_177145_a((EntityWolf)entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Wolf_Collar.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlWolf_Collar.png");
    }
}
