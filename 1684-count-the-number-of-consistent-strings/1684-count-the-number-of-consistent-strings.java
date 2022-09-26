class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(String w : words){
            int cnt=0;
            for(int j = 0; j < w.length();j++){
                if(!allowed.contains(String.valueOf(w.charAt(j)))){
                    break;
                }
                cnt++;
            }
            if(cnt ==w.length())
            ans++;
        }
        return ans;
    }
}