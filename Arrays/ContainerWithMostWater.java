class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;

        int i=0, j=n-1;
        int ans=0;

        while(i<j){
            int prod=(j-i)*(Math.min(height[i],height[j]));
            ans=Math.max(ans,prod);
            
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return ans;
    }
}