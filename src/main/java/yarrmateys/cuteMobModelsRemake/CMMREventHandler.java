//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake;

import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class CMMREventHandler
{
    @SubscribeEvent
    public void OnEntityJoinWorld(final EntityJoinWorldEvent event) {
        if (!YarrCuteMobModelsRemake.enableMod || !event.getWorld().isRemote) {}
    }
}
