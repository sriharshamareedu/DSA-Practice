class CountAndSay{
    public String output(int i, int n, String s){
        if(i==n){
            return s;
        }

        int k=s.length();

        StringBuilder t=new StringBuilder();

        int countSame=1;

        for(int j=0;j<k;j++){
            if(j==k-1||s.charAt(j)!=s.charAt(j+1)){
                t.append(countSame);
                t.append(s.charAt(j));
                countSame=1;
            }
            else{
                countSame++;
            }
        }

        return output(i+1,n,t.toString());
    }
    public String countAndSay(int n) {
        return output(1,n,"1");
    }
}