package monkeys.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemMonkeysFood extends ItemFood
{
	public ItemMonkeysFood(int id, int foodLevel, float saturation)
	{
		super(id, foodLevel, saturation, true);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	public String getTextureFile()
	{
		return "/resources/monkeys/textures/items.png";
	}
}
