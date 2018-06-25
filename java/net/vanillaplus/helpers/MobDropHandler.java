package net.vanillaplus.helpers;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.vanillaplus.common.VanillaPlus;

public class MobDropHandler {
	
	@SubscribeEvent
	public void onCreatureDrop(LivingDropsEvent event){
		Random random = new Random();
		double rand = random.nextInt(45);
		
		if(event.entityLiving instanceof EntityCreeper && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlus.creeperHeadFrag, 1, 0), 1);
		}
		
		if(event.entityLiving instanceof EntitySkeleton && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlus.skeletonHeadFrag, 1, 0), 1);
		}
		
		if(event.entityLiving instanceof EntityZombie && rand < 2)
		{
			event.entityLiving.entityDropItem(new ItemStack(VanillaPlus.zombieHeadFrag, 1, 0), 1);
		}
	}

}

