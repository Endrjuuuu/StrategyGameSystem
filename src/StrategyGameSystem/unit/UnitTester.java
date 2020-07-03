package StrategyGameSystem.unit;

public class UnitTester {

    public void testType(Unit unit, String type, String expectedOutputType) {
        System.out.println("\nTestowanie zapisu i odczytu wlasciwosci 'type'.");
        unit.setType(type);
        String outputType = unit.getType();
        if (expectedOutputType.equals(outputType))
            System.out.println("Test zakonczony pomyslnie");
        else
            System.out.println("Nie udalo sie pomyslnie przejsc testu: wartosci " +
                    outputType + " oraz " + expectedOutputType + " nie odpowiadaja sobie");
    }

    public void testUnitSpecificProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue) {
        System.out.println("\nTestowanie zapisu i odczytu wlasciwosci charakterystycznej dla jednostki.");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (expectedOutputValue.equals(outputValue))
            System.out.println("Test zakonczony pomyslnie");
        else
            System.out.println("Nie udalo sie pomyslnie przejsc testu: wartosci " +
                    outputValue + " oraz " + expectedOutputValue + " nie odpowiadaja sobie");
    }

    public void testChangeProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue) {
        System.out.println("\nTestowanie zmiany wartosci istniejacej wlasciwosci jednostki.");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (expectedOutputValue.equals(outputValue))
            System.out.println("Test zakonczony pomyslnie");
        else
            System.out.println("Nie udalo sie pomyslnie przejsc testu: wartosci " +
                    outputValue + " oraz " + expectedOutputValue + " nie odpowiadaja sobie");
    }

    public void testNonExistentProperty(Unit unit, String propertyName) {
        System.out.println("\nTestowanie odczytu wartosci nieistniejacej wlasciowsci.");
        Object outputValue = unit.getProperty(propertyName);
        if (outputValue.equals("[brak wartosci]"))
            System.out.println("Test zakonczony pomyslnie");
        else
            System.out.println("Nie udalo sie pomyslnie przejsc testu: odczytano wartosc " + outputValue);
    }

    public static void main(String[] args) {
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(1);
        tester.testType(unit, "piechota", "piechota");
        tester.testUnitSpecificProperty(unit, "hitPoints", 25, 25);
        tester.testChangeProperty(unit, "hitPoints", 15, 15);
        tester.testNonExistentProperty(unit, "strength");
    }
}
