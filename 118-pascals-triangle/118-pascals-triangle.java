class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> sum = new ArrayList<>();
        
        if(numRows >= 1){
            list.add(1);
            sum.add(list);
        }
        
        for(int i=2;i<=numRows;i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i-1;j++){
                list.add( sum.get(i-2).get(j)+sum.get(i-2).get(j-1) );
            }
            list.add(1);
            sum.add(list);
        }
         return sum;
    }
   
}