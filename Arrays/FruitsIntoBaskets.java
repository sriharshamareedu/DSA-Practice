public class FruitsIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;

        int[] store=new int[n];

        int ans=0, unique=0;

        int i=0, j=0;
        
        while(j<n){
            int a=fruits[j];

            if(store[a]==0){
                unique++;
            }

            store[a]++;

            while(i<=j&&unique>2){
                int b=fruits[i];
                store[b]--;
                if(store[b]==0){
                    unique--;
                }

                i++;
            }

            ans=Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}