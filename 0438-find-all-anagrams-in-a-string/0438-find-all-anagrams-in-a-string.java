class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] chars = new int[26];
        for(char c : p.toCharArray()) chars[c-'a']++;

        int left = 0;
        int right = 0;
        int cnt = p.length();

        while(right < s.length()){
            if(chars[s.charAt(right++) - 'a']-- >= 1) cnt--;
            if(cnt == 0) result.add(left);

            if(right - left == p.length() && chars[s.charAt(left++) - 'a']++ >= 0) cnt++;
        }
        return result;
    }
}