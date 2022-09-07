class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        
        int car=1;
        for(int i=digits.length-1;i>=0;i--){
            
            if(car+digits[i]>=10){
                list.add(0);
                car =1;
            }
            else{
              list.add(car+digits[i]);
                car=0;
            }
        }
        if(car ==1){
            list.add(1);
        }
        
        Collections.reverse(list);
        int[] result = new int[list.size()];
        int i =0;
        for(int a : list){
            result[i]=a;
            i++;
        }
        return result;
    }
}