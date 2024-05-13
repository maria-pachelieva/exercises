package recursion.Exercises;

import java.util.ArrayList;

public class GridChallenge {
    public static void main(String[] args) {

        ArrayList<String> grid = new ArrayList<String>();
        grid.add("ebacd");
        grid.add("fghij");
        grid.add("olmkn");
        grid.add("trpqs");
        grid.add("xywuv");

        for (int row = 0; row < grid.size(); row++) {
            for (int character = 0; character < grid.size(); character++) {
                String currentRow = grid.get(row);
                char currentChar = currentRow.charAt(character);
                char nextChar = currentRow.charAt(character + 1);
                if (currentChar > nextChar) {
                    char temp = currentChar;
                    currentChar = nextChar;
                    nextChar = temp;

                }
            }
        }

        System.out.println(grid);
    }
}
