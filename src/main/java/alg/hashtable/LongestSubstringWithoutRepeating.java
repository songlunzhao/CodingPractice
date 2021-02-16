package alg.hashtable;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    @Test
    public void test(){
        String s="abcdddefffabcdef";
        lengthOfLongestSubstring(s);

    }
    public int lengthOfLongestSubstring(String s) {

        Set<Character> result = new HashSet<>();
        Set<Character> maxResult = new HashSet<>();
        int ret = 0, i=0, j=0;
        int n=s.length();
        while(i<n&&j<n){
            if(!result.contains(s.charAt(j))) {
                result.add(s.charAt(j));
                j++;
                if(j-i>ret) {
                 ret = j-i;
                 maxResult.clear();
                 maxResult.addAll(result);
                }
            } else {
                result.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println("max len " + ret);
        System.out.println("result " + maxResult.toString());
        return ret;
    }
}