class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealthtillnow = 0;
        for(int[] customer : accounts){
            int currentwealth = 0;

            for(int bank: customer) {
                currentwealth += bank;
            }

            maximumWealthtillnow = Math.max(currentwealth , maximumWealthtillnow);
        }
        return maximumWealthtillnow;
    }
}