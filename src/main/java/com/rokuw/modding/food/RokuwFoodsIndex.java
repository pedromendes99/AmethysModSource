package com.rokuw.modding.food;

import com.rokuw.modding.creativetabs.RokuwTabs;
import com.rokuw.modding.help.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class RokuwFoodsIndex {

}

 class amethystCookie extends ItemFood {
	 
	 @SideOnly(Side.CLIENT)
	 protected  IIcon itemIcon;
	 public amethystCookie(int p_i45340_1_, boolean p_i45340_2_) {
	   super(p_i45340_1_, p_i45340_2_);
	  
	   this.setCreativeTab(RokuwTabs.tabAmethyst);
	 }

	 @SideOnly(Side.CLIENT)
	 public void registerBlockIcons(IIconRegister p_149651_1_)
	 {
	 itemIcon = p_149651_1_.registerIcon(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
	 }
	 @SideOnly(Side.CLIENT)
	 public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	 {
	                   return itemIcon;
	 }

}