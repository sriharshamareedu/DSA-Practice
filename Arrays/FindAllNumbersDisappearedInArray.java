import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums){
        int n=nums.length;

        for(int i=0;i<n;i++){
            int a=nums[Math.abs(nums[i])-1];

            if(a>0){
                nums[Math.abs(nums[i])-1]*=-1;
            }

        }

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
    }
    
}
