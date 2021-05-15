package io.github.fallOut015.extra_armor.item;

import io.github.fallOut015.extra_armor.MainExtraArmor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsExtraArmor {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainExtraArmor.MODID);



    public static final RegistryObject<Item> CHAINMAIL_HORSE_ARMOR = ITEMS.register("chainmail_horse_armor", () -> new HorseArmorItem(4, "chainmail", new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () -> new HorseArmorItem(13, "netherite", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));

    public static final RegistryObject<Item> OAK_HORSE_ARMOR = ITEMS.register("oak_horse_armor", () -> new HorseArmorItem(2, "oak", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> SPRUCE_HORSE_ARMOR = ITEMS.register("spruce_horse_armor", () -> new HorseArmorItem(2, "spruce", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> BIRCH_HORSE_ARMOR = ITEMS.register("birch_horse_armor", () -> new HorseArmorItem(2, "birch", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> JUNGLE_HORSE_ARMOR = ITEMS.register("jungle_horse_armor", () -> new HorseArmorItem(2, "jungle", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> ACACIA_HORSE_ARMOR = ITEMS.register("acacia_horse_armor", () -> new HorseArmorItem(2, "acacia", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> DARK_OAK_HORSE_ARMOR = ITEMS.register("dark_oak_horse_armor", () -> new HorseArmorItem(2, "dark_oak", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> CRIMSON_HORSE_ARMOR = ITEMS.register("crimson_horse_armor", () -> new HorseArmorItem(2, "crimson", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> WARPED_HORSE_ARMOR = ITEMS.register("warped_horse_armor", () -> new HorseArmorItem(2, "warped", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));

    public static final RegistryObject<Item> WHITE_WOOLEN_HORSE_ARMOR = ITEMS.register("white_woolen_horse_armor", () -> new HorseArmorItem(3, "white_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> ORANGE_WOOLEN_HORSE_ARMOR = ITEMS.register("orange_woolen_horse_armor", () -> new HorseArmorItem(3, "orange_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> MAGENTA_WOOLEN_HORSE_ARMOR = ITEMS.register("magenta_woolen_horse_armor", () -> new HorseArmorItem(3, "magenta_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOLEN_HORSE_ARMOR = ITEMS.register("light_blue_woolen_horse_armor", () -> new HorseArmorItem(3, "light_blue_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> YELLOW_WOOLEN_HORSE_ARMOR = ITEMS.register("yellow_woolen_horse_armor", () -> new HorseArmorItem(3, "yellow_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> LIME_WOOLEN_HORSE_ARMOR = ITEMS.register("lime_woolen_horse_armor", () -> new HorseArmorItem(3, "lime_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> PINK_WOOLEN_HORSE_ARMOR = ITEMS.register("pink_woolen_horse_armor", () -> new HorseArmorItem(3, "pink_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> GRAY_WOOLEN_HORSE_ARMOR = ITEMS.register("gray_woolen_horse_armor", () -> new HorseArmorItem(3, "gray_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOLEN_HORSE_ARMOR = ITEMS.register("light_gray_woolen_horse_armor", () -> new HorseArmorItem(3, "light_gray_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> CYAN_WOOLEN_HORSE_ARMOR = ITEMS.register("cyan_woolen_horse_armor", () -> new HorseArmorItem(3, "cyan_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> PURPLE_WOOLEN_HORSE_ARMOR = ITEMS.register("purple_woolen_horse_armor", () -> new HorseArmorItem(3, "purple_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> BLUE_WOOLEN_HORSE_ARMOR = ITEMS.register("blue_woolen_horse_armor", () -> new HorseArmorItem(3, "blue_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> BROWN_WOOLEN_HORSE_ARMOR = ITEMS.register("brown_woolen_horse_armor", () -> new HorseArmorItem(3, "brown_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> GREEN_WOOLEN_HORSE_ARMOR = ITEMS.register("green_woolen_horse_armor", () -> new HorseArmorItem(3, "green_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> RED_WOOLEN_HORSE_ARMOR = ITEMS.register("red_woolen_horse_armor", () -> new HorseArmorItem(3, "red_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> BLACK_WOOLEN_HORSE_ARMOR = ITEMS.register("black_woolen_horse_armor", () -> new HorseArmorItem(3, "black_wool", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));

    public static final RegistryObject<Item> STONE_HORSE_ARMOR = ITEMS.register("stone_horse_armor", () -> new HorseArmorItem(4, "stone", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> SPONGE_HORSE_ARMOR = ITEMS.register("sponge_horse_armor", () -> new SpongeHorseArmorItem(3, "sponge", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> GLOWSTONE_HORSE_ARMOR = ITEMS.register("glowstone_horse_armor", () -> new HorseArmorItem(3, "glowstone", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));
    public static final RegistryObject<Item> OBSIDIAN_HORSE_ARMOR = ITEMS.register("obsidian_horse_armor", () -> new HorseArmorItem(10, "obsidian", new Item.Properties().stacksTo(1).tab((ItemGroup.TAB_MISC))));



    public static final RegistryObject<Item> OAK_HELMET = ITEMS.register("oak_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.OAK, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OAK_CHESTPLATE = ITEMS.register("oak_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.OAK, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OAK_LEGGINGS = ITEMS.register("oak_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.OAK, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OAK_BOOTS = ITEMS.register("oak_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.OAK, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> SPRUCE_HELMET = ITEMS.register("spruce_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.SPRUCE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPRUCE_CHESTPLATE = ITEMS.register("spruce_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.SPRUCE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPRUCE_LEGGINGS = ITEMS.register("spruce_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.SPRUCE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPRUCE_BOOTS = ITEMS.register("spruce_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.SPRUCE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> BIRCH_HELMET = ITEMS.register("birch_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.BIRCH, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BIRCH_CHESTPLATE = ITEMS.register("birch_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.BIRCH, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BIRCH_LEGGINGS = ITEMS.register("birch_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.BIRCH, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BIRCH_BOOTS = ITEMS.register("birch_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.BIRCH, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> JUNGLE_HELMET = ITEMS.register("jungle_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.JUNGLE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> JUNGLE_CHESTPLATE = ITEMS.register("jungle_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.JUNGLE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> JUNGLE_LEGGINGS = ITEMS.register("jungle_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.JUNGLE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> JUNGLE_BOOTS = ITEMS.register("jungle_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.JUNGLE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> ACACIA_HELMET = ITEMS.register("acacia_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.ACACIA, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ACACIA_CHESTPLATE = ITEMS.register("acacia_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.ACACIA, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ACACIA_LEGGINGS = ITEMS.register("acacia_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.ACACIA, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ACACIA_BOOTS = ITEMS.register("acacia_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.ACACIA, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> DARK_OAK_HELMET = ITEMS.register("dark_oak_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.DARK_OAK, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_OAK_CHESTPLATE = ITEMS.register("dark_oak_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.DARK_OAK, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_OAK_LEGGINGS = ITEMS.register("dark_oak_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.DARK_OAK, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_OAK_BOOTS = ITEMS.register("dark_oak_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.DARK_OAK, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CRIMSON_HELMET = ITEMS.register("crimson_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.CRIMSON, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CRIMSON_CHESTPLATE = ITEMS.register("crimson_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.CRIMSON, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CRIMSON_LEGGINGS = ITEMS.register("crimson_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.CRIMSON, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CRIMSON_BOOTS = ITEMS.register("crimson_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.CRIMSON, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> WARPED_HELMET = ITEMS.register("warped_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.WARPED, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WARPED_CHESTPLATE = ITEMS.register("warped_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.WARPED, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WARPED_LEGGINGS = ITEMS.register("warped_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.WARPED, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WARPED_BOOTS = ITEMS.register("warped_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.WARPED, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> WHITE_WOOLEN_HELMET = ITEMS.register("white_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.WHITE_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WHITE_WOOLEN_CHESTPLATE = ITEMS.register("white_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.WHITE_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WHITE_WOOLEN_LEGGINGS = ITEMS.register("white_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.WHITE_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> WHITE_WOOLEN_BOOTS = ITEMS.register("white_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.WHITE_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> ORANGE_WOOLEN_HELMET = ITEMS.register("orange_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.ORANGE_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ORANGE_WOOLEN_CHESTPLATE = ITEMS.register("orange_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.ORANGE_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ORANGE_WOOLEN_LEGGINGS = ITEMS.register("orange_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.ORANGE_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ORANGE_WOOLEN_BOOTS = ITEMS.register("orange_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.ORANGE_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGENTA_WOOLEN_HELMET = ITEMS.register("magenta_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.MAGENTA_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGENTA_WOOLEN_CHESTPLATE = ITEMS.register("magenta_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.MAGENTA_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGENTA_WOOLEN_LEGGINGS = ITEMS.register("magenta_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.MAGENTA_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGENTA_WOOLEN_BOOTS = ITEMS.register("magenta_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.MAGENTA_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> LIGHT_BLUE_WOOLEN_HELMET = ITEMS.register("light_blue_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_BLUE_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOLEN_CHESTPLATE = ITEMS.register("light_blue_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_BLUE_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOLEN_LEGGINGS = ITEMS.register("light_blue_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_BLUE_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOLEN_BOOTS = ITEMS.register("light_blue_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_BLUE_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> YELLOW_WOOLEN_HELMET = ITEMS.register("yellow_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.YELLOW_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> YELLOW_WOOLEN_CHESTPLATE = ITEMS.register("yellow_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.YELLOW_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> YELLOW_WOOLEN_LEGGINGS = ITEMS.register("yellow_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.YELLOW_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> YELLOW_WOOLEN_BOOTS = ITEMS.register("yellow_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.YELLOW_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> LIME_WOOLEN_HELMET = ITEMS.register("lime_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.LIME_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIME_WOOLEN_CHESTPLATE = ITEMS.register("lime_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.LIME_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIME_WOOLEN_LEGGINGS = ITEMS.register("lime_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.LIME_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIME_WOOLEN_BOOTS = ITEMS.register("lime_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.LIME_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> PINK_WOOLEN_HELMET = ITEMS.register("pink_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.PINK_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PINK_WOOLEN_CHESTPLATE = ITEMS.register("pink_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.PINK_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PINK_WOOLEN_LEGGINGS = ITEMS.register("pink_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.PINK_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PINK_WOOLEN_BOOTS = ITEMS.register("pink_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.PINK_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> GRAY_WOOLEN_HELMET = ITEMS.register("gray_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.GRAY_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAY_WOOLEN_CHESTPLATE = ITEMS.register("gray_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.GRAY_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAY_WOOLEN_LEGGINGS = ITEMS.register("gray_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.GRAY_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAY_WOOLEN_BOOTS = ITEMS.register("gray_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.GRAY_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> LIGHT_GRAY_WOOLEN_HELMET = ITEMS.register("light_gray_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_GRAY_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOLEN_CHESTPLATE = ITEMS.register("light_gray_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_GRAY_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOLEN_LEGGINGS = ITEMS.register("light_gray_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_GRAY_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOLEN_BOOTS = ITEMS.register("light_gray_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.LIGHT_GRAY_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CYAN_WOOLEN_HELMET = ITEMS.register("cyan_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.CYAN_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CYAN_WOOLEN_CHESTPLATE = ITEMS.register("cyan_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.CYAN_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CYAN_WOOLEN_LEGGINGS = ITEMS.register("cyan_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.CYAN_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> CYAN_WOOLEN_BOOTS = ITEMS.register("cyan_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.CYAN_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> PURPLE_WOOLEN_HELMET = ITEMS.register("purple_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.PURPLE_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PURPLE_WOOLEN_CHESTPLATE = ITEMS.register("purple_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.PURPLE_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PURPLE_WOOLEN_LEGGINGS = ITEMS.register("purple_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.PURPLE_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PURPLE_WOOLEN_BOOTS = ITEMS.register("purple_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.PURPLE_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> BLUE_WOOLEN_HELMET = ITEMS.register("blue_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.BLUE_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_WOOLEN_CHESTPLATE = ITEMS.register("blue_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.BLUE_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_WOOLEN_LEGGINGS = ITEMS.register("blue_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.BLUE_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_WOOLEN_BOOTS = ITEMS.register("blue_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.BLUE_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> BROWN_WOOLEN_HELMET = ITEMS.register("brown_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.BROWN_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BROWN_WOOLEN_CHESTPLATE = ITEMS.register("brown_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.BROWN_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BROWN_WOOLEN_LEGGINGS = ITEMS.register("brown_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.BROWN_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BROWN_WOOLEN_BOOTS = ITEMS.register("brown_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.BROWN_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> GREEN_WOOLEN_HELMET = ITEMS.register("green_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.GREEN_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GREEN_WOOLEN_CHESTPLATE = ITEMS.register("green_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.GREEN_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GREEN_WOOLEN_LEGGINGS = ITEMS.register("green_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.GREEN_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GREEN_WOOLEN_BOOTS = ITEMS.register("green_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.GREEN_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> RED_WOOLEN_HELMET = ITEMS.register("red_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.RED_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RED_WOOLEN_CHESTPLATE = ITEMS.register("red_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.RED_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RED_WOOLEN_LEGGINGS = ITEMS.register("red_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.RED_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RED_WOOLEN_BOOTS = ITEMS.register("red_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.RED_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> BLACK_WOOLEN_HELMET = ITEMS.register("black_woolen_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.BLACK_WOOL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLACK_WOOLEN_CHESTPLATE = ITEMS.register("black_woolen_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.BLACK_WOOL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLACK_WOOLEN_LEGGINGS = ITEMS.register("black_woolen_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.BLACK_WOOL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BLACK_WOOLEN_BOOTS = ITEMS.register("black_woolen_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.BLACK_WOOL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> STONE_HELMET = ITEMS.register("stone_helmet", () -> new ArmorItem(ArmorMaterialExtraArmor.STONE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate", () -> new ArmorItem(ArmorMaterialExtraArmor.STONE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings", () -> new ArmorItem(ArmorMaterialExtraArmor.STONE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_BOOTS = ITEMS.register("stone_boots", () -> new ArmorItem(ArmorMaterialExtraArmor.STONE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> SPONGE_HELMET = ITEMS.register("sponge_helmet", () -> new SpongeArmorItem(ArmorMaterialExtraArmor.SPONGE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPONGE_CHESTPLATE = ITEMS.register("sponge_chestplate", () -> new SpongeArmorItem(ArmorMaterialExtraArmor.SPONGE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPONGE_LEGGINGS = ITEMS.register("sponge_leggings", () -> new SpongeArmorItem(ArmorMaterialExtraArmor.SPONGE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SPONGE_BOOTS = ITEMS.register("sponge_boots", () -> new SpongeArmorItem(ArmorMaterialExtraArmor.SPONGE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> GLOWSTONE_HELMET = ITEMS.register("glowstone_helmet", () -> new GlowstoneArmorItem(ArmorMaterialExtraArmor.GLOWSTONE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GLOWSTONE_CHESTPLATE = ITEMS.register("glowstone_chestplate", () -> new GlowstoneArmorItem(ArmorMaterialExtraArmor.GLOWSTONE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GLOWSTONE_LEGGINGS = ITEMS.register("glowstone_leggings", () -> new GlowstoneArmorItem(ArmorMaterialExtraArmor.GLOWSTONE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GLOWSTONE_BOOTS = ITEMS.register("glowstone_boots", () -> new GlowstoneArmorItem(ArmorMaterialExtraArmor.GLOWSTONE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ObsidianArmorItem(ArmorMaterialExtraArmor.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ObsidianArmorItem(ArmorMaterialExtraArmor.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ObsidianArmorItem(ArmorMaterialExtraArmor.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ObsidianArmorItem(ArmorMaterialExtraArmor.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}