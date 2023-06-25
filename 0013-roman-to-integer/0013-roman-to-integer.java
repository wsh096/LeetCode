class Solution {
    static final int[] VALUES = {1000,900, 500,400,100,90,50,40,10,9,5,4,1};
    static final String[] SYMBOLS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public int romanToInt(String s) {
        if(s == null | s.length() == 0) return 0;
        StringBuilder sb = new StringBuilder(s);
        int result = 0;
        for(int i = 0; i < VALUES.length && sb.length() != 0; i++){
            while(sb.indexOf(SYMBOLS[i])  == 0) {//맨앞인 경우
            result += VALUES[i];
            sb.delete(0, SYMBOLS[i].length());//길이만큼을 제거해 인덱스 관리
            }
        }
        return result;
    }
}