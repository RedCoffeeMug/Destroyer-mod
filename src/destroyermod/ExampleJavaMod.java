package destroyermod;

import arc.*;
import arc.util.*;
import destroyermod.content.Bullets;
import destroyermod.content.ModBlocks;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");


    }

    @Override
    public void loadContent(){
        new Bullets().load();
        new ModBlocks().load();
        Log.info("Loading some example content.");
    }

}
