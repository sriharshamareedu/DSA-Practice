class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n=s.length();

        int len=0;

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            int a=i, b=i;

            while(a>=0&&b<n&&s.charAt(a)==s.charAt(b)){
                a--;
                b++;
            }

            len=Math.max(len,b-a-1);

            if(len==b-a-1){
                ans=new StringBuilder(s.substring(a+1,b));
            }

            a=i;
            b=i+1;

            while(a>=0&&b<n&&s.charAt(a)==s.charAt(b)){
                a--;
                b++;
            }

            len=Math.max(len,b-a-1);

            if(len==b-a-1){
                ans=new StringBuilder(s.substring(a+1,b));
            }
        }

        return ans.toString();
    }
}