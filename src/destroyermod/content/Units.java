package destroyermod.content;

import destroyermod.type.NestedFlying;
import destroyermod.type.NestedUnitType;
import mindustry.content.Fx;
import mindustry.ctype.ContentList;
import mindustry.gen.MechUnit;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class Units implements ContentList {
    public static UnitType colony, barrier,  //tier 1 units

            swarm;  //tier 2 units

    @Override
    public void load() {

        colony = new UnitType("colony"){{
            constructor = UnitEntity::create;
            localizedName = "[orange]Colony";
            description = "A flying unit that works better in groups.";

            health = 450f;
            armor = 1f;
            flying = true;
            canDrown = false;
            speed = 5.5f;
            drag = 0.7f;
            hitSize = 5f;
            range = 90;
            rotateSpeed = 10f;

            weapons.add(new Weapon("colony-weapon"){{
                reload = 13f;
                x = 0f;
                y = 0f;
                mirror = false;
                ejectEffect = Fx.casing1;
                bullet = Bullets.smallUnitBullet;
            }});

        }};

        swarm = new NestedUnitType("swarm"){{
            constructor = NestedFlying::create;
            localizedName = "[orange]Swarm";
            description = "A upgraded unit from Colony. Once killed this unit spawns in Colonys to help.";

            health = 450f;
            armor = 0f;
            flying = true;
            canDrown = false;
            speed = 7f;
            drag = 0.7f;
            hitSize = 9f;
            range = 90f;
            rotateSpeed = 10f;

            child = colony;
            childNum = 3;

            weapons.add(new Weapon("swarm-weapon"){{
                reload = 15f;
                x = 0f;
                y = 0f;
                mirror = false;
                recoil = 1f;
                ejectEffect = Fx.casing1;
                bullet = Bullets.smallUnitBullet;
            }});
        }};


        barrier = new UnitType("barrier"){{
            constructor = MechUnit::create;
            localizedName = "[orange]Barrier";
            description = "A ground unit that does not attack but acts as a shield to other units";

            health = 550f;
            armor = 5f;
            flying = false;
            canDrown = true;
            speed = 0.8f;
            hitSize = 8f;
            range = 90f;
            rotateSpeed = 2f;
        }};


    }
}
