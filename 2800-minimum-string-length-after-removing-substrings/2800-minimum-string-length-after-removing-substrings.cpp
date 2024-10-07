class Solution {
public:
    int minLength(string s) {
        while(s.find("AB") != string::npos || s.find("CD") != string::npos){
            if(s.find("AB") != string::npos){
                int found = s.find("AB");
                s = s.substr(0, found) + s.substr(found + 2);
            }
            if(s.find("CD") != string::npos){
                int found = s.find("CD");
                s = s.substr(0, found) + s.substr(found + 2);
            }
        }
        return (int)s.size();
    }
};