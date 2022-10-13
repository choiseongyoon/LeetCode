import java.util.*;

class Solution {
    public int maxProductDifference(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        Collections.sort(list);
        int n = list.size();
        return list.get(n-1)*list.get(n-2) - list.get(0)*list.get(1);
        
    }
}