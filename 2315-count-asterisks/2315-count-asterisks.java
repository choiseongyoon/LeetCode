class Solution {
    public int countAsterisks(String s) {
        int answer = 0, bar = 0;
        for(char c : s.toCharArray()){
            if(c=='|'){
                bar += 1;
            }
        
            else if(c == '*' && bar%2 == 0){
                answer += 1;
            }
        }
        return answer;
        
    }
}