class Solution {
    public void rotate(int[][] matrix) {
    int[][] arr = new int[matrix.length][matrix.length];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            arr[j][matrix.length - i - 1] = matrix[i][j];
        }
    }
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            matrix[i][j] = arr[i][j];
        }
    }

    }
}