package io.github.fallOut015.extra_armor.util;

import io.github.fallOut015.extra_armor.MainExtraArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventsExtraArmor {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MainExtraArmor.MODID);



    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_STONE = SOUND_EVENTS.register("item_armor_equip_stone", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_stone")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_WOOD = SOUND_EVENTS.register("item_armor_equip_wood", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_wood")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_FUNGUS = SOUND_EVENTS.register("item_armor_equip_fungus", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_fungus")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_WOOL = SOUND_EVENTS.register("item_armor_equip_wool", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_wool")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_SPONGE = SOUND_EVENTS.register("item_armor_equip_sponge", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_sponge")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_GLOWSTONE = SOUND_EVENTS.register("item_armor_equip_glowstone", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_glowstone")));
    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_OBSIDIAN = SOUND_EVENTS.register("item_armor_equip_obsidian", () -> new SoundEvent(new ResourceLocation(MainExtraArmor.MODID, "item.armor.equip_obsidian")));



    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
