class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var answer = 0
        var start = 0
        val map = HashMap<Char, Int>()
        val c = s.toCharArray()
        for(end in 0 until c.size){
            if(map.containsKey(c[end])){
                start = maxOf(start, map[c[end]]!! + 1)
            }
            answer = maxOf(answer, end - start + 1);
            map[c[end]] = end;
        }
        return answer;
    }
}