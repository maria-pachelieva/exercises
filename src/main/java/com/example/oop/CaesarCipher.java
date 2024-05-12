package com.example.oop;

public class CaesarCipher {
    public static void main(String[] args) {

        String s = "There's-a-starman-waiting-in-the-sky";
        int k = 3;
        if (k > 26) {
            while (k > 26) {
                k = k - 26;
            }
            System.out.println(k);
        }
        char cipher[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {

            int rawChar = s.charAt(i);

            rawChar = replaceCharacter(rawChar, k, 'a', 'z', 122);
            rawChar = replaceCharacter(rawChar, k, 'A', 'Z', 90);

            cipher[i] = (char) rawChar;
        }
        System.out.println(cipher);
    }

    private static int replaceCharacter (int rawChar, int k, char start, char end, int limit) {
        if (rawChar >= start && rawChar <= end) {
            rawChar += k;

            if (rawChar > limit) {
                rawChar = rawChar - 26;
            }
        }

        return rawChar;
    }
}

