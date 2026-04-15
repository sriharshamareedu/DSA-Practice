class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int n=s.length();

        int[] store=new int[26];

        int i=0, j=0;
        
        int ans=0;
        int maxi=0;

        while(j<n){
            char c=s.charAt(j);
            maxi=Math.max(maxi,++store[c-'A']);

            if(j-i-maxi+1>k){
                char d=s.charAt(i);
                store[d-'A']--;
                i++;
            }

            ans=Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}