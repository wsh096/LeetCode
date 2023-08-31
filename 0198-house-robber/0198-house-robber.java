class Solution {
    public int rob(int[] cost) {
        if(cost.length < 3) {
            Arrays.sort(cost);
            return cost[cost.length-1];
        }
        cost[cost.length-3] += cost[cost.length-1];
     for(int i = cost.length-4; i>=0; i--) {
             cost[i] += Math.max(cost[i+2],cost[i+3]);
        }

        return Math.max(cost[0],cost[1]);
    }
}