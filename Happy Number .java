class Solution {
    public boolean isHappy(int n) {
        if(n==1||n==7)
        return true;
        if(n<10)
        return false;
        int a=n;
        int d=0;
        int Sum=0;

        while(a!=0)
        {
            d=a%10;
            Sum+=Math.pow(d,2);
            a=a/10;
        }
        return isHappy(Sum);
    }
}
