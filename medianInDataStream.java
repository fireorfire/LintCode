public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: the median of numbers
     */
    public int[] medianII(int[] nums) {
        // write your code here
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            if(maxheap.size() == 0 || -maxheap.peek() >= nums[i]) {
                maxheap.offer(-nums[i]);
                if(maxheap.size() - minheap.size() > 1) {
                    Integer move = maxheap.poll();
                    minheap.offer(-move);
                }
            }else {
                minheap.offer(nums[i]);
                if(minheap.size() > maxheap.size()) {
                    Integer move = minheap.poll();
                    maxheap.offer(-move);
                }
            }
            Integer mid = maxheap.peek();
            result[i] = - mid;
        }
        return result;
    }
}
