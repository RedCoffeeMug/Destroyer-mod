package destroyermod;

import arc.util.*;
import destroyermod.content.Bullets;
import destroyermod.content.Blocks;
import mindustry.mod.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");


    }

    @Override
    public void loadContent(){
        new Bullets().load();
        new Blocks().load();
        Log.info("Loading some example content.");
    }

}
