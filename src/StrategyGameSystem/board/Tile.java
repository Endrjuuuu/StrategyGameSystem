package StrategyGameSystem.board;

import StrategyGameSystem.unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List<Unit> units;

    public Tile() {
        units = new LinkedList<>();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public void removeUnits() {
        units.clear();
    }

}
