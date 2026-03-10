//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.entity.passive.*;
import net.minecraft.client.renderer.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRVillager extends RenderLiving
{
    private static final ResourceLocation VILLAGER_UNUSED;
    private static final ResourceLocation VILLAGER_FARMER;
    private static final ResourceLocation VILLAGER_LIBRARIAN;
    private static final ResourceLocation VILLAGER_PRIEST;
    private static final ResourceLocation VILLAGER_SMITH;
    private static final ResourceLocation VILLAGER_BUTCHER;
    private static final ResourceLocation VILLAGER_UNUSED_BL;
    private static final ResourceLocation VILLAGER_FARMER_BL;
    private static final ResourceLocation VILLAGER_LIBRARIAN_BL;
    private static final ResourceLocation VILLAGER_PRIEST_BL;
    private static final ResourceLocation VILLAGER_SMITH_BL;
    private static final ResourceLocation VILLAGER_BUTCHER_BL;
    private ModelCMMRVillager cuteModel;
    
    public RenderCMMRVillager(final ModelCMMRVillager modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
        this.addLayer((LayerRenderer)new LayerCustomHead(this.func_177134_g().villagerHead));
    }
    
    public ModelCMMRVillager func_177134_g() {
        return (ModelCMMRVillager)super.getMainModel();
    }
    
    protected void preRenderVillager(final EntityVillager par1EntityVillager, final float par2) {
        float f1 = 0.9375f;
        if (par1EntityVillager.getGrowingAge() < 0) {
            f1 *= 0.5;
            this.shadowSize = 0.25f;
        }
        else {
            this.shadowSize = 0.5f;
        }
        GlStateManager.scale(f1, f1, f1);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
        this.preRenderVillager((EntityVillager)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation getEntityTextures(final EntityVillager entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            switch (entity.getProfession()) {
                case 0: {
                    return RenderCMMRVillager.VILLAGER_FARMER;
                }
                case 1: {
                    return RenderCMMRVillager.VILLAGER_LIBRARIAN;
                }
                case 2: {
                    return RenderCMMRVillager.VILLAGER_PRIEST;
                }
                case 3: {
                    return RenderCMMRVillager.VILLAGER_SMITH;
                }
                case 4: {
                    return RenderCMMRVillager.VILLAGER_BUTCHER;
                }
                default: {
                    return entity.getProfessionForge().getSkin();
                }
            }
        }
        else {
            switch (entity.getProfession()) {
                case 0: {
                    return RenderCMMRVillager.VILLAGER_FARMER_BL;
                }
                case 1: {
                    return RenderCMMRVillager.VILLAGER_LIBRARIAN_BL;
                }
                case 2: {
                    return RenderCMMRVillager.VILLAGER_PRIEST_BL;
                }
                case 3: {
                    return RenderCMMRVillager.VILLAGER_SMITH_BL;
                }
                case 4: {
                    return RenderCMMRVillager.VILLAGER_BUTCHER_BL;
                }
                default: {
                    return entity.getProfessionForge().getSkin();
                }
            }
        }
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntityVillager)entity);
    }
    
    static {
        VILLAGER_UNUSED = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill1.png");
        VILLAGER_FARMER = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill2.png");
        VILLAGER_LIBRARIAN = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill3.png");
        VILLAGER_PRIEST = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill4.png");
        VILLAGER_SMITH = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill5.png");
        VILLAGER_BUTCHER = new ResourceLocation("yarrmateys_cutemobmodels:textures/Vill6.png");
        VILLAGER_UNUSED_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill1.png");
        VILLAGER_FARMER_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill2.png");
        VILLAGER_LIBRARIAN_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill3.png");
        VILLAGER_PRIEST_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill4.png");
        VILLAGER_SMITH_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill5.png");
        VILLAGER_BUTCHER_BL = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlVill6.png");
    }
}
