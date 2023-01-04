package recursion.Exercises;

import java.util.HashMap;

public class CaesarCipher {
    public static void main(String[] args) {

        String s = "There's-a-starman-waiting-in-the-sky";
        int k = 3;
        char cipher[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            cipher[i] = s.charAt(i);
            if ((cipher[i] >= 'a' && cipher[i] <= 'z') || (cipher[i] >= 'A' && cipher[i] <= 'Z')) {
                cipher[i] = (char) (s.charAt(i) + k);
                if ((char) (s.charAt(i) + k) > 26) {
                    cipher[i]= (char)((s.charAt(i) + k)-26);
                }
            }

        }
        System.out.println(cipher);


    }
}
