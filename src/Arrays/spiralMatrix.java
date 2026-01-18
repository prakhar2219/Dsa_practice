package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    static void helper(int[][] matrix, int startRow, int startCol, int endRow, int endCol, List<Integer> ans) {
            if (startRow > endRow || startCol > endCol) return;
            for (int i = startCol; i <= endCol; i++){
                ans.add(matrix[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++){
                ans.add(matrix[i][endCol]);
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--){
                    ans.add(matrix[endRow][i]);
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--){
                    ans.add(matrix[i][startCol]);
                }
            }
            helper(matrix, startRow + 1, startCol + 1, endRow - 1, endCol - 1,ans);
        }

        public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> ans=new ArrayList<>();
            int m = matrix.length, n = matrix[0].length;
            helper(matrix, 0, 0, m - 1, n - 1,ans);
            return ans;
        }


    }


