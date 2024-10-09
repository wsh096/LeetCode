class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0){
            return false;
            }
        string origin = to_string(x);
        int p1 = 0;
        int p2 = origin.size() - 1;
        while(p1 < p2){
            if(origin[p1] == origin[p2]){
                p1++;
                p2--;
            }else{
                return false;
            }
        }
        return true;
    }
};