package net.mortiy.gurps.rules.traits.all;

import net.mortiy.gurps.rules.modifiers.SummandModifier;
import net.mortiy.gurps.rules.traits.Disadvantage;
import net.mortiy.gurps.rules.traits.FixedTrait;

/**
 * Fat
 * ================================
 * You have approximately 150% the
 * average weight for your ST. You get -2
 * to Disguise – or to Shadowing, if you
 * are trying to follow someone in a
 * crowd. However, your extra fat gives
 * you +3 to Swimming rolls, and +2 to
 * ST when you resist knockback. Your
 * HT may not be above 15.
 * TODO: Make modifier to work only at specified situations. ("+2 to ST when you resist knockback")
 * TODO: Create posibility for modifier to limit basic attributes ("Your HT may not be above 15.")
 */
public class Fat extends FixedTrait implements Disadvantage {
    public Fat(net.mortiy.gurps.rules.Character character) {
        super(character, "Fat", -3);

            addModifier(character.getSkill("Disguise"), new SummandModifier(-2));
            addModifier(character.getSkill("Shadowing"), new SummandModifier(-2));
            addModifier(character.getSkill("Swimming"), new SummandModifier(+3));

    }
}
