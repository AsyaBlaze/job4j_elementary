package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int rsl = max(4, 3);
        System.out.println("Наибольшее число: " + rsl);
    }
}
