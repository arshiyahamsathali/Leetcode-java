class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxw = 0;
        while(l<r){
             // Area = shorter height × width
            int water = Math.min(height[l], height[r])*(r-l);
             // Update the maximum area
            maxw = Math.max(maxw, water);
            // Move the pointer at the shorter line
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxw;
    }
}