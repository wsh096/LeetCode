class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String voewls = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            while(start < end && voewls.indexOf(chars[start]) == -1) start++;
            
            while(start < end && voewls.indexOf(chars[end]) == -1) end--;
            
            if(start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}