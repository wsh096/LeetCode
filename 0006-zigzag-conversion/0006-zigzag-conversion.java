class Solution {
    public String convert(String s, int numRows) {
        if(numRows== 1) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            int lastPos = -1;
            for(int j = 0; true; j++){
                int pos = -1;
                if(i == 0) {
                    pos = j * 2 * (numRows - 1);
                }else if(i == numRows - 1) {
                    pos = (numRows - 1) + j * 2 * (numRows - 1);
                }else {
                    if(j == 0) {
                        pos = i;
                        lastPos = pos;
                    }else if(j % 2 == 1) {
                        pos = lastPos + 2 * (numRows - 1 - i);
                        lastPos = pos;
                    }else{
                        pos = lastPos + 2 * i;
                        lastPos = pos;
                    }
                }
                if(pos >= s.length()) break;
                sb.append(s.charAt(pos));
            }
        }
        return sb.toString();
    }
}