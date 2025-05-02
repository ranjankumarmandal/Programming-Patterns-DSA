import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int count = 0;

        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     for(int j = i + 1; j < s.length(); j++) {
        //         char temp = s.charAt(j);
        //         if(ch == temp) {
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // ===============

        // HashSet<Character> set = new HashSet<>();

        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     set.add(ch);
        // }

        // return set.size();


        // return count;
        // ===========================
        

        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
    }
}
