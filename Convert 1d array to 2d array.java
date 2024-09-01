class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int Matrix[][]=new int[m][n];
        int nullmatrix[][]=new int[0][0];
        if(original.length!=m*n)
        return nullmatrix;;
        int a=0;
        for (int i=0;i<=m-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                Matrix[i][j]=original[a];
                a++;
            }
        }
        return Matrix;
    }
}
