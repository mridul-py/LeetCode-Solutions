class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int Students=0;
        int chalkleft=0;
        int i=0;
        while(k>=chalk[i])
        {
            if(i!=chalk.length)
            {
                chalkleft=k-chalk[i];
                k=k-chalk[i];
                Students++;
                i++;
            if( i==chalk.length)
            {
                i=0;
                Students=0;
            }
            }
    }
    return Students;
}
}
