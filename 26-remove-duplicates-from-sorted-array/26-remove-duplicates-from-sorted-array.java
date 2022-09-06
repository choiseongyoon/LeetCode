class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int num=0;
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);
        for(int a : list){
           nums[num]=a; 
            num++;
        }
        return set.size();
    }
}