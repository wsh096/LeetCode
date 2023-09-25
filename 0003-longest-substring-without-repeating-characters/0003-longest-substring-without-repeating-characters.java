class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int start = 0;
        char [] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < chars.length; end++){
            if(map.containsKey(chars[end])){
                start = Math.max(map.get(chars[end]) + 1, start);
            }
            answer = Math.max(answer, end - start + 1);
            map.put(chars[end], end);
        }
        return answer;
    }
}