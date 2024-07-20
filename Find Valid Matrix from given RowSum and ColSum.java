class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int a=rowSum.length;
        int b=colSum.length;
        int m[][]= new int[a][b];
        int i=a-1;
        int j=b-1;
        while(i>=0 && j>=0){
            if(rowSum[i]<=colSum[j]){
                m[i][j]=rowSum[i];
                colSum[j]-=rowSum[i];
                i--;
            }
            else{
                m[i][j]=colSum[j];
                rowSum[i]-=colSum[j];
                j--;
            }
    }
    return m;
}
}
