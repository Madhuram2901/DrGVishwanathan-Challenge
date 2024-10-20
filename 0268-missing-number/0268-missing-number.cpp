class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int max = nums.size();
        int nums_sum = 0;
        int fullsum = (max*(max+1)) / 2;
        for(int i = 0; i<max; i++){
            nums_sum += nums[i];
        }
        return fullsum - nums_sum;
    }
};