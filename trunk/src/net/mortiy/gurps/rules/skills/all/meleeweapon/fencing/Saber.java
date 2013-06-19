package net.mortiy.gurps.rules.skills.all.meleeweapon.fencing;

import net.mortiy.gurps.rules.attributes.Attribute;
import net.mortiy.gurps.rules.skills.Skill;
import net.mortiy.gurps.rules.Character;
import net.mortiy.gurps.rules.skills.all.meleeweapon.FencingMeleeWeapon;

/**
 * Saber
 * ========================
 * Description:
 * Any light cutand-
 * thrust sword. Note that cavalry
 * sabers are quite heavy, and use
 * Broadsword instead.
 */
public class Saber extends FencingMeleeWeapon {

    public Saber(Character character) {
        super(character, "Saber");
        try {
            setDefault("Broadsword", -4);
            setDefault("Shortsword", -4);
        } catch (UnknownSkillDefaultSkillException e) {
            e.printStackTrace();
        }
    }
}
