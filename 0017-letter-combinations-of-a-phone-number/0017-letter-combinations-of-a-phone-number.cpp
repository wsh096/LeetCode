class Solution {
    unordered_map<char, vector<char>> phone_numbers = {
        {'2', {'a', 'b', 'c'}},
        {'3', {'d', 'e', 'f'}},
        {'4', {'g', 'h', 'i'}},
        {'5', {'j', 'k', 'l'}},
        {'6', {'m', 'n', 'o'}},
        {'7', {'p', 'q', 'r', 's'}},
        {'8', {'t', 'u', 'v'}},
        {'9', {'w', 'x', 'y', 'z'}}
    };
public:
    vector<string> letterCombinations(string digits) {
        vector<string> answer;
        if(digits.empty()) return answer;

        queue<string> q;
        q.push("");
        for(char c : digits){
            digittostring(q, c);
        }
        while(!q.empty()){
            answer.push_back(q.front());
            q.pop();
        }
        return answer;
    }
private:
    void digittostring(queue<string>& q, char num){
        int limit = q.size();
        while(limit-- > 0){
            for(int i = 0; i < phone_numbers[num].size(); i++){
                string temp = q.front();
                temp += phone_numbers[num][i];
                q.push(temp);
            }
            q.pop();
        }
    }
};