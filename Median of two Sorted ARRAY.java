import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> L= new ArrayList<>();
        for (int i: nums1){
            L.add(i);
        }
        for (int j:nums2){
            L.add(j);
        }
        Collections.sort(L);
        int L1=L.size();
        if(L1%2==0){
            return (L.get(L1/2 -1)+ L.get(L1/2))/2.0;
        }
        else{
            return (float)L.get(L1/2);
        }
    }
}
