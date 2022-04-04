package destroyermod.content;

import mindustry.ctype.ContentList;
import arc.graphics.Color;
import mindustry.content.StatusEffects;
import mindustry.content.Fx;
import arc.fx.FxProcessor;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import mindustry.gen.ElevationMovec;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.type.StatusEffect;


public class Bullets implements ContentList {
    public static BulletType bigBasicBullet, smallBasicBullet; //artillery




    @Override
    public void load() {

        bigBasicBullet = new BasicBulletType(8f, 90f){{
            status = StatusEffects.unmoving;
            statusDuration = 60f;
            collidesAir = false;
            collidesGround = true;
            reflectable = false;
            inaccuracy = 0.8f;
            splashDamageRadius = 2f;
            splashDamage = 5f;
            hitShake = 15f;
            lifetime = 360f;
            lightColor = Color.gold;
            trailColor = Color.gold;
            trailEffect = Fx.trailFade;

            frontColor = Color.black;
            backColor = Color.gold;
            width = 8f;
            height = 16f;
            knockback = 0f;
            hitEffect = Fx.explosion;
            shootEffect = Fx.shootBig2;
            scaleVelocity = true;

        }};

        smallBasicBullet = new BasicBulletType(15f, 85){{
            collidesGround = false;
            collidesAir = true;
            reflectable = false;
            inaccuracy = 0.5f;
            splashDamageRadius = 0.5f;
            splashDamage = 2f;
            hitShake = 1f;
            lifetime = 360f;
            lightColor = Color.lightGray;
            frontColor = Color.gray;
            backColor = Color.darkGray;
            width = 5f;
            height = 10f;
            knockback = 0f;
            hitEffect = Fx.hitBulletSmall;
            shootEffect = Fx.shootSmall;
            scaleVelocity = true;

        }};


    }
}
