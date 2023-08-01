import java.util.List;
import java.util.ArrayList;
class Solution {
    int[] dx = {0, 1 , 0 , -1};
    int[] dy = {1, 0, -1, 0};
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> answer = new ArrayList<>();
        int x = 0, y = 0, direction = 0;
        int num = 1;
        while(num++ <= m * n){
            answer.add(matrix[x][y]);
            matrix[x][y] = -101;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if(nx < 0 || nx >= m || ny < 0 || ny >= n || matrix[nx][ny] == -101){
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}