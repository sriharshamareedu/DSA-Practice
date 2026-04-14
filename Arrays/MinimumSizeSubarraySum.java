class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;

        int ans=Integer.MAX_VALUE;
        
        int sum=0;
        int i=0, j=0;
        while(j<n){
            sum+=nums[j];

            if(sum>=target){
                while(i<=j&&sum>=target){
                    ans=Math.min(ans,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            }

            j++;
        }

        return ans==Integer.MAX_VALUE?0:ans;
    }
}