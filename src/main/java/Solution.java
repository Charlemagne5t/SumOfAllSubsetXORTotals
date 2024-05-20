public class Solution {
    int res = 0;
    public int subsetXORSum(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            dfs(nums, i, nums[i]);
        }

        return res;
    }

    void dfs(int[] nums, int i, int xor) {
        res += xor;
        for(int j = i + 1; j < nums.length; j++) {
            dfs(nums, j, xor ^ nums[j]);
        }

    }
}