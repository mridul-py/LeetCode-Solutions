class Solution {
    public int deleteGreatestValue(int[][] grid) {
       int Sum=0;
       List<PriorityQueue<Integer>> L= new ArrayList<>();
       int m=grid.length; // total number of rows in grid.
    	int n=grid[0].length;
       for (int i=0;i<grid.length;i++)
       {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int j=0;j<grid[i].length;j++)
        {
            p.add(grid[i][j]);
        }
        L.add(p);
       }
       int num=-1;
       for (int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++){
            PriorityQueue<Integer> pq=L.get(j);
            int temp=pq.poll();
            num=Math.max(num,temp);
        }
        Sum+=num;
       }
       return Sum; 
    }
}
