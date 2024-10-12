class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int pointer = 0;
        int n = nums.size();
        for(int i = 0; i<n; i++){
            if(count == 0){
                pointer = nums[i];
            }
            if(nums[i] == pointer){
                count++;
            }else{
                count--;
            }
        }
        return pointer;
    }
};