package ru.job4j.convert;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 140;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        float inD = 140;
        float expectedD = 1;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("140 rubles are 1 dollar. Test result : " + passedD);
    }
}
