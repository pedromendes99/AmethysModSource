package com.rokuw.modding.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import com.rokuw.modding.creativetabs.RokuwTabs;
import com.rokuw.modding.items.RokuwItems;

public class RokuwBlocksIndex {

}

class amethystOre extends RokuwBlock{
	public amethystOre(Material material, String TextureName) {
		super(material, TextureName);
		setHardness(4F);
		setResistance(3F);
		setHarvestLevel("pickaxe", 2); // 0=Wood // 1=Stone // 2=Iron // 3=Diamond //
	}
	@Override
	public Item getItemDropped(int p_149650_1_, Random random, int fortuneLevel){
		return RokuwItems.amethystGem;
	}
	public int quantityDropped(Random par1Random){
        return 1;
    }
	
}		

class amethystBlock extends RokuwBlock {
	public amethystBlock(Material material, String TextureName) {
		super(material, TextureName);
		setCreativeTab(RokuwTabs.tabAmethyst);
		setHardness(4F);
		setResistance(3.5F);
		setHarvestLevel("pickaxe", 2); // 0=Wood // 1=Stone // 2=Iron // 3=Diamond //
	}
	public Block getBlockDropped(int metadata, Random random, int fortuneLevel){
		
		return RokuwBlocks.amethystBlock;
	}
	public int quantityDropped(Random par1Random){
        return 1;
    }
	
}