package leetcode_amazon;

import punksterUtils_new.ArrayUtils;

import java.util.HashSet;

public class Q73_SetMatrixZeroes {
    public static void setZeroes(int[][] matrix){
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for(int i = 0 ; i <matrix.length;i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i : row){
            for(int j = 0 ; j < matrix[0].length;j++){
                matrix[i][j] = 0;
            }
        }

        for (int i : col){
            for(int j = 0 ; j < matrix.length;j++){
                matrix[j][i] = 0;
            }
        }

    }

    public static void setZeroes_optForSpace(int[][] matrix){
        boolean isCol = false;

        for (int i = 0 ; i <matrix.length;i++){
            if (matrix[i][0] == 0) isCol = true;
            for(int j = 1 ; j < matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1 ; i<matrix.length;i++){
            for(int j = 1; j<matrix[0].length;j++){
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0){
            for (int i = 0 ; i <matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }

        if (isCol == true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1,1,1}, {1,0,1},{1,1,1}};
        setZeroes_optForSpace(matrix);

        for(int[] row : matrix) ArrayUtils.printArray(row);

    }
}
