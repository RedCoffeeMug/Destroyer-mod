package destroyermod.type;

import mindustry.content.UnitTypes;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;

public class NestedFlying extends UnitEntity {
    UnitType child = UnitTypes.flare;
    int childNum = 1;

    @Override
    public void killed(){
        super.killed();
        for (int i = 0; i < childNum; i++) {
            child.spawn(this.x, this.y);
        }
    }

    public void nestInit(NestedUnitType unit){
        this.child = unit.child;
        this.childNum = unit.childNum;
    }
}
