package net.mortiy.gurps.rules.combat.maneuver;

import net.mortiy.gurps.rules.combat.*;
import net.mortiy.gurps.rules.combat.exceptions.ImpossibleManeuverException;
import net.mortiy.gurps.rules.combat.exceptions.IsNotReadyException;

/**
 * Created with IntelliJ IDEA.
 * User: oleksandr.sidko
 * Date: 15.01.13
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class AllOutDefenseManeuver extends Maneuver {

    AllOutDefenseManeuver.Type defenseType;
    Defense.Strategy defenseStrategy;

    public AllOutDefenseManeuver(AllOutDefenseManeuver.Type defenseType) {
        this(defenseType, null);
    }

    public AllOutDefenseManeuver(AllOutDefenseManeuver.Type defenseType, Defense.Strategy defenseStrategy) {
        super(ManeuverType.AllOutDefense);
        this.defenseType = defenseType;
        this.defenseStrategy = defenseStrategy;
    }

    public enum Type {
        IncreasedDefense,
        DoubleDefense
    }

    public static Type[] types = Type.values();

    public static Type getType(int i){
        return types[i];
    }

    public Type getDefenseType() {
        return defenseType;
    }

    public Defense.Strategy getDefenseStrategy() {
        return defenseStrategy;
    }


    @Override
    public ManeuverResult resolve(Fighter fighter) throws ImpossibleManeuverException, IsNotReadyException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
