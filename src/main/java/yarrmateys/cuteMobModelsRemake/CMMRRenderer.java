//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.client.registry.*;
import net.minecraft.client.renderer.entity.*;
import yarrmateys.cuteMobModelsRemake.mobs.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;

@SideOnly(Side.CLIENT)
public class CMMRRenderer
{
    public static void preInit() {
    }
    
    public static void init() {
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRGhastS.class, (Render)new RenderCMMRGhastS(new ModelCMMRGhastS(0.0f, 0.0f), 0.3f));
        if (YarrCuteMobModelsRemake.enableMod) {
            if (YarrCuteMobModelsRemake.separateEntities) {
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRBlaze.class, (Render)new RenderCMMRBlaze(new ModelCMMRBlaze(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRCreeper.class, (Render)new RenderCMMRCreeper(new ModelCMMRCreeper(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRCaveSpider.class, (Render)new RenderCMMRCaveSpider(new ModelCMMRCaveSpider(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMREnderman.class, (Render)new RenderCMMREnderman(new ModelCMMREnderman(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRGhast.class, (Render)new RenderCMMRGhast(new ModelCMMRGhast(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRGuardian.class, (Render)new RenderCMMRGuardian(new ModelCMMRGuardian(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRElderGuardian.class, (Render)new RenderCMMRElderGuardian(new ModelCMMRElderGuardian(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRMagmaCube.class, (Render)new RenderCMMRMagmaCube(new ModelCMMRMagmaCube(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRPigZombie.class, (Render)new RenderCMMRPigZombie(new ModelCMMRPigZombie(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRSilverfish.class, (Render)new RenderCMMRSilverfish(new ModelCMMRSilverfish(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRSkeleton.class, (Render)new RenderCMMRSkeleton(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRWitherSkeleton.class, (Render)new RenderCMMRWitherSkeleton(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRStray.class, (Render)new RenderCMMRStray(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRSlime.class, (Render)new RenderCMMRSlime(new ModelCMMRSlime(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRSnowman.class, (Render)new RenderCMMRSnowGolem(new ModelCMMRSnowGolem(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRSpider.class, (Render)new RenderCMMRSpider(new ModelCMMRSpider(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRIronGolem.class, (Render)new RenderCMMRIronGolem(new ModelCMMRIronGolem(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRVillager.class, (Render)new RenderCMMRVillager(new ModelCMMRVillager(0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRWitch.class, (Render)new RenderCMMRWitch(new ModelCMMRWitch(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRWolf.class, (Render)new RenderCMMRWolf(new ModelCMMRWolf(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRZombie.class, (Render)new RenderCMMRZombie(new ModelCMMRZombie(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRZombieVillager.class, (Render)new RenderCMMRZombieVillager(new ModelCMMRZombieVillager(0.0f, 0.0f), 0.3f));
                RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRHusk.class, (Render)new RenderCMMRHusk(new ModelCMMRZombie(0.0f, 0.0f), 0.3f));
                if (YarrCuteMobModelsRemake.replaceAnimals && YarrCuteMobModelsRemake.MooshroomReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityCMMRMooshroom.class, (Render)new RenderCMMRMooshroom(new ModelCMMRMooshroom(0.0f, 0.0f), 0.3f));
                }
            }
            if (!YarrCuteMobModelsRemake.separateEntities) {
                if (YarrCuteMobModelsRemake.BlazeReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityBlaze.class, (Render)new RenderCMMRBlaze(new ModelCMMRBlaze(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.CaveSpiderReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityCaveSpider.class, (Render)new RenderCMMRCaveSpider(new ModelCMMRCaveSpider(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.EndermanReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityEnderman.class, (Render)new RenderCMMREnderman(new ModelCMMREnderman(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.GhastReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityGhast.class, (Render)new RenderCMMRGhast(new ModelCMMRGhast(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.GuardianReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityGuardian.class, (Render)new RenderCMMRGuardian(new ModelCMMRGuardian(0.0f, 0.0f), 0.3f));
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityElderGuardian.class, (Render)new RenderCMMRElderGuardian(new ModelCMMRElderGuardian(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.MagmaCubeReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityMagmaCube.class, (Render)new RenderCMMRMagmaCube(new ModelCMMRMagmaCube(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.SilverfishReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntitySilverfish.class, (Render)new RenderCMMRSilverfish(new ModelCMMRSilverfish(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.SlimeReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntitySlime.class, (Render)new RenderCMMRSlime(new ModelCMMRSlime(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.SpiderReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntitySpider.class, (Render)new RenderCMMRSpider(new ModelCMMRSpider(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.IronGolemReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityIronGolem.class, (Render)new RenderCMMRIronGolem(new ModelCMMRIronGolem(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.replaceAnimals && YarrCuteMobModelsRemake.MooshroomReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityMooshroom.class, (Render)new RenderCMMRMooshroom(new ModelCMMRMooshroom(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.CreeperReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityCreeper.class, (Render)new RenderCMMRCreeper(new ModelCMMRCreeper(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.PigZombieReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityPigZombie.class, (Render)new RenderCMMRPigZombie(new ModelCMMRPigZombie(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.SkeletonReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntitySkeleton.class, (Render)new RenderCMMRSkeleton(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityWitherSkeleton.class, (Render)new RenderCMMRWitherSkeleton(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityStray.class, (Render)new RenderCMMRStray(new ModelCMMRSkeleton(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.SnowGolemReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntitySnowman.class, (Render)new RenderCMMRSnowGolem(new ModelCMMRSnowGolem(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.VillagerReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityVillager.class, (Render)new RenderCMMRVillager(new ModelCMMRVillager(0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.WitchReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityWitch.class, (Render)new RenderCMMRWitch(new ModelCMMRWitch(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.WolfReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityWolf.class, (Render)new RenderCMMRWolf(new ModelCMMRWolf(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.ZombieReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityZombie.class, (Render)new RenderCMMRZombie(new ModelCMMRZombie(0.0f, 0.0f), 0.3f));
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityHusk.class, (Render)new RenderCMMRHusk(new ModelCMMRZombie(0.0f, 0.0f), 0.3f));
                }
                if (YarrCuteMobModelsRemake.ZombieVillagerReplaceModel) {
                    RenderingRegistry.registerEntityRenderingHandler((Class)EntityZombieVillager.class, (Render)new RenderCMMRZombieVillager(new ModelCMMRZombieVillager(0.0f, 0.0f), 0.3f));
                }
            }
        }
    }
}
