
class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0){
            return false;
            }
        string origin = to_string(x);
        string change;
        for(int i = origin.size() - 1; i >=0 ; i--){
            change += origin[i];
        }
        return origin == change;
    }
};