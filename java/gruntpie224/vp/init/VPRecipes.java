package gruntpie224.vp.init;

import gruntpie224.vp.helpers.RecipesHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class VPRecipes {

    public static void loadRecipes(){
        RecipesHelper.addShapedRecipe(new ItemStack(Items.SKULL,1,0),new Object[]{
                "sss",
                "sBs",
                "sss",

                's',new ItemStack(VPItems.head_frag_skeleton),'B', new ItemStack(Blocks.IRON_BLOCK)
        });
    }
}
