//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.network.datasync.*;

public class EntityCMMRZombie extends EntityZombie
{
    private static final DataParameter<Integer> VILLAGER_TYPE;
    private static final DataParameter<String> VILLAGER_TYPE_STR;
    
    public EntityCMMRZombie(final World var1) {
        super(var1);
    }
    
    public int getProfession() {
        return Math.max((int)this.dataManager.get((DataParameter)EntityCMMRZombie.VILLAGER_TYPE) % 5, 0);
    }
    
    static {
        VILLAGER_TYPE = EntityDataManager.createKey((Class)EntityZombie.class, DataSerializers.VARINT);
        VILLAGER_TYPE_STR = EntityDataManager.createKey((Class)EntityZombie.class, DataSerializers.STRING);
    }
}
