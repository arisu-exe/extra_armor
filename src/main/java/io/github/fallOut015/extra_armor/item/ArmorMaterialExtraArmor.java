package io.github.fallOut015.extra_armor.item;

import io.github.fallOut015.extra_armor.util.SoundEventsExtraArmor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ArmorMaterialExtraArmor implements IArmorMaterial {
    OAK("oak", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.OAK_PLANKS)),
    SPRUCE("spruce", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.SPRUCE_PLANKS)),
    BIRCH("birch", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.BIRCH_PLANKS)),
    JUNGLE("jungle", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.JUNGLE_PLANKS)),
    ACACIA("acacia", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.ACACIA_PLANKS)),
    DARK_OAK("dark_oak", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOD, 0.0f, 0, () -> Ingredient.of(Items.DARK_OAK_PLANKS)),
    CRIMSON("crimson", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_FUNGUS, 0.0f, 0, () -> Ingredient.of(Items.CRIMSON_PLANKS)),
    WARPED("warped", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_FUNGUS, 0.0f, 0, () -> Ingredient.of(Items.WARPED_PLANKS)),

    WHITE_WOOL("white_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    ORANGE_WOOL("orange_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    MAGENTA_WOOL("magenta_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    LIGHT_BLUE_WOOL("light_blue_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    YELLOW_WOOL("yellow_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    LIME_WOOL("lime_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    PINK_WOOL("pink_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    GRAY_WOOL("gray_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    LIGHT_GRAY_WOOL("light_gray_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    CYAN_WOOL("cyan_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    PURPLE_WOOL("purple_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    BLUE_WOOL("blue_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    BROWN_WOOL("brown_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    GREEN_WOOL("green_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    RED_WOOL("red_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),
    BLACK_WOOL("black_wool", 4, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_WOOL, 0.0f, 0, () -> Ingredient.of(Items.STRING)),

    STONE("stone", 10, new int[] {1, 4, 5, 2}, 6, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_STONE, 1.0f, 0, () -> Ingredient.of(Items.COBBLESTONE)),
    SPONGE("sponge", 5, new int[] {1, 2, 3, 1}, 5, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_SPONGE, 0.0f, 0, () -> Ingredient.of(Items.SPONGE)),
    GLOWSTONE("glowstone", 5, new int[] {1, 2, 3, 1}, 10, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_GLOWSTONE, 0.0f, 0, () -> Ingredient.of(Items.GLOWSTONE)),
    OBSIDIAN("obsidian", 30, new int[] {3, 6, 8, 3}, 1, SoundEventsExtraArmor.ITEM_ARMOR_EQUIP_OBSIDIAN, 0.0f, 0, () -> Ingredient.of(Items.OBSIDIAN));

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final LazyValue<SoundEvent> soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    ArmorMaterialExtraArmor(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, Supplier<SoundEvent> equipSoundIn, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = new LazyValue<>(equipSoundIn);
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }
    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent.get();
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}