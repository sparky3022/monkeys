package monkeys.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMonkeys extends Item
{
	public ItemMonkeys(int id)
	{
		super(id);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	public String getTextureFile()
	{
		return "/resources/monkeys/textures/items.png";
	}
}
