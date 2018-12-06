package gruntpie224.vp.common.armor;

import gruntpie224.vp.VPConst;
import gruntpie224.vp.VanillaPlus;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ArmorObsidian  extends ItemArmor {

    public Item repair;
    public String armorNamePrefix;
    public ArmorObsidian(ArmorMaterial materialIn, int renderIndexIn, String armorName, EntityEquipmentSlot equipmentSlotIn, Item repairItem) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
        armorNamePrefix=armorName;
        this.repair=repairItem;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        if (stack.toString().contains("legs"))
            return VPConst.MODID + ":textures/armor/" + armorNamePrefix + "_2.png";

        if (stack.toString().contains("Legs"))
            return VPConst.MODID+ ":textures/armor/" + armorNamePrefix + "_2.png";

        return VPConst.MODID + ":textures/armor/" + armorNamePrefix + "_1.png";
    }
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
