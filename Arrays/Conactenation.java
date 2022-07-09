// https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int [2*n];
        for(int x=0;x<n;x++){
            ans[x]=nums[x];
            ans[x+n]=nums[x];
        }
        return ans;
    }
}
