//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake;

import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import java.util.*;
import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

@Mod(modid = "yarrmateys_cutemobmodels", version = "1.0.16", name = "Yarr Cute Mob Models - Remake", guiFactory = "yarrmateys.cuteMobModelsRemake.CMMRGuiFactory", acceptedMinecraftVersions = "[1.12]")
public class YarrCuteMobModelsRemake
{
    public static final String PATH = "yarrmateys.cuteMobModelsRemake.";
    public static final String MODID = "yarrmateys_cutemobmodels";
    public static final String NAME = "Yarr Cute Mob Models - Remake";
    public static final String VERSION = "1.0.16";
    public static final String GUIFACTORY = "yarrmateys.cuteMobModelsRemake.CMMRGuiFactory";
    @Mod.Instance("yarrmateys_cutemobmodels")
    public static YarrCuteMobModelsRemake instance;
    public static Configuration configFile;
    @SidedProxy(clientSide = "yarrmateys.cuteMobModelsRemake.CMMRClientProxy", serverSide = "yarrmateys.cuteMobModelsRemake.CMMRCommonProxy")
    public static CMMRCommonProxy proxy;
    public static boolean enableMod;
    public static boolean enableOptions;
    public static boolean humanMobsModels;
    public static boolean separateEntities;
    public static boolean replaceAnimals;
    public static boolean BlazeReplaceModel;
    public static boolean BlazeHideBlazeRods;
    public static boolean BlazeHideSmokeParticles;
    public static boolean CaveSpiderReplaceModel;
    public static boolean CaveSpiderUseAccurateModelSize;
    public static boolean CaveSpiderUseAccurateHitbox;
    public static boolean CreeperReplaceModel;
    public static boolean EndermanReplaceModel;
    public static boolean EndermanUseAccurateModelSize;
    public static boolean EndermanUseAccurateHitbox;
    public static boolean GhastReplaceModel;
    public static boolean GhastUseAccurateModelSize;
    public static boolean GhastUseAccurateHitbox;
    public static boolean GhastSSpawnGhastSister;
    public static boolean GhastSBrutalGhastSister;
    public static boolean GuardianReplaceModel;
    public static boolean GuardianUseAccurateModelSize;
    public static boolean GuardianUseAccurateHitbox;
    public static boolean MagmaCubeReplaceModel;
    public static boolean MagmaCubeUseAccurateHitbox;
    public static boolean MagmaCubeUseAccurateModelSize;
    public static boolean PigZombieReplaceModel;
    public static boolean PigZombieExtendedHands;
    public static boolean SilverfishReplaceModel;
    public static boolean SilverfishUseAccurateHitbox;
    public static boolean SilverfishUseAccurateModelSize;
    public static boolean SkeletonReplaceModel;
    public static boolean SkeletonAimedBow;
    public static boolean SkeletonUseAccurateModelSize;
    public static boolean SlimeReplaceModel;
    public static boolean SlimeUseAccurateHitbox;
    public static boolean SlimeUseAccurateModelSize;
    public static boolean SpiderReplaceModel;
    public static boolean SpiderUseAccurateModelSize;
    public static boolean SpiderUseAccurateHitbox;
    public static boolean WitchReplaceModel;
    public static boolean ZombieReplaceModel;
    public static boolean ZombieExtendedHands;
    public static boolean IronGolemReplaceModel;
    public static boolean IronGolemUseAccurateHitbox;
    public static boolean IronGolemUseAccurateModelSize;
    public static boolean SnowGolemReplaceModel;
    public static boolean GolemEnableEgg;
    public static boolean VillagerReplaceModel;
    public static boolean ZombieVillagerReplaceModel;
    public static boolean WolfReplaceModel;
    public static boolean MooshroomReplaceModel;
    public static boolean MooshroomUseAccurateHitbox;
    public static boolean MooshroomUseAccurateModelSize;
    public static final String CATEGORY_GENERIC = "generic_settings";
    public static final String CATEGORY_MONSTERS = "hostile_mob_settings";
    public static final String CATEGORY_FRIENDLY = "passive_mob_settings";
    public static final String CATEGORY_HITBOX = "hitbox_settings";
    public static final String CATEGORY_OTHER = "other_settings";
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        final Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        YarrCuteMobModelsRemake.configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();
        FMLInterModComms.sendRuntimeMessage((Object)"yarrmateys_cutemobmodels", "VersionChecker", "addVersionCheck", "https://dl.dropboxusercontent.com/u/62600417/Minecraft/yarrCuteMobModels.json");
        MinecraftForge.EVENT_BUS.register((Object)YarrCuteMobModelsRemake.instance);
        if (YarrCuteMobModelsRemake.enableMod) {
            CMMREntities.preInit();
            if (FMLCommonHandler.instance().getSide().isClient()) {
                CMMRRenderer.preInit();
            }
        }
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        if (YarrCuteMobModelsRemake.enableMod) {
            CMMREntities.init();
            if (FMLCommonHandler.instance().getSide().isClient()) {
                CMMRRenderer.init();
            }
        }
    }
    
    public static void syncConfig() {
        final List<String> propOrder = new ArrayList<String>();
        Property prop = YarrCuteMobModelsRemake.configFile.get("generic_settings", "enableMod", true);
        prop.setComment("This will turn most of the mod on or off. Everything but the Ghast Sister's rendering will be disabled if it's off.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.general.enableMod");
        YarrCuteMobModelsRemake.enableMod = prop.getBoolean(YarrCuteMobModelsRemake.enableMod);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("generic_settings", "humanMobsModels", false);
        prop.setComment("Replaces the models with more blocky minecraft-y versions of themselves.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.general.humanMobsModels");
        YarrCuteMobModelsRemake.humanMobsModels = prop.getBoolean(YarrCuteMobModelsRemake.humanMobsModels);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("generic_settings", "separateEntities", false);
        prop.setComment("This will spawn the cute mob model enemies as variations of the original mobs instead of replacing the original ones' models, so both can coexist. Note, this disables the regular mob replacement. Requires minecraft to be restarted.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.general.separateEntities");
        YarrCuteMobModelsRemake.separateEntities = prop.getBoolean(YarrCuteMobModelsRemake.separateEntities);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("generic_settings", "replaceAnimals", true);
        prop.setComment("This will replace animals with their humanoid versions. In case you're not comfortable with killing them for food, you can turn it off.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.general.replaceAnimals");
        YarrCuteMobModelsRemake.replaceAnimals = prop.getBoolean(YarrCuteMobModelsRemake.replaceAnimals);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "BlazeReplaceModel", true);
        prop.setComment("This will change the Blaze model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.blaze");
        YarrCuteMobModelsRemake.BlazeReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.BlazeReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "CreeperReplaceModel", true);
        prop.setComment("This will change the Creeper model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.creeper");
        YarrCuteMobModelsRemake.CreeperReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.CreeperReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "CaveSpiderReplaceModel", true);
        prop.setComment("This will change the Cave Spider model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.cavespider");
        YarrCuteMobModelsRemake.CaveSpiderReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.CaveSpiderReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "EndermanReplaceModel", true);
        prop.setComment("This will change the Enderman model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.enderman");
        YarrCuteMobModelsRemake.EndermanReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.EndermanReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "GhastReplaceModel", true);
        prop.setComment("This will change the Ghast model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.ghast");
        YarrCuteMobModelsRemake.GhastReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.GhastReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "GuardianReplaceModel", true);
        prop.setComment("This will change the Guardian model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.guardian");
        YarrCuteMobModelsRemake.GuardianReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.GuardianReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "PigZombieReplaceModel", true);
        prop.setComment("This will change the Zombie Pigman model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.pigzombie");
        YarrCuteMobModelsRemake.PigZombieReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.PigZombieReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "MagmaCubeReplaceModel", true);
        prop.setComment("This will change the Magma Cube model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.magmacube");
        YarrCuteMobModelsRemake.MagmaCubeReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.MagmaCubeReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "SilverfishReplaceModel", true);
        prop.setComment("This will change the Silverfish model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.silverfish");
        YarrCuteMobModelsRemake.SilverfishReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.SilverfishReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "SkeletonReplaceModel", true);
        prop.setComment("This will change the Skeleton model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.skeleton");
        YarrCuteMobModelsRemake.SkeletonReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.SkeletonReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "SlimeReplaceModel", true);
        prop.setComment("This will change the Slime model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.slime");
        YarrCuteMobModelsRemake.SlimeReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.SlimeReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "SpiderReplaceModel", true);
        prop.setComment("This will change the Spider model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.spider");
        YarrCuteMobModelsRemake.SpiderReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.SpiderReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "WitchReplaceModel", true);
        prop.setComment("This will change the Witch model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.witch");
        YarrCuteMobModelsRemake.WitchReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.WitchReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "ZombieReplaceModel", true);
        prop.setComment("This will change the Zombie model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.zombie");
        YarrCuteMobModelsRemake.ZombieReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.ZombieReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hostile_mob_settings", "ZombieVillagerReplaceModel", true);
        prop.setComment("This will change the Zombie Villager model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.zombievillager");
        YarrCuteMobModelsRemake.ZombieVillagerReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.ZombieVillagerReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("passive_mob_settings", "IronGolemReplaceModel", true);
        prop.setComment("This will change the Iron Golem model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.irongolem");
        YarrCuteMobModelsRemake.IronGolemReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.IronGolemReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("passive_mob_settings", "MooshroomReplaceModel", true);
        prop.setComment("This will change the Mooshroom model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.mooshroom");
        YarrCuteMobModelsRemake.MooshroomReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.MooshroomReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("passive_mob_settings", "SnowGolemReplaceModel", true);
        prop.setComment("This will change the Snow Golem model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.snowgolem");
        YarrCuteMobModelsRemake.SnowGolemReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.SnowGolemReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("passive_mob_settings", "VillagerReplaceModel", true);
        prop.setComment("This will change the Villager model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.villager");
        YarrCuteMobModelsRemake.VillagerReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.VillagerReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("passive_mob_settings", "WolfReplaceModel", true);
        prop.setComment("This will change the Wolf model into the mobtalker design.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.model.passive.wolf");
        YarrCuteMobModelsRemake.WolfReplaceModel = prop.getBoolean(YarrCuteMobModelsRemake.WolfReplaceModel);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "CaveSpiderUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.CaveSpider");
        YarrCuteMobModelsRemake.CaveSpiderUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.CaveSpiderUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "EndermanUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Enderman");
        YarrCuteMobModelsRemake.EndermanUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.EndermanUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "GhastUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Ghast");
        YarrCuteMobModelsRemake.GhastUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.GhastUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "GuardianUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Guardian");
        YarrCuteMobModelsRemake.GuardianUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.GuardianUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "MagmaCubeUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.MagmaCube");
        YarrCuteMobModelsRemake.MagmaCubeUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.MagmaCubeUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "SilverfishUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Silverfish");
        YarrCuteMobModelsRemake.SilverfishUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.SilverfishUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "SkeletonUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Skeleton");
        YarrCuteMobModelsRemake.SkeletonUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.SkeletonUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "SlimeUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Slime");
        YarrCuteMobModelsRemake.SlimeUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.SlimeUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "SpiderUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Spider");
        YarrCuteMobModelsRemake.SpiderUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.SpiderUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "IronGolemUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.IronGolem");
        YarrCuteMobModelsRemake.IronGolemUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.IronGolemUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("hitbox_settings", "MooshroomUseAccurateModelSize", false);
        prop.setComment("This will adjust the model size to match the hitbox's size.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.hitbox2.Mooshroom");
        YarrCuteMobModelsRemake.MooshroomUseAccurateModelSize = prop.getBoolean(YarrCuteMobModelsRemake.MooshroomUseAccurateModelSize);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "BlazeHideBlazeRods", false);
        prop.setComment("This will hide the blaze rods floating around Blaze.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.blazerods");
        YarrCuteMobModelsRemake.BlazeHideBlazeRods = prop.getBoolean(YarrCuteMobModelsRemake.BlazeHideBlazeRods);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "GolemEnableEgg", false);
        prop.setComment("This will enable the spawn eggs for both vanilla golems.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.golemspawn");
        YarrCuteMobModelsRemake.GolemEnableEgg = prop.getBoolean(YarrCuteMobModelsRemake.GolemEnableEgg);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "GhastSSpawnGhastSister", true);
        prop.setComment("This will allow spawning of the Ghast Sister mob.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.spawnghasts");
        YarrCuteMobModelsRemake.GhastSSpawnGhastSister = prop.getBoolean(YarrCuteMobModelsRemake.GhastSSpawnGhastSister);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "GhastSBrutalGhastSister", true);
        prop.setComment("This will make the Ghast Sister mob more difficult.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.brutalghasts");
        YarrCuteMobModelsRemake.GhastSBrutalGhastSister = prop.getBoolean(YarrCuteMobModelsRemake.GhastSBrutalGhastSister);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "PigZombieExtendedHands", true);
        prop.setComment("This will make Zombie Pigman extend its arms forward.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.pigzombiehands");
        YarrCuteMobModelsRemake.PigZombieExtendedHands = prop.getBoolean(YarrCuteMobModelsRemake.PigZombieExtendedHands);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "SkeletonAimedBow", true);
        prop.setComment("When holding a bow, the skeleton will use a different animation.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.skeletonaimedbow");
        YarrCuteMobModelsRemake.SkeletonAimedBow = prop.getBoolean(YarrCuteMobModelsRemake.SkeletonAimedBow);
        propOrder.add(prop.getName());
        prop = YarrCuteMobModelsRemake.configFile.get("other_settings", "ZombieExtendedHands", true);
        prop.setComment("This will make Zombie extend its arms forward.");
        prop.setLanguageKey("yarrmateys_cutemobmodels.config.other.zombiehands");
        YarrCuteMobModelsRemake.ZombieExtendedHands = prop.getBoolean(YarrCuteMobModelsRemake.ZombieExtendedHands);
        propOrder.add(prop.getName());
        if (YarrCuteMobModelsRemake.configFile.hasChanged()) {
            YarrCuteMobModelsRemake.configFile.save();
        }
    }
    
    @SubscribeEvent
    public void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.getModID().equals("yarrmateys_cutemobmodels")) {
            syncConfig();
        }
    }
    
    public static void registerEntityEgg(final Class<? extends Entity> entityClass, final String entityName, final int baseColor, final int spotColor) {
        final ResourceLocation id = new ResourceLocation("yarrmateys_cutemobmodels:");
        EntityList.ENTITY_EGGS.put(id, new EntityList.EntityEggInfo(id, baseColor, spotColor));
    }
    
    static {
        YarrCuteMobModelsRemake.instance = new YarrCuteMobModelsRemake();
    }
}
