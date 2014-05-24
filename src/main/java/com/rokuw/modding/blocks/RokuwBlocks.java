package com.rokuw.modding.blocks;

import java.util.Random;

import com.rokuw.modding.MainClass;
import com.rokuw.modding.blocks.RokuwBlocksIndex;
import com.rokuw.modding.creativetabs.RokuwTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

public class RokuwBlocks {
	
	// Blocks
	public static Block amethystOre = new amethystOre(Material.rock, "amethystOre").setBlockName("amethystOre");
	public static Block amethystBlock = new amethystBlock(Material.iron, "amethystBlock").setBlockName("amethystBlock");
	
	// Register Blocks In Game
	public void RegisterBlock() {
		RB(amethystOre, "amethystOre");
		RB(amethystBlock, "amethystBlock");
	}

	/**Register Your Block*/
	private void RB(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
	
}

// Internal Class For Blocks
class RokuwBlock extends Block {
	public RokuwBlock(Material material, String TextureName) {
		super(material);
		setCreativeTab(RokuwTabs.tabAmethyst);
		setHardness(1F);
		setHarvestLevel("pickaxe", 0); // 0=Wood // 1=Stone // 2=Iron // 3=Diamond //
		setBlockTextureName("rokuw:"+TextureName);
	}
}

class RokuwGlass extends BlockBreakable{
	public RokuwGlass(Material material, String TextureName, boolean meh) {
		super("rokuw:"+TextureName, material, meh);
		setCreativeTab(RokuwTabs.tabAmethyst);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setHardness(0.5F);
	}
	
}