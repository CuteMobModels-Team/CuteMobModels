//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake;

import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraftforge.fml.client.config.*;
import net.minecraftforge.common.config.*;
import net.minecraft.client.resources.*;

public class CMMRConfigGui extends GuiConfig
{
    public CMMRConfigGui(final GuiScreen parent) {
        super(parent, (List)getConfigElements(), "yarrmateys_cutemobmodels", false, false, GuiConfig.getAbridgedConfigPath(YarrCuteMobModelsRemake.configFile.toString()));
    }
    
    private static List<IConfigElement> getConfigElements() {
        final List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add((IConfigElement)new DummyConfigElement.DummyCategoryElement("generalOptions", "yarrmateys_cutemobmodels.config.general.generalOptions", (Class)GenericEntry.class));
        list.add((IConfigElement)new DummyConfigElement.DummyCategoryElement("modelHostileReplace", "yarrmateys_cutemobmodels.config.general.modelHostileReplace", (Class)MonsterEntry.class));
        list.add((IConfigElement)new DummyConfigElement.DummyCategoryElement("modelPassiveReplace", "yarrmateys_cutemobmodels.config.general.modelPassiveReplace", (Class)PassiveEntry.class));
        list.add((IConfigElement)new DummyConfigElement.DummyCategoryElement("hitboxScale", "yarrmateys_cutemobmodels.config.general.hitboxScale", (Class)HitboxEntry.class));
        list.add((IConfigElement)new DummyConfigElement.DummyCategoryElement("otherSettings", "yarrmateys_cutemobmodels.config.general.otherSettings", (Class)OtherEntry.class));
        return list;
    }
    
    public static class GenericEntry extends GuiConfigEntries.CategoryEntry
    {
        public GenericEntry(final GuiConfig owningScreen, final GuiConfigEntries owningEntryList, final IConfigElement prop) {
            super(owningScreen, owningEntryList, prop);
        }
        
        protected GuiScreen buildChildScreen() {
            return (GuiScreen)new GuiConfig((GuiScreen)this.owningScreen, new ConfigElement(YarrCuteMobModelsRemake.configFile.getCategory("generic_settings")).getChildElements(), "yarrmateys_cutemobmodels", false, false, I18n.format("General mod settings", new Object[0]));
        }
    }
    
    public static class MonsterEntry extends GuiConfigEntries.CategoryEntry
    {
        public MonsterEntry(final GuiConfig owningScreen, final GuiConfigEntries owningEntryList, final IConfigElement prop) {
            super(owningScreen, owningEntryList, prop);
        }
        
        protected GuiScreen buildChildScreen() {
            return (GuiScreen)new GuiConfig((GuiScreen)this.owningScreen, new ConfigElement(YarrCuteMobModelsRemake.configFile.getCategory("hostile_mob_settings")).getChildElements(), "yarrmateys_cutemobmodels", false, false, I18n.format("Hostile mob model replacement settings", new Object[0]));
        }
    }
    
    public static class PassiveEntry extends GuiConfigEntries.CategoryEntry
    {
        public PassiveEntry(final GuiConfig owningScreen, final GuiConfigEntries owningEntryList, final IConfigElement prop) {
            super(owningScreen, owningEntryList, prop);
        }
        
        protected GuiScreen buildChildScreen() {
            return (GuiScreen)new GuiConfig((GuiScreen)this.owningScreen, new ConfigElement(YarrCuteMobModelsRemake.configFile.getCategory("passive_mob_settings")).getChildElements(), "yarrmateys_cutemobmodels", false, false, I18n.format("Passive mob model replacement settings", new Object[0]));
        }
    }
    
    public static class HitboxEntry extends GuiConfigEntries.CategoryEntry
    {
        public HitboxEntry(final GuiConfig owningScreen, final GuiConfigEntries owningEntryList, final IConfigElement prop) {
            super(owningScreen, owningEntryList, prop);
        }
        
        protected GuiScreen buildChildScreen() {
            return (GuiScreen)new GuiConfig((GuiScreen)this.owningScreen, new ConfigElement(YarrCuteMobModelsRemake.configFile.getCategory("hitbox_settings")).getChildElements(), "yarrmateys_cutemobmodels", false, false, I18n.format("Hitbox and model scale settings", new Object[0]));
        }
    }
    
    public static class OtherEntry extends GuiConfigEntries.CategoryEntry
    {
        public OtherEntry(final GuiConfig owningScreen, final GuiConfigEntries owningEntryList, final IConfigElement prop) {
            super(owningScreen, owningEntryList, prop);
        }
        
        protected GuiScreen buildChildScreen() {
            return (GuiScreen)new GuiConfig((GuiScreen)this.owningScreen, new ConfigElement(YarrCuteMobModelsRemake.configFile.getCategory("other_settings")).getChildElements(), "yarrmateys_cutemobmodels", false, false, I18n.format("Other mob related settings", new Object[0]));
        }
    }
}
