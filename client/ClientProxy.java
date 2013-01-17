package monkeys.client;

import net.minecraftforge.client.MinecraftForgeClient;
import monkeys.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderInformation()
	{
		MinecraftForgeClient.preloadTexture("/resources/monkeys/textures/items.png");
	}
}
