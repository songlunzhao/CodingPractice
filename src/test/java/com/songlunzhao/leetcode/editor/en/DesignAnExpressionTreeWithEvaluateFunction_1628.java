//Given the postfix tokens of an arithmetic expression, build and return the bin
//ary expression tree that represents this expression. 
//
// Postfix notation is a notation for writing arithmetic expressions in which th
//e operands (numbers) appear before their operators. For example, the postfix tok
//ens of the expression 4*(5-(7+2)) are represented in the array postfix = ["4","5
//","7","2","+","-","*"]. 
//
// The class Node is an interface you should use to implement the binary express
//ion tree. The returned tree will be tested using the evaluate function, which is
// supposed to evaluate the tree's value. You should not remove the Node class; ho
//wever, you can modify it as you wish, and you can define other classes to implem
//ent it if needed. 
//
// A binary expression tree is a kind of binary tree used to represent arithmeti
//c expressions. Each node of a binary expression tree has either zero or two chil
//dren. Leaf nodes (nodes with 0 children) correspond to operands (numbers), and i
//nternal nodes (nodes with two children) correspond to the operators '+' (additio
//n), '-' (subtraction), '*' (multiplication), and '/' (division). 
//
// It's guaranteed that no subtree will yield a value that exceeds 109 in absolu
//te value, and all the operations are valid (i.e., no division by zero). 
//
// Follow up: Could you design the expression tree such that it is more modular?
// For example, is your design able to support additional operators without making
// changes to your existing evaluate implementation? 
//
// 
// Example 1: 
//
// 
//
// 
//Input: s = ["3","4","+","2","*","7","/"]
//Output: 2
//Explanation: this expression evaluates to the above binary tree with expressio
//n ((3+4)*2)/7) = 14/7 = 2.
// 
//
// Example 2: 
//
// 
//
// 
//Input: s = ["4","5","2","7","+","-","*"]
//Output: -16
//Explanation: this expression evaluates to the above binary tree with expressio
//n 4*(5-(2+7)) = 4*(-4) = -16.
// 
//
// Example 3: 
//
// 
//Input: s = ["4","2","+","3","5","1","-","*","+"]
//Output: 18
// 
//
// Example 4: 
//
// 
//Input: s = ["100","200","+","2","/","5","*","7","+"]
//Output: 757
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length < 100 
// s.length is odd. 
// s consists of numbers and the characters '+', '-', '*', and '/'. 
// If s[i] is a number, its integer representation is no more than 105. 
// It is guaranteed that s is a valid expression. 
// The absolute value of the result and intermediate values will not exceed 109.
// 
// It is guaranteed that no expression will include division by zero. 
// 
// Related Topics Math Stack Tree Design Binary Tree 
// 👍 152 👎 31


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.Stack;

public class DesignAnExpressionTreeWithEvaluateFunction_1628 {

    
    
    @Test
    public void testDesignAnExpressionTreeWithEvaluateFunction(){
        TreeBuilder solution = new DesignAnExpressionTreeWithEvaluateFunction_1628()
                        .new TreeBuilder();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * This is the interface for the expression tree Node.
 * You should not remove it, and you can define some classes to implement it.
 */

abstract class Node {
    public abstract int evaluate();
    // define your fields here

};


/**
 * This is the TreeBuilder class.
 * You can treat it as the driver code that takes the postinfix input 
 * and returns the expression tree represnting it as a Node.
 */

class TreeBuilder {
    class MyNode extends Node {
        @Override
        public int evaluate() {
            Stack<Integer> stack = new Stack<>();
            int result=0;
            for(String s: postfix){
                if(s.matches("[0-9]+")){
                    stack.push(Integer.valueOf(s));
                } else {
                    int i1=stack.pop();
                    int i2=stack.pop();
                    switch (s){
                        case "+":
                            result=i2+i1;
                            break;
                        case "-":
                            result=i2-i1;
                            break;
                        case "*":
                            result=i2*i1;
                            break;
                        case "/":
                            result=i2/i1;

                    }
                    stack.push(result);
                }
            }
            return result;

        }
        String[] postfix;
        MyNode(String[] postfix) {
            this.postfix=postfix;
        }
    }
    Node buildTree(String[] postfix) {

        MyNode node = new MyNode(postfix);

        return node;
    }
};


/**
 * Your TreeBuilder object will be instantiated and called as such:
 * TreeBuilder obj = new TreeBuilder();
 * Node expTree = obj.buildTree(postfix);
 * int ans = expTree.evaluate();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
