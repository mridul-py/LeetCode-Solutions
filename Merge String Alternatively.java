class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=word1.length();
        int j=word2.length();
        int a=0;
        int b=0;
        String K="";
        while(a!=i&&b!=j)
        {
            K=K+word1.charAt(a)+word2.charAt(b);
            a++;
            b++;
        }
        if(a!=i){
        while(a!=i)
        {
            K=K+word1.charAt(a);
            a++;
        }
        }
        else{
        while(b!=j)
        {
            K=K+word2.charAt(b);
            b++;
        }
        }
        return K;
    }
}
