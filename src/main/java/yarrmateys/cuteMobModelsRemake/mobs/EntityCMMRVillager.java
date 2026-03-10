//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.network.datasync.*;

public class EntityCMMRVillager extends EntityVillager
{
    private static final DataParameter<Integer> PROFESSION;
    private static final DataParameter<String> PROFESSION_STR;
    
    public EntityCMMRVillager(final World var1) {
        super(var1);
    }
    
    static {
        PROFESSION = EntityDataManager.createKey((Class)EntityVillager.class, DataSerializers.VARINT);
        PROFESSION_STR = EntityDataManager.createKey((Class)EntityVillager.class, DataSerializers.STRING);
    }
}
