import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(target - nums[0], 0);// 차를 이용해 값을 찾고(nums[i]에 해당하게 됨 target == 7,  -3 일시 4만 더 있으면 해결. 필요한 값이 키가 됨.), 인덱스를 value로 저장해 관리.
        int [] arr = new int[2];
        for(int i = 1; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                break;
            }
            map.put(target-nums[i], i);
        }
        return arr;
    }
}