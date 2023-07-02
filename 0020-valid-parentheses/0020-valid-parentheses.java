import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
            }else{
                if(stack.peek()=='{' & chars[i] == '}'){
                    stack.pop();
                }else if(stack.peek()=='[' & chars[i] == ']'){
                    stack.pop();
                }else if(stack.peek()=='(' & chars[i] == ')'){
                    stack.pop();
                }else stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }
}