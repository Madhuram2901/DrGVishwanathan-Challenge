class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        while(i<n-1){
            if(nums[i] == nums[i+1]){
                nums.erase(nums.begin()+i);
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
};