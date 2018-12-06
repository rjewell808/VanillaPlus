package gruntpie224.vp.common.armor;

import gruntpie224.vp.VPConst;
import gruntpie224.vp.VanillaPlus;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ArmorEmerald extends ItemArmor {

    public Item repair;
    public String armorName;

    public ArmorEmerald(ArmorMaterial materialIn, int renderIndexIn,String armorNamePref, EntityEquipmentSlot equipmentSlotIn, Item repairItem) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
        armorName=armorNamePref;
        this.repair=repairItem;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        if (stack.toString().contains("legs"))
            return VPConst.MODID + ":textures/armor/" + armorName + "_2.png";

        if (stack.toString().contains("Legs"))
            return VPConst.MODID + ":textures/armor/" + armorName + "_2.png";

        return VPConst.MODID + ":textures/armor/" + armorName + "_1.png";
    }
}
