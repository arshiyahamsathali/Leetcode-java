import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Stores all numbers seen so far
        HashSet<Integer> set = new HashSet<>();
        // Number already seen → duplicate found
        for(int num:nums){
            if(set.contains(num)) return true;
            // Remember this number for future checks
            set.add(num);
        }
        return false;
    }
}