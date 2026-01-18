package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    //    public void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        Set<Integer> row = new HashSet<>();
//        Set<Integer> column = new HashSet<>();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    row.add(i);
//                    column.add(j);
//                }
//            }
//        }
//        for (int key: row){
//            for (int i = 0; i < n; i++) {
//                matrix[key][i]=0;
//            }
//        }
//        for (int key: column){
//            for (int i = 0; i < m; i++) {
//                matrix[i][key]=0;
//            }
//        }
//    }
//    
//    constant space
    static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int c0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    if (j == 0)
                        c0 = 0;
                    else
                        mat[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++)
                mat[0][j] = 0;
        }
        if (c0 == 0) {
            for (int i = 0; i < n; i++)
                mat[i][0] = 0;
        }
    }
}

