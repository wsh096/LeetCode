class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int [] answer = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int i : map.keySet()) pq.offer(i);
        for(int i = 0; i < k; i++) answer[i] = pq.poll();
        return answer;
    }
}