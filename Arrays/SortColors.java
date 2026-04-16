class SortColors {
    public void sortColors(int[] nums) {
        int n=nums.length;

        int left=0, mid=0, right=n-1;

        while(mid<=right){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                int c=nums[left];
                nums[left]=nums[mid];
                nums[mid]=c;
                left++;
                mid++;
            }
            else{
                int c=nums[mid];
                nums[mid]=nums[right];
                nums[right]=c;
                right--;
            }
        }

        return;
    }
}