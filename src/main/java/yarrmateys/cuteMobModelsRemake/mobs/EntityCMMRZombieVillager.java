//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.network.datasync.*;

public class EntityCMMRZombieVillager extends EntityZombieVillager
{
    private static final DataParameter<Integer> VILLAGER_TYPE;
    private static final DataParameter<String> VILLAGER_TYPE_STR;
    
    public EntityCMMRZombieVillager(final World var1) {
        super(var1);
    }
    
    static {
        VILLAGER_TYPE = EntityDataManager.createKey((Class)EntityZombieVillager.class, DataSerializers.VARINT);
        VILLAGER_TYPE_STR = EntityDataManager.createKey((Class)EntityZombieVillager.class, DataSerializers.STRING);
    }
}
