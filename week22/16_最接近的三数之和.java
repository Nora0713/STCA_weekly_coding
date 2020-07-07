class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE,p1 = 0, p2 = 0,p3 = 0,n = nums.length;
        for(int i=0; i< n;i++){
            int new_target = target - nums[i];
            int diff = Integer.MAX_VALUE;
            p2 = i+1;
            p3=n-1;
            while(p2<p3){
                diff = Math.abs(diff)>Math.abs(nums[p2]+nums[p3]-new_target)?(nums[p2]+nums[p3]-new_target):diff;
                System.out.println(i+" "+p2+" "+p3 + " " + (nums[i] + new_target + diff));
                if(nums[p2]+nums[p3]>new_target){
                    p3--;
                }
                else if(nums[p2]+nums[p3]<new_target){
                    p2++;
                }
                else return target;
            }
            int temp = nums[i] + new_target + diff;
            if(ans == Integer.MAX_VALUE) ans = temp;
            ans = Math.abs(ans-target)>Math.abs(temp-target)?temp:ans;
        }
        return ans;
    }
}