import java.util.Stack;
class Solution {
    public int longestValidParentheses(String s) {
        int answer = 0;
        
        char[] c = s.toCharArray();
        Stack<Integer> stack = new Stack<>(); stack.push(-1);
        for(int i = 0; i < c.length; i++){
           if(c[i]=='(') stack.push(i);
           else {stack.pop(); if(stack.isEmpty())stack.push(i); else answer =answer > i - stack.peek() ? answer : i - stack.peek();}
        }
        return answer;
    }
}