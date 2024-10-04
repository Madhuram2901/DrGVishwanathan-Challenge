class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = (height.length)-1;
        int Max_vol = 0;

        while(left<right){
            int length = right - left;
            int vol = Math.min(height[left], height[right]) * length;
            if(Max_vol<vol){
                Max_vol = vol;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return Max_vol;
    }
}