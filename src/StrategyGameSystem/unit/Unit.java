package StrategyGameSystem.unit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Unit {

    private String type;
    private Map<String, Object> properties;

    public Unit(String type) {
        this.type = type;
        properties = new HashMap<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setProperty(String propertyName, Object propertyValue) {
        properties.put(propertyName, propertyValue);
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }
}

