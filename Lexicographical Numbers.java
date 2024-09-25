import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        Vector<String> V= new Vector<>();
        for (int i=1;i<=n;i++)
        V.add(String.valueOf(i));
        Collections.sort(V);
        Vector<Integer> V1= new Vector<>();
        for(int i=0;i<n;i++)
        V1.add(Integer.parseInt(V.get(i)));
        return V1;
    }
}
