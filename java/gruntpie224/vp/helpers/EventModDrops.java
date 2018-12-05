package gruntpie224.vp.helpers;

import gruntpie224.vp.init.VPItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class EventModDrops {


    @SubscribeEvent
    public void onModDrop(LivingDropsEvent e){
        Random r = new Random();

        double rand = r.nextInt(45);

        if(e.getEntityLiving() instanceof EntityCreeper &&rand>25){
            e.getEntityLiving().entityDropItem(new ItemStack(VPItems.head_frag_creeper,1,0),1);
        }
        if(e.getEntityLiving() instanceof EntitySkeleton && rand>25){
            e.getEntityLiving().entityDropItem(new ItemStack(VPItems.head_frag_skeleton,1,0),1);
        }
        if(e.getEntityLiving() instanceof EntityZombie && rand>25){
            e.getEntityLiving().entityDropItem(new ItemStack(VPItems.head_frag_zombie,1,0),1);
        }

    }
}
