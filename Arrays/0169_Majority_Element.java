class Solution {
    public int majorityElement(int[] nums) {
       int candiate=0;
        int count=0;
        for(int num:nums){
            if(count==0) candiate = num;
            
            if(candiate == num) count++;
            else count--;
        }
        return candiate;
    }
}