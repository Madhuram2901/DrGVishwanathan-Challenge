class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int Product = 1;
        int Max = -10;
        for(int i = 0; i < nums.size(); i++){
            Product *= nums[i];
            Max = max(Product, Max);
            if(Product == 0){
                Product = 1;
            }
        }
        Product = 1;
        for(int j = nums.size()-1; j>=0; j--){
            Product *= nums[j];

            Max = max(Product, Max);
            if(Product == 0){
                Product = 1;
            }
        }
        return Max;
    }
};