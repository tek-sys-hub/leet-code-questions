import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        // 1. Define our test grid and k value
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k = 9;

        // 2. Create an instance of Solution
        Solution sol = new Solution();

        // 3. Call shiftGrid()
        // 2. Create an instance of Solution
        List<List<Integer>> shiftedGrid = sol.shiftGrid(grid, k);

        // 4. Print the output
        System.out.println("Original Grid:");
        printGrid(grid);

        System.out.println("\nGrid after " + k + " shift(s):");
        System.out.println(shiftedGrid);
    }

    // Helper method to print 2D array neatly
    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int row = grid.length; // Row Length
        int col = grid[0].length; // Column Length
        int totalSlot = row * col; // Size Of Total Matrix

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int currentSpot = i * col + j;

                int targetSpot = (currentSpot + k) % totalSlot;

                int targetRow = targetSpot / col;
                int targetCol = targetSpot % col;

                result[targetRow][targetCol] = grid[i][j];

            }
        }

        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < row; i++){
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < col; j++){
                    currentRow.add(result[i][j]);
            }
            output.add(currentRow);
        }

        return output;

    }
}