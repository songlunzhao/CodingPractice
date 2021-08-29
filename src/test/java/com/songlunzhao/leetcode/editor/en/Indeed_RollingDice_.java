//You are given 6 dices, return the probability of you roll given number



package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Indeed_RollingDice_ {
    @Test
    public void testRRollDice() {
        Indeed_RollingDice_.Solution solution = new Indeed_RollingDice_()
                .new Solution();
        int n=14;
        List<List<Integer>>ans=solution.rollDice(n);
        double total = Math.pow(6,6);
        //PrintUtils.print2DIntegerList(ans);
        System.out.println("the probability of rolling number " + n + " is " +ans.size()/total);

        double maxProbability = 0, maxN=0;
        for(int i=6;i<=36; i++){
            ans=solution.rollDice(i);
            double probability = ans.size()/total;
            System.out.println("the max probability of rolling number " + i +" is " + probability);
            if(probability>maxProbability) {
                maxProbability = probability;
                maxN = i;
            }
        }
        System.out.println("the max probability of rolling number result is " + maxN + " max probability is " + maxProbability);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {


        int ansCount = 0;
        public List<List<Integer>> rollDice(int n) {
            if(n<6 || n>36) return new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            Integer[] dices = new Integer[6];
            for(int i=1; i<=6; i++) {
                dices[0]=i;
                backTrack(n-i, dices, 1, ans);
                dices[0]=0;
            }
            return ans;
        }

        private void backTrack(int target, Integer[] dices, int depth, List<List<Integer>> ans){
            if(target<1||depth>5) return;
            if(depth==5){
                for(int i=1; i<=6; i++) {
                    if(i==target){
                        ansCount++;
                        dices[depth]=i;
                        List<Integer> l = new ArrayList<>(Arrays.asList(dices));
                        ans.add(l);
                        break;
                    }
                }
            } else {
                for(int i=1; i<=6; i++){
                    dices[depth]=i;
                    backTrack(target-i, dices, depth+1, ans);
                    dices[depth]=0;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
