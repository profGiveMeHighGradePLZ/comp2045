/**
 * 
 * Bonus Question 
 * 
 * This is a bonus question. We will only grade this if you score more than 50% of other questions.
 * The idea of this question is that we want to find out the move that can cancel the most number of puzzles.
 * You might want to use the BlockPuzzle class in our sample solution to help you. 
 * Copy any code from there if you need.
 * 
 * Complete the method bestMove.
 * The program should output the following message:
 *
The best move is to place 2 puzzle at (4, 0) with score 2
The best move is to place 1 puzzle at (0, 2) with score 1
No move can cancel any puzzle

 */

public class BlockPuzzleExtension {
    public static final char EMPTY = '.';

    public static void main(String[] args) {
        BlockPuzzleExtension bx = new BlockPuzzleExtension();
        char[][] map = {{'a', 'a', '.', '.', '.'},
                        {'a', 'a', '.', '.', '.'},
                        {'a', 'a', '.', '.', '.'},
                        {'a', 'a', '.', '.', '.'},
                        {'.', '.', '.', '.', '.'}};
        char[][][] puzzles = {{{'a', 'a'},
                                {'a', 'a'}},

                               {{'a', 'a', 'a'},
                                {'a', '.', '.'},
                                {'a', '.', '.'}},

                               {{'a', 'a', 'a'}}};
        bx.bestMove(map, puzzles);

        puzzles[2] = null;
        bx.bestMove(map, puzzles);

        puzzles[1] = null;
        bx.bestMove(map, puzzles);
    }
    void bestMove(char[][] map, char[][][] puzzles) {
        BlockPuzzle b = new BlockPuzzle();
        int bestScore = 0;
        int bestX = -1;
        int bestY = -1;
        int bestPuzzle = -1;

        for(int i = 0;i<puzzles.length;i++){
            char[][] cloneMap = clone(map);
            for(int r = 0;r<cloneMap.length;r++){
                for(int c = 0;c<cloneMap[r].length;c++){
                    if(canPlace(cloneMap,puzzles[i], r, c)){
                        place(cloneMap,puzzles[i], r, c);
                        int Score = cancelPuzzles(cloneMap);
                        if(Score > bestScore){
                            bestScore = Score;
                            bestX = r;
                            bestY = c;
                            bestPuzzle = i;
                        }
                        cloneMap = clone(map);
                    }
                }
            }
        }


        if (bestScore == 0) {
            System.out.println("No move can cancel any puzzle");
            return;
        }
        System.out.printf("The best move is to place %d puzzle at (%d, %d) with score %d\n", bestPuzzle, bestX, bestY, bestScore);
    } 

    /**
     * A helper method that you might find this useful.
     */
    char[][] clone(char[][] map) {
        char[][] result = new char[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                result[i][j] = map[i][j];
            }
        }
        return result;
    }

    int cancelPuzzles(char[][] map) {
        boolean[] row = new boolean[map.length];
        boolean[] col = new boolean[map[0].length];

        for (int r = 0; r < map.length; r++) { //check row
            row[r] =  true;
            for (int c = 0; c < map[0].length && row[r]; c++)
                if (map[r][c] == EMPTY)
                    row[r] = false;
        }
        for (int c = 0; c < map[0].length; c++) { //check col
            col[c] =  true;
            for (int r = 0; r < map.length && col[c]; r++)
                if (map[r][c] == EMPTY)
                    col[c] = false;
        }


        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++)
                if (row[r] || col[c])
                    map[r][c] = EMPTY;
        }

        return (countArr(row) + countArr(col));

    }

    /**
     * Kevin's helper method
     */
    int countArr(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i])
                count++;
        return count;
    }

    boolean canPlace(char[][] map, char[][] puzzle, int r, int c) {
        if (r < 0 || c < 0 || puzzle == null)
            return false;
        for (int i = 0; i < puzzle.length; i++) {
            if (puzzle.length + r > map.length || puzzle[i].length + c > map[i].length)
                return false;
            for (int j = 0; j < puzzle[i].length; j++)
                if (puzzle[i][j] != EMPTY && map[i + r][j + c] != EMPTY)
                    return false;
        }
        return true;

    }
    /**
     * This method is to place the puzzle at the position (r, c) of the map.
     * You can assume that the puzzle can be placed at the position (r, c) of the map when this
     * method is called.
     *
     * The map will be updated after placing the puzzle.
     * The puzzle will not be updated after the puzzle is placed.
     */
    void place(char[][] map, char[][] puzzle, int r, int c) {
        for (int i = 0; i < puzzle.length; i++)
            for (int j = 0; j < puzzle[i].length; j++)
                if (puzzle[i][j] != EMPTY)
                    map[i + r][j + c] = puzzle[i][j];
    }
}
