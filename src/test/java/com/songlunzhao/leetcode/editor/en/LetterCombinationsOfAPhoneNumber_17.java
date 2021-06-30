//Given a string containing digits from 2-9 inclusive,
// return all possible lette
//r combinations that the number could represent. Return the answer in any order. 
//
//
// A mapping of digit to letters (just like on the telephone buttons) is given b
//elow. Note that 1 does not map to any letters. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// Example 2: 
//
// 
//Input: digits = "" 
//Output: []
// 
//
// Example 3: 
//
// 
//Input: digits = "2"
//Output: ["a","b","c"]
// 
//
// 
// Constraints: 
//
// 
// 0 <= digits.length <= 4 
// digits[i] is a digit in the range ['2', '9']. 
// 
// Related Topics Hash Table String Backtracking 
// 👍 6460 👎 543


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber_17 {

    
    
    @Test
    public void testLetterCombinationsOfAPhoneNumber(){
       Solution solution = new LetterCombinationsOfAPhoneNumber_17()
                        .new Solution();
       List<String> ans = solution.letterCombinations("23");
        System.out.println(Arrays.toString(ans.toArray()));

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public List<String> letterCombinations(String digits) {
            Map<String, String> dict = Map.of("2", "abc",
                    "3", "def",
                    "4", "ghi",
                    "5","jkl",
                    "6","mno",
                    "7","pqrs",
                    "8","tuv",
                    "9","wxyz");
            List<String> ans = new ArrayList<>();
            backtrack(dict, "", digits, 0, ans);

            return ans;
        }

        void backtrack(Map<String, String> dict, String combination,
                       String digits, int digitIndex, List<String> ans) {
            if(digitIndex==digits.length()){
                if(!combination.toString().equals("")){
                    ans.add(combination.toString());
                }
                return;
            }
            String letters = dict.get(String.valueOf(digits.charAt(digitIndex)));

            for(int i=0; i<letters.length();i++){
                backtrack(dict, combination + letters.charAt(i), digits,digitIndex+1, ans );
                //the last letter has been in answer, should not be in the next answer again.
                // in another word, when DFS go up, we should delete the the latest previously used letter
                // this is because we are using String buffer
                //combination.deleteCharAt(combination.length()-1);
            }
        }
//    public List<String> letterCombinations(String digits) {
//        Map<String, List<String>> digitLetterMap = new HashMap<>();
//        digitLetterMap.put("2", Arrays.asList("a", "b", "c"));
//        digitLetterMap.put("3", Arrays.asList("d", "e", "f"));
//        digitLetterMap.put("4", Arrays.asList("g", "h", "i"));
//        digitLetterMap.put("5", Arrays.asList("j", "k", "l"));
//        digitLetterMap.put("6", Arrays.asList("m", "n", "o"));
//        digitLetterMap.put("7", Arrays.asList("p", "q", "r", "s"));
//        digitLetterMap.put("8", Arrays.asList("t", "u", "v"));
//        digitLetterMap.put("9", Arrays.asList("w", "x", "y","z"));
//
//        Set<String> preSet = new HashSet<>();
//        for(int i=0; i<digits.length(); i++) {
//            List<String> letters = digitLetterMap.get(String.valueOf(digits.charAt(i)));
//            Set<String> tmp = new HashSet<>();
//            for(int j=0; j<letters.size();j++) {
//                if(i==0) {
//                    tmp.add(letters.get(j));
//                } else {
//                    for(String s: preSet){
//                        tmp.add(s+letters.get(j));
//                    }
//                }
//            }
//            preSet = tmp;
//
//        }
//        List<String> ans = new ArrayList<>(preSet);
//        Collections.sort(ans);
//        return ans;
//
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
