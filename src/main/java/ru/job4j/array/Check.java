package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int tru = 0;
        int fals = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[index]) {
                tru += 1;
            } else {
                fals += 1;
            }
        }
        if (fals != data.length &&  tru != data.length) {
            result = false;
        }
        return result;
    }
}
