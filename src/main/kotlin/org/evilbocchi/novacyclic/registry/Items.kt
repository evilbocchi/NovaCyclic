@file:Suppress("unused")

package org.evilbocchi.novacyclic.registry

import org.bukkit.inventory.EquipmentSlot
import org.evilbocchi.novacyclic.NovaCyclic
import  xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.item.behavior.*

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by NovaCyclic.registry {
    
    val GEM_OBSIDIAN = registerItem("gem_obsidian")
    
    val EMERALD_SWORD = registerItem("emerald_sword", Tool, Damageable, Enchantable)
    val EMERALD_SHOVEL = registerItem("emerald_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val EMERALD_PICKAXE = registerItem("emerald_pickaxe", Tool, Damageable, Enchantable)
    val EMERALD_AXE = registerItem("emerald_axe", Tool, Damageable, Enchantable, Stripping)
    val EMERALD_HOE = registerItem("emerald_hoe", Tool, Damageable, Enchantable, Tilling)
    
    val CRYSTAL_SWORD = registerItem("crystal_sword", Tool, Damageable, Enchantable)
    val CRYSTAL_SHOVEL = registerItem("crystal_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val CRYSTAL_PICKAXE = registerItem("crystal_pickaxe", Tool, Damageable, Enchantable)
    val CRYSTAL_AXE = registerItem("crystal_axe", Tool, Damageable, Enchantable, Stripping)
    val CRYSTAL_HOE = registerItem("crystal_hoe", Tool, Damageable, Enchantable, Tilling)
    
    val EMERALD_HELMET = registerItem("emerald_helmet", Wearable(EquipmentSlot.HEAD, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_CHESTPLATE = registerItem("emerald_chestplate", Wearable(EquipmentSlot.CHEST, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_LEGGINGS = registerItem("emerald_leggings", Wearable(EquipmentSlot.LEGS, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_BOOTS = registerItem("emerald_boots", Wearable(EquipmentSlot.FEET, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    
    val CRYSTAL_HELMET = registerItem("crystal_helmet", Wearable(EquipmentSlot.HEAD, Sounds.ARMOR_EQUIP_CRYSTAL), Damageable)
    val CRYSTAL_CHESTPLATE = registerItem("crystal_chestplate", Wearable(EquipmentSlot.CHEST, Sounds.ARMOR_EQUIP_CRYSTAL), Damageable)
    val CRYSTAL_LEGGINGS = registerItem("crystal_leggings", Wearable(EquipmentSlot.LEGS, Sounds.ARMOR_EQUIP_CRYSTAL), Damageable)
    val CRYSTAL_BOOTS = registerItem("crystal_boots", Wearable(EquipmentSlot.FEET, Sounds.ARMOR_EQUIP_CRYSTAL), Damageable)
}