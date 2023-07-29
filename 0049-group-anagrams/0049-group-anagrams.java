import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(!anagram.containsKey(sortedStr)){
                anagram.put(sortedStr, new ArrayList<>());
            }
            anagram.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagram.values());
    }
}