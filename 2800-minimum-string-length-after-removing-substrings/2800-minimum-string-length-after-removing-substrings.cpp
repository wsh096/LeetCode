class Solution {
public:
    int answer = 100001;
    void deleteString(string& s){
        if((s.find("AB") == string::npos)
        && (s.find("CD") == string::npos)){
            answer = min((int)s.size(), answer);
            return;
        }
        if(s.find("AB") != string::npos){
            int found = s.find("AB");   
            s = s.substr(0, found) + s.substr(found + 2);
            deleteString(s);
        }else if(s.find("CD") != string::npos){
            int found = s.find("CD");   
            s = s.substr(0, found) + s.substr(found + 2);
            deleteString(s);
        }
    }
    int minLength(string s) {
        deleteString(s);
        return answer;
    }
};