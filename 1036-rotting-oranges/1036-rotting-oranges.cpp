class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>> visited = grid;
        queue<pair<int, int>> q;
        int cntFreshOrange = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(visited[i][j] == 2){
                    q.push({i, j});
                }
                if(visited[i][j] == 1) cntFreshOrange++;
            }
        }
        if(cntFreshOrange == 0) return 0;
        if(q.empty()) return -1;

        int time = -1;
        vector<pair<int,int>> dirs = {{-1, 0},{0, 1}, {1, 0}, {0, -1}};
        while(!q.empty()){
            int size = q.size();
            while(size--){
                auto[x, y] = q.front();
                q.pop();
                for(auto[dx, dy] : dirs){
                    int i = x + dx;
                    int j = y + dy;
                    if(i < 0 || i >= m || j < 0 || j >= n || visited[i][j] == 2 || visited[i][j] == 0) continue;
                    visited[i][j] = 2;
                    cntFreshOrange--;
                    q.push({i, j});
                }
            }
            time++;
        }
        if(cntFreshOrange == 0) return time;
        return -1;
    }
};