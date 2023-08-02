import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }else{
                list.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        list.add(currentInterval);
        return list.toArray(new int[list.size()][]);
    }
}