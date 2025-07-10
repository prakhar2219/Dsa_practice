package Arrays;

import java.util.ArrayList;

public class DiagonalTraversal_2D {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };
        diagonalOrder(mat);
    }
    static void diagonalOrder(int[][] mat) {
        int m= mat.length;
        int n=mat[0].length;
        for (int col = 0; col < n; col++) {
            int row = 0, j = col;
            while (row < m && j >= 0) {
                System.out.print(mat[row][j] + " ");
                row++;
                j--;
            }
        }
        for (int rowStart = 1; rowStart < m; rowStart++) {
            int row = rowStart, col = n - 1;
            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }
        }

    }
}
