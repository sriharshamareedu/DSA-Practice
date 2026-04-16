import java.util.*;

class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            int sum=-1*nums[i];
            int a=i+1, b=n-1;

            while(a<b){
                int val=nums[a]+nums[b];
                if(val==sum){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[a]);
                    l.add(nums[b]);
                    ans.add(l);
                    a++;
                    b--;

                    while(a<b&&nums[a]==nums[a-1]){
                        a++;
                    }

                    while(a<b&&nums[b]==nums[b+1]){
                        b--;
                    }
                }
                else if(val>sum){
                    b--;
                }
                else{
                    a++;
                }
            }
        }

        return ans;
    }
}