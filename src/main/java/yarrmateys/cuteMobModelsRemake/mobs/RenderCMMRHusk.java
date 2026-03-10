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
public class RenderCMMRHusk extends RenderLiving
{
    private static final ResourceLocation ZOMBIE_VILLAGER_BLANK;
    private static final ResourceLocation ZOMBIE_VILLAGER_FARMER;
    private static final ResourceLocation ZOMBIE_VILLAGER_LIBRARIAN;
    private static final ResourceLocation ZOMBIE_VILLAGER_PRIEST;
    private static final ResourceLocation ZOMBIE_VILLAGER_SMITH;
    private static final ResourceLocation ZOMBIE_VILLAGER_BUTCHER;
    private static final ResourceLocation ZOMBIE_VILLAGER_BLANK_BL;
    private static final ResourceLocation ZOMBIE_VILLAGER_FARMER_BL;
    private static final ResourceLocation ZOMBIE_VILLAGER_LIBRARIAN_BL;
    private static final ResourceLocation ZOMBIE_VILLAGER_PRIEST_BL;
    private static final ResourceLocation ZOMBIE_VILLAGER_SMITH_BL;
    private static final ResourceLocation ZOMBIE_VILLAGER_BUTCHER_BL;
    private static final ResourceLocation ZOMBIE_TEXTURES;
    private static final ResourceLocation ZOMBIE_TEXTURES_BL;
    private static final ResourceLocation HUSK_TEXTURES;
    private static final ResourceLocation HUSK_TEXTURES_BL;
    protected ModelCMMRZombie cuteModel;
    protected float field_40296_d;
    
    public RenderCMMRHusk(final ModelCMMRZombie modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCMMRZombieHeldItem((RenderLivingBase)this));
    }
    
    protected void updateZombieScale(final EntityHusk entity, final float par2) {
        if (entity.isChild()) {
            final float f1 = 0.5f;
            final float f2 = 0.5f;
            final float f3 = 0.5f;
            GlStateManager.scale(f1, f2, f3);
        }
        else {
            final float f1 = 1.0625f;
            final float f2 = 1.0625f;
            final float f3 = 1.0625f;
            GlStateManager.scale(f1, f2, f3);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float par2) {
        this.updateZombieScale((EntityHusk)entity, par2);
    }
    
    protected ResourceLocation getEntityTexture(final EntityHusk entity) {
        return YarrCuteMobModelsRemake.humanMobsModels ? RenderCMMRHusk.HUSK_TEXTURES_BL : RenderCMMRHusk.HUSK_TEXTURES;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTexture((EntityHusk)entity);
    }
    
    static {
        ZOMBIE_VILLAGER_BLANK = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV1.png");
        ZOMBIE_VILLAGER_FARMER = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV2.png");
        ZOMBIE_VILLAGER_LIBRARIAN = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV3.png");
        ZOMBIE_VILLAGER_PRIEST = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV4.png");
        ZOMBIE_VILLAGER_SMITH = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV5.png");
        ZOMBIE_VILLAGER_BUTCHER = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieV6.png");
        ZOMBIE_VILLAGER_BLANK_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV1.png");
        ZOMBIE_VILLAGER_FARMER_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV2.png");
        ZOMBIE_VILLAGER_LIBRARIAN_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV3.png");
        ZOMBIE_VILLAGER_PRIEST_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV4.png");
        ZOMBIE_VILLAGER_SMITH_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV5.png");
        ZOMBIE_VILLAGER_BUTCHER_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieV6.png");
        ZOMBIE_TEXTURES = new ResourceLocation("yarrmateys_cutemobmodels:textures/Zombie.png");
        ZOMBIE_TEXTURES_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombie.png");
        HUSK_TEXTURES = new ResourceLocation("yarrmateys_cutemobmodels:textures/ZombieHusk.png");
        HUSK_TEXTURES_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlZombieHusk.png");
    }
}
