class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int tmp=0;
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)=='('){
                tmp+=1;
                ans=Math.max(ans,tmp);
                }
            else if(s.charAt(i)==')'){
                tmp-=1;
                ans=Math.max(ans,tmp);
                }
        return ans;       
    }
}