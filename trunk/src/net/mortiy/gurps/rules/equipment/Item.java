package net.mortiy.gurps.rules.equipment;

import net.mortiy.gurps.rules.TechLevel;
import net.mortiy.gurps.rules.combat.Preparable;

/**
 * Created with IntelliJ IDEA.
 * User: oleksandr.sidko
 * Date: 09.12.12
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class Item implements Preparable {
    protected TechLevel techLevel;
    protected float weight = 0f;
    protected float cost = 0f;
    protected float size = 0f;
    protected String name;

    public Item(String name, TechLevel techLevel, float cost, float weight) {
        this.name = name;
        this.techLevel = techLevel;
        this.cost = cost;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return name;
    }
}
