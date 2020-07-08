class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            ans += nums[i*2];
        }
        return ans;
    }
}