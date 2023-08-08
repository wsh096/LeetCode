class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] tFrequency = new int[127];
        int[] sFrequency = new int[127];

        for(char c : t.toCharArray()){
            tFrequency[c]++;
        }

        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length();

        while(right < s.length()){
            char rightChar = s.charAt(right);
            if(tFrequency[rightChar] > 0) {
                sFrequency[rightChar]++;
                if(sFrequency[rightChar] <= tFrequency[rightChar]){
                    requiredChars--;
                }
            }
            while (requiredChars == 0 && left <= right) {
                if(minLength > right - left){
                    minLength = right - left;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                if(tFrequency[leftChar] > 0){
                    sFrequency[leftChar]--;
                    if(sFrequency[leftChar] < tFrequency[leftChar]){
                        requiredChars++;
                    }
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength + 1);
    }
}