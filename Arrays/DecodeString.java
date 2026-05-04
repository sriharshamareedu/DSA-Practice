class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int num=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                countStack.push(num);
                stringStack.push(current);
                current=new StringBuilder();
                num=0;
            }
            else if(c==']'){
                int repeatTimes=countStack.pop();
                StringBuilder inner=current;
                current=stringStack.pop();   
                for(int j=0;j<repeatTimes;j++){
                    current.append(inner);
                }
            }
            else{
                current.append(c);  
            }
        }
        
        return current.toString();
    }
}