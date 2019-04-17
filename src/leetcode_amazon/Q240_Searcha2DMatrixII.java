package leetcode_amazon;

public class Q240_Searcha2DMatrixII {
    public static boolean binarySearch(int[][] matrix, int start,boolean isVertical,int target){
        int lo = start;
        int hi = isVertical ? matrix.length-1 : matrix[0].length-1;

        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isVertical){
                if(matrix[mid][start] == target) return true;
                else if (target > matrix[mid][start]) lo = mid+1;
                else hi = mid-1;
            }
            else {
                if (matrix[start][mid] == target) return true;
                else if(target > matrix[start][mid]) lo = mid+1;
                else hi = mid-1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0) return false;
        int shorterDim = Math.min(matrix.length,matrix[0].length);

        for (int i = 0 ; i < shorterDim;i++){
            if (binarySearch(matrix,i,true,target) || binarySearch(matrix,i,false,target)) return true;
        }
        return false;
    }

    public static boolean searchMatrix_spacereduction(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length-1;
        int col = 0;

        while (row >=0 && col <=matrix[0].length-1){
            if (matrix[row][col] == target) return true;
            else if (target < matrix[row][col]) row--;
            else col++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{  {1,   4,  7, 11, 15},{2,   5,  8, 12, 19}, {3,   6,  9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix_spacereduction(matrix,5));
    }
}
