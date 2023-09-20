class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n = s1.size();
        int m = s2.size();
        for(int i = 0; i <= m - n; i++){
            string target = s2.substr(i,n);
            int array[26] = {0};
            
            for(int j = 0; j < n; j++){
                array[s1[j] - 'a']++;
                array[target[j] - 'a']--;
            }
            bool flag = true;
            for(int j = 0; j < 26; j++){
                if(array[j] != 0) {
                flag = false;
                break;
                }
            }
            if(flag) return true;
        }
        return false;
    }
};