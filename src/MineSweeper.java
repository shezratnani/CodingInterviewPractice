import java.util.Arrays;

public class MineSweeper {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        System.out.println(Arrays.deepToString(mineSweeper(bombs1,3,3)).replace("], ", "]\n"));
        // mineSweeper(bombs1, 3, 3) should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]
        System.out.println("\n\n");
        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        System.out.println(Arrays.deepToString(mineSweeper(bombs2, 3, 4)).replace("], ", "]\n"));
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]
        System.out.println("\n\n");
        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        System.out.println(Arrays.deepToString(mineSweeper(bombs3, 5, 5)).replace("], ", "]\n"));
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.

    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int[] bomb: bombs) {
            int rowIndex = bomb[0];
            int colIndex = bomb[1];
            field[rowIndex][colIndex] = -1;
            for(int i = rowIndex - 1; i < rowIndex + 2; i++) {
                for (int j = colIndex - 1; j < colIndex + 2; j++) {
                    if (0 <= i && i < numRows &&
                            0 <= j && j < numCols &&
                            field[i][j] != -1) {
                        field[i][j] += 1;
                    }
                }
            }
        }
        return field;
    }
}


/*
* public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int[] bomb: bombs) {
            field[bomb[0]][bomb[1]] = -1;
            setupUpDown(bomb, field);
            setupLeftRight(bomb, field);
        }
        return field;
    }

    public static void setupUpDown(int[] bomb, int[][] field) {
        if(bomb[0]  - 1 >= 0){ //up
            int[] aboveBomb = {bomb[0] - 1, bomb[1]};
            field[aboveBomb[0]][aboveBomb[1]] = field[aboveBomb[0]][aboveBomb[1]] != -1 ? field[aboveBomb[0]][aboveBomb[1]] +1 : -1;
            setupLeftRight(aboveBomb, field);
        }
        if(bomb[0]  + 1 < field.length){ //down
            int[] belowBomb = {bomb[0] + 1, bomb[1]};
            field[belowBomb[0]][belowBomb[1]] = field[belowBomb[0]][belowBomb[1]] != -1 ? field[belowBomb[0]][belowBomb[1]] +1 : -1;
            setupLeftRight(belowBomb, field);
        }
    }

    public static void setupLeftRight(int[] bomb, int[][] field) {
        if(bomb[1] - 1 >= 0) { //left
            field[bomb[0]][bomb[1] - 1] = field[bomb[0]][bomb[1] - 1] != -1 ? field[bomb[0]][bomb[1] - 1] +1 : -1;
        }
        if(bomb[1] + 1 < field[0].length){ //right
            field[bomb[0]][bomb[1] + 1] = field[bomb[0]][bomb[1] + 1] != -1 ? field[bomb[0]][bomb[1] + 1] + 1 : -1;
        }
    }
* */