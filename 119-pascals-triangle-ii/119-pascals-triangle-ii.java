class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> sum = new ArrayList<>();
        
        if(rowIndex>=0){
            list.add(1);
            sum.add(list);
        }
        for(int i=1;i<=rowIndex;i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add( sum.get(i-1).get(j)+sum.get(i-1).get(j-1) );
            }
            list.add(1);
            sum.add(list);
        }
            
        return sum.get(rowIndex);
        
    }
}