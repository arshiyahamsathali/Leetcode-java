import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
         // Min-heap to store the k largest elements seen so far
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num:nums){
            // Add the current number
            heap.add(num);
            // Keep only the k largest elements in the heap
            if(heap.size()>k){
                // Remove the smallest
                 heap.poll();
            }
        }
        // The top of the heap is the kth largest element
        return heap.peek();
    }
}