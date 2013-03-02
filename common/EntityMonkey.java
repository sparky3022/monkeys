package monkeys.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.world.World;

public class EntityMonkey extends EntityLiving {

	public EntityMonkey(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	this.texture = "/Monkey/EntityMonkey.png";
			this.moveSpeed = 0.30F;
	}

	public int getAttackStrength(Entity par1Entity)
	{
		return 4;
		
	}
	@Override
	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 40;
	}
	
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}
	

protected boolean isAIEnabled()
{
	return true;
}

}