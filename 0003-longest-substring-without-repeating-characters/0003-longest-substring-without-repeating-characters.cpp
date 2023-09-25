class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int answer = 0;
        int start = 0;
        unordered_map<char, int> map;
        for(int end = 0; end < n; end++){
            
            if(map.find(s[end]) != map.end()){
                start = max(start, map[s[end]] + 1);
            }

            answer = max(answer, end - start + 1);
            map[s[end]] = end;
        }
        return answer;
    }
};