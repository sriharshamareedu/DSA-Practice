class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> stack=new Stack<>();

        for(int i=0;i<parts.length;i++){
            String s=parts[i];

            if(s.equals("")||s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder res=new StringBuilder();

        if(stack.isEmpty()){
            return "/";
        }
        
        while(!stack.isEmpty()){
            String s=stack.pop();

            String t=new StringBuilder(s).reverse().toString();
            res.append(t);
            res.append("/");
        }

        return res.reverse().toString();
        
    }
}