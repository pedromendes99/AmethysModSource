package com.rokuw.modding.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.rokuw.modding.creativetabs.RokuwTabs;
import com.rokuw.modding.help.Reference;
import com.rokuw.modding.items.armor.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class RokuwArmors {
	
	//Armor Materials\\
    static ItemArmor.ArmorMaterial AMETHYST = EnumHelper.addArmorMaterial("amethystArmor", 24, new int[] { 2, 6, 4, 2 }, 9);
    static ItemArmor.ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("emeraldArmor", 28, new int[] { 3, 7, 5, 2 }, 14);
    
	//Armor ID's\\
    public static int AR1;
	public static int AR2;
	public static int AR3;
	public static int AR4;
    
    //Amethyst Armor\\
	public static Item amethystHelmet = new AmethystArmor(AMETHYST, AR1, 0).setUnlocalizedName("amethystHelmet");
	public static Item amethystChestplate = new AmethystArmor(AMETHYST, AR2, 1).setUnlocalizedName("amethystChestplate");
	public static Item amethystLeggings = new AmethystArmor(AMETHYST, AR3, 2).setUnlocalizedName("amethystLeggings");
	public static Item amethystBoots = new AmethystArmor(AMETHYST, AR4, 3).setUnlocalizedName("amethystBoots");

	//Emerald Armor\\
	public static Item emeraldHelmet = new EmeraldArmor(EMERALD, AR1, 0).setUnlocalizedName("emeraldHelmet");
	public static Item emeraldChestplate = new EmeraldArmor(EMERALD, AR2, 1).setUnlocalizedName("emeraldChestplate");
	public static Item emeraldLeggings = new EmeraldArmor(EMERALD, AR3, 2).setUnlocalizedName("emeraldLeggings");
	public static Item emeraldBoots = new EmeraldArmor(EMERALD, AR4, 3).setUnlocalizedName("emeraldBoots");
	
    public void RegisterArmor() {
    	RA(amethystHelmet, "amethystHelmet");
    	RA(amethystChestplate, "amethystChestplate");
    	RA(amethystLeggings, "amethystleggings");
    	RA(amethystBoots, "amethystBoots");
    	RA(emeraldHelmet, "emeraldHelmet");
    	RA(emeraldChestplate, "emeraldChestplate");
    	RA(emeraldLeggings, "emeraldLeggings");
    	RA(emeraldBoots, "emeraldBoots");
    	
    }
    
	private static void RA(Item item, String name){
		GameRegistry.registerItem(item, name);
	}

}

class AmethystArmor	extends ItemArmor {

	   public AmethystArmor(ArmorMaterial material, int id,
				int placement) {
			super(material, id, placement);
			setCreativeTab(RokuwTabs.tabAmethyst);
			    
			    if(placement == 0) {
			    	this.setTextureName(Reference.MODID + ":amethystHelmet");
			    } else if(placement == 1) {
			    	this.setTextureName(Reference.MODID + ":amethystChestplate");
			    } else if(placement == 2) {
			    	this.setTextureName(Reference.MODID + ":amethystLeggings");
			    } else if(placement == 3) {
			    	this.setTextureName(Reference.MODID + ":amethystBoots");
			    }
			    
		}
		
	    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	        if(stack.getItem() == RokuwArmors.amethystHelmet || stack.getItem() == RokuwArmors.amethystChestplate || stack.getItem() == RokuwArmors.amethystBoots) {
	                return "rokuw:textures/models/armor/amethystarmor_1.png";
	        }
	        if(stack.getItem() == RokuwArmors.amethystLeggings) {
	                return "rokuw:textures/models/armor/amethystarmor_2.png";
	        }
	        else return null;
			
		}
	    
	}

	class EmeraldArmor extends ItemArmor {
		
		   public EmeraldArmor(ArmorMaterial material, int id,
					int placement) {
				super(material, id, placement);
				setCreativeTab(RokuwTabs.tabAmethyst);
				    
				    if(placement == 0) {
				    	this.setTextureName(Reference.MODID + ":emeraldHelmet");
				    } else if(placement == 1) {
				    	this.setTextureName(Reference.MODID + ":emeraldChestplate");
				    } else if(placement == 2) {
				    	this.setTextureName(Reference.MODID + ":emeraldLeggings");
				    } else if(placement == 3) {
				    	this.setTextureName(Reference.MODID + ":emeraldBoots");
				    }
				    
			}
			
		    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		        if(stack.getItem() == RokuwArmors.emeraldHelmet || stack.getItem() == RokuwArmors.emeraldChestplate || stack.getItem() == RokuwArmors.emeraldBoots) {
		                return "rokuw:textures/models/armor/emeraldarmor_1.png";
		        }
		        if(stack.getItem() == RokuwArmors.emeraldLeggings) {
		                return "rokuw:textures/models/armor/emeraldarmor_2.png";
		        }
		        else return null;
				
			}
		    
		}