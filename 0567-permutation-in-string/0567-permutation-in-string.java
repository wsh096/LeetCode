class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length())return false;
        int[] data = new int[26];
        int[] test = new int[26];
        
        for(char c : s1.toCharArray())data[c-'a']++;
        
        for(int i=0;i<s1.length();i++)test[s2.charAt(i)-'a']++;        
        int n=s1.length(); 

        for(int i=0;i<s2.length()-n;i++){
            if(equalsString(test, data))return true;
            test[s2.charAt(i+n)-'a']++;     
            test[s2.charAt(i)-'a']--;            
        }
        return equalsString(test, data);
    }
    private boolean equalsString(int[] s1, int[] s2){
        
        for(int i=0;i<26;i++)
            if(s1[i]!=s2[i])return false;        
        return true;
    }
}