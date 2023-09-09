class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int size = nums.length, result [] = new int[size - k + 1], idx = 0;
        for(int i = 0; i < size; i++){
            int currentNum = nums[i];
            while(!dq.isEmpty() && dq.peekLast() < i - k + 1){
                dq.pollLast();
            }
            while(!dq.isEmpty() && nums[dq.peekFirst()] < currentNum) {
                dq.pollFirst();
            }
            dq.offerFirst(i);
            if(i + 1 >= k){
                result[idx++] = nums[dq.peekLast()];
            }
        }
        return result;
    }
}