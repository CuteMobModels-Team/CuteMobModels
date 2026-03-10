//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import yarrmateys.cuteMobModelsRemake.mobs.layers.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.entity.monster.*;
import net.minecraft.client.renderer.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRPigZombie extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    
    public RenderCMMRPigZombie(final ModelCMMRPigZombie modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRPigZombieHeldItem((RenderLivingBase)this));
    }
    
    protected void updatePigZombieScale(final EntityPigZombie par1EntityPigZombie, final float par2) {
        if (par1EntityPigZombie.isChild()) {
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
        this.updatePigZombieScale((EntityPigZombie)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityPigZombie par1EntityPigZombie) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRPigZombie.texture1;
        }
        return RenderCMMRPigZombie.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityPigZombie)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/PZombie.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlPZombie.png");
    }
}
