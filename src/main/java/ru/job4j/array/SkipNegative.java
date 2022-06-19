package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int index = 0; index < array.length; index++) {
            for (int k = 0; k < array[index].length; k++) {
                if (array[index][k] < 0) {
                    array[index][k] = 0;
                }
            }
        }
        return array;
    }
}
