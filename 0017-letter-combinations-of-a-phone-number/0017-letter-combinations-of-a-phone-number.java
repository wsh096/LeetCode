class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return Collections.emptyList();
        String [] phone_map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output = new ArrayList<>();
        backTrack("",digits, phone_map, output);
        return output;
    }
    private void backTrack(String combination, String nextDigits, String[] phone_map, List<String> output){
        if(nextDigits.isEmpty()){
            output.add(combination);
        }else{
            String letters = phone_map[nextDigits.charAt(0) - '2'];
            for(char letter : letters.toCharArray()){
                backTrack(combination + letter, nextDigits.substring(1), phone_map, output);
            }
        }
    }
}