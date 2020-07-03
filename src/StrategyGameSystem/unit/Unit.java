package StrategyGameSystem.unit;

import java.util.*;

public class Unit {

    private String type;
    private int id;
    private String name;
    private List<Weapon> weapons;
    private Map<String, Object> properties;

    public Unit(int id) {
        this.id = id;
        weapons = new LinkedList<>();
        properties = new HashMap<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setProperty(String propertyName, Object propertyValue) {
        properties.put(propertyName, propertyValue);
    }

    public Object getProperty(String propertyName) {
        return properties.getOrDefault(propertyName, "[brak wartosci]");
    }
}

