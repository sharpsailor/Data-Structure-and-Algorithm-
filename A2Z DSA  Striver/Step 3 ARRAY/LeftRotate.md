### Link :https://leetcode.com/problems/rotate-array/
```
class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<0){
            k=k+nums.length;
        }
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums, int l , int r){
        while(l<r){
            int temp =nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
            r--;
        }
    }
}
```
