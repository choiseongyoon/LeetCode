import java.util.*;

class Solution {
    public int countPoints(String rings) {
        int answer = 0;
        int[] b_list = new int[10];
        int[] g_list = new int[10];
        int[] r_list = new int[10];
        for(int i=0;i<rings.length()/2;i++){
            if(rings.charAt(2*i)=='R')
            r_list[rings.charAt(2*i+1)-'0']++;
            if(rings.charAt(2*i)=='B')
            b_list[rings.charAt(2*i+1)-'0']++;
            if(rings.charAt(2*i)=='G')
            g_list[rings.charAt(2*i+1)-'0']++;            
        }
        for(int i=0;i<10;i++){
            if(r_list[i]>=1&&g_list[i]>=1&&b_list[i]>=1)
                answer++;
        }
        return answer;
    }
}