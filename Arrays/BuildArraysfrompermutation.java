// https://leetcode.com/problems/build-array-from-permutation


class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int x=0;x<n;x++){
            ans[x]=nums[nums[x]];
        }
        return ans;
    }
}















