public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int n=nums.length;

        int ans=nums[0];
        int curr=nums[0];

        for(int i=1;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            ans=Math.max(ans,curr);
        }

        return ans;
    }
}
