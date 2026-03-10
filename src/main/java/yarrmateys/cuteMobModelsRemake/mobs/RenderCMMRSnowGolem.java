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
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class RenderCMMRSnowGolem extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    protected ModelCMMRSnowGolem cuteModel;
    
    public RenderCMMRSnowGolem(final ModelCMMRSnowGolem modelCMMR, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)modelCMMR, nameTagRange);
    }
    
    protected ResourceLocation getEntityTextures(final EntitySnowman par1EntitySnowGolem) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRSnowGolem.texture1;
        }
        return RenderCMMRSnowGolem.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTextures((EntitySnowman)entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/SGolem.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlSGolem.png");
    }
}
