#include <algorithm>
class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0){
            return false;
            }
        string origin = to_string(x);
        string change = origin;
        reverse(change.begin(), change.end());

        return origin == change;
    }
};