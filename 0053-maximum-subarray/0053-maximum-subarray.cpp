class Solution {
    public:
        int maxSubArray(vector<int>& nums) {
        int Max = nums[0];
        int Sum = nums[0];

        for(int i = 1; i< nums.size(); i++){
            Max = max(nums[i], Max+nums[i]);
            Sum = max(Sum, Max);
        }
        return Sum;
    }
};