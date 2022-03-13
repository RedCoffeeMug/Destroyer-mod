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



public class Bullets implements ContentList {
    public static BulletType bigBasicBullet;




    @Override
    public void load() {

        bigBasicBullet = new BasicBulletType(8f, 85f){{
            status = StatusEffects.unmoving;
            statusDuration = 60f;
            collidesAir = false;
            collidesGround = true;
            reflectable = false;
            inaccuracy = 0.8f;
            splashDamageRadius = 2f;
            splashDamage = 5f;
            hitShake = 1f;
            lifetime = 360f;
            lightColor = Color.gold;
            trailColor = Color.gold;

            frontColor = Color.black;
            backColor = Color.black;
            width = 8f;
            height = 16f;
            knockback = 0f;
            hitEffect = Fx.explosion;
            shootEffect = Fx.shootBig2;
            scaleVelocity = true;

        }};


    }
}
