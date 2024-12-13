class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1; 
        }
        int[] trustCounts = new int[n + 1];
        for (int[] edge : trust) {
            trustCounts[edge[0]]--;
            trustCounts[edge[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == n - 1) { 
                return i;
            }
        }
        return -1; 
    }
}
