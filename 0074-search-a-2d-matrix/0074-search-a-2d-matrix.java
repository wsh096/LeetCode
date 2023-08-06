import java.util.Arrays;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] <= target){
                int idx = Arrays.binarySearch(matrix[i], target);
                if(idx >= 0) return true;
            }
        }
        return false;
    }
}