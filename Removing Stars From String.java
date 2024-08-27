class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        int j=0;
        String K="";
        String A="*";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=A.charAt(0))
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==A.charAt(0))
            {
                stack.pop();
            }
        }
        for(int x=0;x<stack.size();x++)
        {
            K+=stack.get(x);
        }
        return K;
    }
}
