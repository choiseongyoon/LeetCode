class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
        String[] list = new String[names.length];
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        
        int i=0;
        Iterator<Integer> keys = map.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            list[i]=map.get(key);
            i++;
       }
        return list;
        
    }
}