class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        //slicing
        for(int i = 0; i <= m - n; i++){
            String target = s2.substring(i, i + n);
            int [] goal = new int[26];
            char[] go = s1.toCharArray();
            char[] find = target.toCharArray();
            for(int j = 0; j < n; j++){
                goal[go[j] - 'a']++;
                goal[find[j] - 'a']--;
            }
            for(int j = 0; j < 26; j++){
                if(goal[j] != 0) break;
                if(j == 25 && goal[j] == 0) return true;
            }
        }
        return false;
    }
}