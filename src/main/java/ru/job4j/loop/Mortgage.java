package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double procent;
        while (amount > 0) {
            procent = amount * (percent / 100);
            amount = amount + procent - salary;
            year++;
        }
        return year;
    }
}
