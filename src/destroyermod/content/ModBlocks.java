package destroyermod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentList;
import mindustry.mod.Mod;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;

import static mindustry.type.ItemStack.with;


public class ModBlocks implements ContentList {
    public static Block groundBreaker;


    @Override
    public void load() {

        groundBreaker = new ItemTurret("groundbreaker"){{
            localizedName = "[gold]GroundBreaker";
            requirements(Category.turret, with(Items.titanium, 500, Items.thorium, 350, Items.blastCompound, 450));
            ammo(Items.thorium, Bullets.bigBasicBullet);

            recoilAmount = 5f;
            ammoPerShot = 1;
            maxAmmo = 35;
            rotateSpeed = 250;
            acceptCoolant = false;
            targetAir = false;
            size = 4;
            range = 400;
            minRange = 15;
            health = 600;
            reloadTime = 60f;
            ammoUseEffect = Fx.casing3;
            description = "A turret that shoots giant bullets and causes mini earthquakes to stop enemys.";

        }};

    }

}
