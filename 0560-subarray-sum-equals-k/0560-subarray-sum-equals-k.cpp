class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int Counter = 0;

        for(int i = 0; i<nums.size(); i++){
            int Sum = nums[i];
            if(nums[i] == k){
                Counter++;
            }
            for(int j = i + 1; j < nums.size(); j++){

                Sum += nums[j];

                if(Sum == k){
                    Counter++;
                }
            }
        }
        return Counter;
    }
};