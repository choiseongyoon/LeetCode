class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int k=nums.length-1;k>=i+2;k--){
                for(int j=i+1;j<k;j++){                    
                if((nums[j]-nums[i] == diff)&&(nums[k]-nums[j] == diff))
                    answer++;
                    
                }
                
            }
        }
        return answer;
    }
}