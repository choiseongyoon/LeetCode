class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        if(nums[nums.length-1]<target)
            a = nums.length;
        if(nums[0]>target)
            a = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target)
                return i;
            if(nums[i]<target&&nums[i+1]>=target)
                return i+1;
        }
        return a;
    }
}