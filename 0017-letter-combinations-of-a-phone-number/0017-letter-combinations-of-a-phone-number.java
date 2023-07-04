import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<Character, String> map = new HashMap<>();
{
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
}
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String digits, int idx, StringBuilder sb){
        if(idx == digits.length()){
            result.add(sb.toString());
            return;
            }
            char digit = digits.charAt(idx);
            String letter = map.get(digit);
            for(char c : letter.toCharArray()){
                sb.append(c);
                backtrack(result, digits, idx + 1, sb);
                sb.deleteCharAt(sb.length()-1);
            }
    }
}
