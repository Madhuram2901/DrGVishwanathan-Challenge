class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> S = new HashSet<>();

        for(int i : nums){
            if(S.add(i));
        }

        boolean bool;
        if(nums.length != S.size()){
            bool = true;
        }else{
            bool = false;
        }

        return bool;
    }
}