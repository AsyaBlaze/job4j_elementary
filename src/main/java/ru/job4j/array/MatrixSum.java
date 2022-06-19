package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array[index].length; i++) {
                rsl = array[index][i] + rsl;
            }
        }
        return rsl;
    }
}
