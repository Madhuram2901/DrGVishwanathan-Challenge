class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int lengths = 0;
        int count = 0;
        int n = nums.size();
        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                count++;
            }else{
                lengths = max(lengths, count);
                count = 0;
            }
            lengths = max(lengths, count);
        }
        return lengths;
    }
};