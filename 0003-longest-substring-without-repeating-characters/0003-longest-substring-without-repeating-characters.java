import java.util.Map;
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        char[] a = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < a.length; end++){
            char currentChar = a[end];

            if(map.containsKey(currentChar)){
                start = Math.max(map.get(currentChar) + 1, start);
            }

        maxLength = Math.max(maxLength,end - start + 1);
        map.put(currentChar,end);//(갱신) end == index
        }
        return maxLength;
    }
}