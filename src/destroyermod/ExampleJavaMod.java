package destroyermod;

import arc.util.*;
import destroyermod.content.Bullets;
import destroyermod.content.Blocks;
import destroyermod.content.ModItems;
import destroyermod.content.Units;
import mindustry.mod.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");


    }

    @Override
    public void loadContent(){
        new ModItems().load();
        new Bullets().load();
        new Units().load();
        new Blocks().load();
        Log.info("Loading some example content.");
    }

}
