class Solution {
public:
    int maxProduct(vector<int>& nums) {
        
         int n= nums.size(),pro;
         int Max = nums[0];
         if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            pro = nums[i];
            Max = max(Max, pro); 
            for(int j=i+1;j<n;j++){

                pro = pro * nums[j];
                if(pro>Max){
                    Max = pro;
                }
            }
        }
      
        
        return Max;
    }
};