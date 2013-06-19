package net.mortiy.gurps.rules.skills.all.meleeweapon.impact;

import net.mortiy.gurps.rules.skills.all.meleeweapon.ImpactMeleeWeapon;

/**
 * Two-Handed Axe/Mace
 * ===================
 * Description:
 * Any long, two-handed impact weapon, such as a baseball
 * bat, battleaxe, maul, or warhammer.
 */
public class TwoHandedAxeMace extends ImpactMeleeWeapon {
    public TwoHandedAxeMace(net.mortiy.gurps.rules.Character character) {
        super(character, "Two-Handed Axe/Mace");
        try {
            setDefault("Polearm", -4);
            setDefault("Two-Handed Flail", -4);
        } catch (UnknownSkillDefaultSkillException e) {
            e.printStackTrace();
        }
    }
}
