class Solution {
    public String truncateSentence(String s, int k) {
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(list[0]);
        for(int i=1;i<k;i++){
            sb.append(" "+list[i]);
        }
        return sb.toString();
        
    }
}