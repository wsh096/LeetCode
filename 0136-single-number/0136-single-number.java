import java.util.Set;
import java.util.HashSet;
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
            
        }
        int answer = 0;
            for(int s : set) answer = s;
        return answer;
    }
}