package monkeys.common;

import net.minecraft.item.ItemFood;

public class ItemMonkeysFood extends ItemFood
{
	public ItemMonkeysFood(int id, int foodLevel, float saturation)
	{
		super(id, foodLevel, saturation, false);
	}
	
	@Override
	public String getTextureFile()
	{
		return "/resources/monkeys/textures/items.png";
	}
}
