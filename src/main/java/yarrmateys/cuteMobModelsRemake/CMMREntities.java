//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake;

import net.minecraft.entity.*;
import net.minecraft.world.biome.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.registry.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.util.*;

public class CMMREntities
{
    public static void preInit() {
        if (YarrCuteMobModelsRemake.enableMod) {
            if (YarrCuteMobModelsRemake.GhastSSpawnGhastSister) {
                registerModEntity((Class<? extends Entity>)EntityCMMRGhastS.class, "GhastS", 0, 40, 1, true, 13158600, 15790320);
                EntityRegistry.addSpawn((Class)EntityCMMRGhastS.class, 50, 1, 4, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
            }
            if (YarrCuteMobModelsRemake.separateEntities) {
                registerModEntity((Class<? extends Entity>)EntityCMMRBlaze.class, "CMMBlaze", 1, 40, 1, true, 16167425, 16775294);
                EntityRegistry.addSpawn((Class)EntityCMMRBlaze.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
                registerModEntity((Class<? extends Entity>)EntityCMMRCaveSpider.class, "CMMCaveSpider", 2, 40, 1, true, 803406, 11013646);
                registerModEntity((Class<? extends Entity>)EntityCMMRCreeper.class, "CMMCreeper", 3, 40, 1, true, 894731, 0);
                EntityRegistry.addSpawn((Class)EntityCMMRCreeper.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMREnderman.class, "CMMEnderman", 4, 40, 1, true, 1447446, 0);
                EntityRegistry.addSpawn((Class)EntityCMMREnderman.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRGhast.class, "CMMGhast", 5, 40, 1, true, 16382457, 12369084);
                EntityRegistry.addSpawn((Class)EntityCMMRGhast.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
                registerModEntity((Class<? extends Entity>)EntityCMMRElderGuardian.class, "CMMElderGuardian", 6, 40, 1, true, 13552826, 7632531);
                registerModEntity((Class<? extends Entity>)EntityCMMRGuardian.class, "CMMGuardian", 7, 40, 1, true, 5931634, 15826224);
                registerModEntity((Class<? extends Entity>)EntityCMMRMagmaCube.class, "CMMLavaSlime", 8, 40, 1, true, 3407872, 16579584);
                EntityRegistry.addSpawn((Class)EntityCMMRMagmaCube.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
                registerModEntity((Class<? extends Entity>)EntityCMMRPigZombie.class, "CMMPigZombie", 9, 40, 1, true, 15373203, 5009705);
                EntityRegistry.addSpawn((Class)EntityCMMRPigZombie.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
                registerModEntity((Class<? extends Entity>)EntityCMMRSilverfish.class, "CMMSilverfish", 10, 40, 1, true, 7237230, 3158064);
                registerModEntity((Class<? extends Entity>)EntityCMMRSkeleton.class, "CMMSkeleton", 11, 40, 1, true, 12698049, 4802889);
                EntityRegistry.addSpawn((Class)EntityCMMRSkeleton.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRWitherSkeleton.class, "CMMWitherSkeleton", 12, 40, 1, true, 1315860, 4672845);
                EntityRegistry.addSpawn((Class)EntityCMMRWitherSkeleton.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.HELL });
                registerModEntity((Class<? extends Entity>)EntityCMMRStray.class, "CMMStray", 13, 40, 1, true, 6387319, 14543594);
                EntityRegistry.addSpawn((Class)EntityCMMRStray.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRSlime.class, "CMMSlime", 14, 40, 1, true, 5349438, 8306542);
                EntityRegistry.addSpawn((Class)EntityCMMRSlime.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.SWAMPLAND, Biomes.TAIGA });
                registerModEntity((Class<? extends Entity>)EntityCMMRSpider.class, "CMMSpider", 15, 40, 1, true, 3419431, 11013646);
                EntityRegistry.addSpawn((Class)EntityCMMRSpider.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRVillager.class, "CMMVillager", 16, 40, 1, true, 5651507, 12422002);
                EntityRegistry.addSpawn((Class)EntityCMMRSpider.class, 50, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.BEACH });
                registerModEntity((Class<? extends Entity>)EntityCMMRWitch.class, "CMMWitch", 17, 40, 1, true, 3407872, 5349438);
                EntityRegistry.addSpawn((Class)EntityCMMRWitch.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRWolf.class, "CMMWolf", 18, 40, 1, true, 14144467, 13545366);
                EntityRegistry.addSpawn((Class)EntityCMMRWolf.class, 50, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.TAIGA, Biomes.COLD_TAIGA });
                registerModEntity((Class<? extends Entity>)EntityCMMRZombie.class, "CMMZombie", 19, 40, 1, true, 44975, 7969893);
                EntityRegistry.addSpawn((Class)EntityCMMRZombie.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRZombieVillager.class, "CMMZombieVillager", 20, 40, 1, true, 5651507, 7969893);
                EntityRegistry.addSpawn((Class)EntityCMMRZombieVillager.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_BEACH, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.ICE_MOUNTAINS, Biomes.ICE_PLAINS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.FOREST, Biomes.MESA, Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS });
                registerModEntity((Class<? extends Entity>)EntityCMMRHusk.class, "CMMHusk", 21, 40, 1, true, 7958625, 15125652);
                EntityRegistry.addSpawn((Class)EntityCMMRHusk.class, 50, 1, 1, EnumCreatureType.MONSTER, new Biome[] { Biomes.DESERT });
                registerModEntity((Class<? extends Entity>)EntityCMMRIronGolem.class, "CMMVillagerGolem", 22, 40, 1, true, 15654607, 11442063);
                registerModEntity((Class<? extends Entity>)EntityCMMRSnowman.class, "CMMSnowGolem", 23, 40, 1, true, 15197924, 14183460);
                registerModEntity((Class<? extends Entity>)EntityCMMRMooshroom.class, "CMMMushroomCow", 24, 40, 1, true, 10489616, 12040119);
                EntityRegistry.addSpawn((Class)EntityCMMRMooshroom.class, 50, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.MUSHROOM_ISLAND, Biomes.MUSHROOM_ISLAND_SHORE });
            }
        }
    }
    
    public static void init() {
    }
    
    private static void registerModEntity(final Class<? extends Entity> entityClass, final String entityName, final int id, final int trackingRange, final int updateFrequency, final boolean sendsVelocityUpdates, final int eggPrimary, final int eggSecondary) {
        EntityRegistry.registerModEntity(new ResourceLocation("yarrmateys_cutemobmodels", entityName), (Class)entityClass, entityName, id, (Object)YarrCuteMobModelsRemake.instance, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);
    }
}
