class Pair{
    int r;
    int c;
    int t;
    Pair(int r, int c, int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int answer = 0;
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        int cntFresh = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }else if(grid[i][j] == 1) cntFresh++;
                else visited[i][j] = 0;
            }
        }
    int cnt = 0;
    while(!q.isEmpty()){
        Pair p = q.poll();
        int row = p.r;
        int col = p.c;
        int time = p.t;
        answer = answer > time ? answer : time;
        for(int i = 0; i < 4; i++){
            int nr = row + dx[i];
            int nc = col + dy[i];

            if(nr < 0|| nr >= n || nc < 0 || nc >= m || visited[nr][nc] == 2 || grid[nr][nc] == 0) continue;

            q.offer(new Pair(nr,nc, time + 1));
            visited[nr][nc] = 2;
            cnt++;
       }
    }
    if(cnt != cntFresh) return -1;
    return answer;
    }
}