package ru.job4j.array;

public class EndsWith {
    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = 0; index < post.length; index++) {
            result = word[word.length - 1 - index] == post[post.length - 1 - index];
            if (!result) {
                break;
            }
        }

        return result;
    }
}
