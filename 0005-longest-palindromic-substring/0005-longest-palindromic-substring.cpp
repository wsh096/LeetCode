class Solution {
    private:
        bool check(string &s, int left, int right){
            while(left < right){
                if(s[left] != s[right]){
                    return false;
                }
                left++; right--;
            }
            return true;
        }
    public:
        string longestPalindrome(string s){
            int n = s.size();
            int start = 0;
            int max = 0;
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(check(s, i, j)){
                        if(j - i + 1 > max){
                            max = j - i + 1;
                            start = i;
                        }
                    }
                }
            }
            return s.substr(start, max);
        }
    };      