package destroyermod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.content.UnitTypes;
import mindustry.ctype.ContentList;
import mindustry.type.*;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;


public class Blocks implements ContentList {
    public static Block groundBreaker, skyStriker,  //turrets

    destroyerFactory, protaReconstructor, defenseReconstructor, attackReconstructor, //units

    freezer, iceMelter;    //crafters


    @Override
    public void load() {

        groundBreaker = new ItemTurret("groundbreaker"){{
            localizedName = "[gold]GroundBreaker";
            requirements(Category.turret, with(Items.titanium, 500, Items.thorium, 350, Items.blastCompound, 450));
            ammo(Items.blastCompound, Bullets.bigBasicBullet);

            recoilAmount = 5f;
            ammoPerShot = 1;
            maxAmmo = 35;
            rotateSpeed = 250;
            acceptCoolant = false;
            targetAir = false;
            size = 4;
            range = 400;
            minRange = 15;
            health = 3000;
            reloadTime = 60f;
            ammoUseEffect = Fx.casing3;
            description = "A turret that shoots giant bullets and causes mini earthquakes to stop enemys.";

        }};


        skyStriker = new ItemTurret("skystriker"){{
            localizedName = "[gold]SkyStriker";
            requirements(Category.turret, with(Items.titanium, 500, Items.thorium, 300, Items.lead, 800));
            ammo(Items.titanium, Bullets.smallBasicBullet);

            recoilAmount = 3f;
            ammoPerShot = 2;
            shots = 2;
            inaccuracy = 15f;
            shootCone = 30f;
            maxAmmo = 80;
            rotateSpeed = 360;
            acceptCoolant = false;
            targetAir = true;
            targetGround = false;
            size = 4;
            range = 400;
            minRange = 10;
            health = 2950;
            reloadTime = 20f;
            ammoUseEffect = Fx.casing1;
            description = "A basic but strong anti-air turret, made to destroy any pesky air units.";

        }};

        destroyerFactory = new UnitFactory("destroyer-factory"){{
            localizedName = "[orange]Destroyer Factory";
            requirements(Category.units, with(Items.titanium, 350, Items.silicon, 250, Items.lead, 500));
            size = 3;
            health = 300;
            consumes.power(5);
            itemCapacity = (int) 100f;
            description = "Produces tier 1 units from this mod.";
            plans.add(new UnitPlan(Units.colony, 250, with(Items.titanium, 250, Items.silicon, 450)));
            plans.add(new UnitPlan(Units.barrier, 350, with(Items.silicon, 300, Items.titanium, 250)));
        }};

        protaReconstructor = new Reconstructor("prota-reconstructor"){{
            localizedName = "[orange]Prota Reconstructor";
            description = "Reconstructs tier 1 units into tier 2 units.";
            requirements(Category.units, with(Items.silicon, 250, Items.lead, 350, Items.titanium, 150));

            size = 3;
            consumes.power(5f);
            consumes.items(with(Items.silicon, 60, Items.titanium, 55));
            health = 300;

            constructTime = 65f * 10f;

            upgrades.addAll(
                    new UnitType[]{Units.colony, Units.swarm},
                    new UnitType[]{Units.barrier, Units.barricade}
            );
        }};

        defenseReconstructor = new Reconstructor("defense-reconstructor"){{
            localizedName = "[orange]Defense Reconstructor";
            description = "Reconstructs units in a way that makes their defense better";
            requirements(Category.units, with(Items.silicon, 260, Items.lead, 375, Items.titanium, 200));

            size = 5;
            consumes.power(10f);
            consumes.items(with(Items.silicon, 100, Items.titanium, 80, Items.metaglass, 75));
            health = 400;

            constructTime = 70f * 30f;
        }};

        freezer = new GenericCrafter("freezer"){{
            localizedName = "[cyan]Freezer";
            description = "A crafter that takes in water and comes out with ice";
            requirements(Category.crafting, with(Items.lead, 40, Items.copper, 50, Items.graphite, 55));

            size = 2;
            craftTime = 50;
            health = 200;

            consumes.power(18);
            consumes.liquid(Liquids.water, 3);  //input
            outputItem = new ItemStack(ModItems.ice, 2);  //output

        }};

        iceMelter = new GenericCrafter("ice-melter"){{
            localizedName = "[cyan]Ice Melter";
            description = "Melts down ice into water";
            requirements(Category.crafting, with(Items.lead, 40, Items.copper, 50, Items.graphite, 50));

            size = 2;
            craftTime = 50;
            health = 200;
            hasLiquids = true;
            solid = true;
            outputsLiquid = true;

            consumes.power(18);
            consumes.item(ModItems.ice, 1);
            outputLiquid = new LiquidStack(Liquids.water, 3.1f);
        }};


    }

}
