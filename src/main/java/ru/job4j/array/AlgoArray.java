package ru.job4j.array;

public class AlgoArray {
    public static int[] exchange(int[] massiv, int first, int second) {
        int temp = massiv[first];
        massiv[first] = massiv[second];
        massiv[second] = temp;
    return massiv;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        exchange(array, 0, 3);
        exchange(array, 1, 2);
        exchange(array, 3, 4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
