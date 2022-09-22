import java.util.*;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int answer = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                if(Math.abs(nums[i]-nums[i+j])==k){
                    answer++;
                }
            }
        }
        return answer;
    }
}