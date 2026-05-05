class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();

        StringBuilder res=new StringBuilder();

        Deque<Character> deque=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!deque.isEmpty()&&deque.peekLast()==c){
                deque.removeLast();
            }
            else{
                deque.addLast(c);
            }
        }

        while(!deque.isEmpty()){
            res.append(deque.removeFirst());
        }

        return res.toString();
    }
}