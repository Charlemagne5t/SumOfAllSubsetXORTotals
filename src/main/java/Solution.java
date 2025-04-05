class Solution {
    public int subsetXORSum(int[] nums) {
        int[] res = new int[1];
        
        dfs(nums, 0, 0, res);
        return res[0]; 
    }
    void dfs(int[] nums, int i, int XOR, int[] res){
        res[0] += XOR;
        for(int j = i ; j < nums.length;j++){
            dfs(nums, j + 1, XOR ^ nums[j], res);
        }
    }

}