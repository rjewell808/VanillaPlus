package gruntpie224.vanillaplus.helpers;

import java.util.Random;

import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropHandler {
	
	@SubscribeEvent
	public void onCreatureDrop(LivingDropsEvent event){
		Random random = new Random();
		double rand = random.nextInt(45);
		
		if(event.entityLiving instanceof EntityCreeper && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlusItems.head_frag_creeper, 1, 0), 1);
		}
		
		if(event.entityLiving instanceof EntitySkeleton && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlusItems.head_frag_skeleton, 1, 0), 1);
		}
		
		if(event.entityLiving instanceof EntityZombie && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlusItems.head_frag_zombie, 1, 0), 1);
		}
	}

}
