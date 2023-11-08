class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        recursive(answer, 0, 0, new StringBuilder(), n);
        return answer;
    }
    private void recursive(List<String> answer, int left, int right, StringBuilder str, int n){
        if(str.length() == n * 2){
            answer.add(str.toString());
            return;
        }
        if(left < n){
            recursive(answer, left + 1, right, str.append("("), n);
            str.deleteCharAt(str.length()-1);
        }
        if(right < left){
          recursive(answer, left, right + 1, str.append(")"), n);
          str.deleteCharAt(str.length()-1);  
        }
    }
}