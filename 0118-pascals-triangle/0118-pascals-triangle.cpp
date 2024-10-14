class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        if(numRows == 1) return {{1}};
        vector<vector<int>> answer = {{1}, {1, 1}};
        for(int i = 2; i < numRows; i++){
            vector<int> row(i + 1, 1);
            for(int j = 1; j < i; j++){
                    row[j] = answer[i - 1][j - 1] + answer[i - 1][j];
                }
                answer.push_back(row);
            }
        return answer;
    }
};