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
public class RenderCMMRBlaze extends RenderLiving
{
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture1Bl;
    
    public RenderCMMRBlaze(final ModelCMMRBlaze model, final float nameTagRange) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)model, nameTagRange);
    }
    
    protected ResourceLocation getEntityTextures(final EntityBlaze par1Entity) {
        if (!YarrCuteMobModelsRemake.humanMobsModels) {
            return RenderCMMRBlaze.texture1;
        }
        return RenderCMMRBlaze.texture1Bl;
    }
    
    protected ResourceLocation getEntityTexture(final Entity par1Entity) {
        return this.getEntityTextures((EntityBlaze)par1Entity);
    }
    
    static {
        texture1 = new ResourceLocation("yarrmateys_cutemobmodels:textures/Blaze.png");
        texture1Bl = new ResourceLocation("yarrmateys_cutemobmodels:textures/BlBlaze.png");
    }
}
