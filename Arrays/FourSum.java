import java.util.*;

class FourSum{
    public List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);

        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }

                long val=(long)target-((long)nums[i]+(long)nums[j]);
                int a=j+1, b=n-1;

                while(a<b){
                    long sum=(long)nums[a]+(long)nums[b];
                    if(sum==val){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[a],nums[b]));
                        a++;
                        b--;

                        while(a<b&&nums[a]==nums[a-1]){
                            a++;
                        }

                        while(a<b&&nums[b]==nums[b+1]){
                            b--;
                        }

                    }
                    else if(sum>val){
                        b--;
                    }
                    else{
                        a++;
                    }
                }
            }
        }

        return ans;
    }
}