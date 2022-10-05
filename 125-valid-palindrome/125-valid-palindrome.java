class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        System.out.println(a);
        List<Character> list = new ArrayList<>();
        for(int i = 0;i < a.length(); i++){
            if((a.charAt(i) >= 'a' && a.charAt(i)<='z')||a.charAt(i) >= '0' && a.charAt(i)<='9')
                list.add( a.charAt(i));
        }
        for(int i = 0;i<list.size()/2;i++){
             if(list.get(i)!=list.get(list.size()-i-1))
                 return false;
        }
        return true;
    }
}