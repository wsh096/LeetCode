class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> res;
        map<char, int> m;
        for(char c = 'a'; c < 26; c++) m[c] = 0;

        for(int i = 0; i < p.size(); i++) m[p[i]]++;

        int left = 0, right = 0, cnt = p.size();

        while(right < s.size()) {
            if(m[s[right]] >= 1) cnt--;
            m[s[right]]--;
            right++;
            if(cnt == 0) res.push_back(left);

            if(right - left == p.size()) {
                if(m[s[left]] >= 0) cnt++;
                m[s[left]]++;
                left++;
            }
        }
    return res;
    }
};