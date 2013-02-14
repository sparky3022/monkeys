package monkeys.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "FlyingMonkeys", name = "Flying Monkeys", version = ".1")
public class FlyingMonkeys 
{
	@SidedProxy(clientSide = "monkeys.client.ClientProxy", serverSide = "monkeys.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item Banana;
	public static Item GoldenBanana;
	public static Item DiamondBanana;
	
	@Mod.Init
	public void init(FMLInitializationEvent event)
	{
		Banana = new ItemMonkeysFood(25000, 4, 0.5F).setItemName("Banana");
		LanguageRegistry.addName(Banana, "Banana");
		Banana.setIconIndex(0);
		
		GoldenBanana = new ItemMonkeysFood(25001, 8, 1.0F).setItemName("GoldenBanana");
		LanguageRegistry.addName(GoldenBanana, "Golden Banana");
		GoldenBanana.setIconIndex(1);
		
		DiamondBanana = new ItemMonkeysFood(25002, 16, 2.0F).setItemName("DiamondBanana");
		LanguageRegistry.addName(DiamondBanana, "Diamond Banana");
		DiamondBanana.setIconIndex(2);
		
		GameRegistry.addRecipe(new ItemStack(GoldenBanana, 1), new Object[] { " G ", "GBG", " G ", 'G', Block.blockGold ,'B', Banana});
	}
}
