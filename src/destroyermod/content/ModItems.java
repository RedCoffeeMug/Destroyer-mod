package destroyermod.content;

import mindustry.ctype.ContentList;
import arc.graphics.Color;
import mindustry.type.Item;

public class ModItems implements ContentList {
    public static Item ice;


    @Override
    public void load() {
        ice = new Item("ice"){{
            color = Color.blue;
            hardness = 2;
            alwaysUnlocked = true;
            localizedName = "Ice";
        }};
    }

}
