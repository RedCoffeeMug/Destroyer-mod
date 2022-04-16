package destroyermod.type;

import mindustry.content.UnitTypes;
import mindustry.game.Team;
import mindustry.gen.Unit;
import mindustry.type.UnitType;

public class NestedUnitType extends UnitType {
    public UnitType child = UnitTypes.flare;
    public int childNum = 1;

    public NestedUnitType(String name) {
        super(name);
    }

    @Override
    public Unit create(Team team){
        Unit unit = super.create(team);
        if(unit instanceof NestedFlying){
            ((NestedFlying) unit).nestInit(this);
        }
        return unit;
    }
}
