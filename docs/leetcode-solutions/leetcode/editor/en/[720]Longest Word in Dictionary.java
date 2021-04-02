//Given a list of strings words representing an English Dictionary, find the lon
//gest word in words that can be built one character at a time by other words in w
//ords. If there is more than one possible answer, return the longest word with th
//e smallest lexicographical order. If there is no answer, return the empty string
//.
//
// Example 1: 
// 
//Input: 
//words = ["w","wo","wor","worl", "world"]
//Output: "world"
//Explanation: 
//The word "world" can be built one character at a time by "w", "wo", "wor", and
// "worl".
// 
// 
//
// Example 2: 
// 
//Input: 
//words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
//Output: "apple"
//Explanation: 
//Both "apply" and "apple" can be built from other words in the dictionary. Howe
//ver, "apple" is lexicographically smaller than "apply".
// 
// 
//
// Note:
// All the strings in the input will only contain lowercase letters. 
// The length of words will be in the range [1, 1000]. 
// The length of words[i] will be in the range [1, 30]. 
// Related Topics Hash Table Trie 
// 👍 851 👎 1021


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestWord(String[] words) {
        Tri tri = new Tri(words);
        for(int i=0; i<words.length;i++){
            tri.insert(words[i],i);
        }
        //return tri.dfs();
        return tri.dfsWithQueue();
    }

    class Tri {
        TriNode root;
        String [] words;
        Tri(String[] words){
            root = new TriNode('0');
            this.words=words;
        }
        class TriNode{
            int end=-1; //end!=-1 means this is the end of a word in dictionary
            char c;
            Map<Character, TriNode> children = new HashMap<>();
            TriNode(char c){
                this.c = c;
            }
        }

        /**
         *
         * @param word  -- the word in dic
         * @param index -- the index of the work in dic
         */
        void insert(String word, int index) {
            TriNode curr=root;
            for(char c: word.toCharArray()){
                curr.children.putIfAbsent(c, new TriNode(c));
                curr=curr.children.get(c);
            }
            curr.end=index;
        }

        String dfs(){
            String answer="";
            //use either queue or stack is ok.
            //just means for all elements in a leaf,
            // do we want to search from left(queue) or right(stack)

            Stack<TriNode> stack = new Stack();
            stack.push(root);
            for(TriNode n: root.children.values()){
                stack.push(n);
            }
            while(!stack.empty()){
                TriNode node = stack.pop();
                if(node.end>-1) {
                    String word = words[node.end];
                    if(word.length()>answer.length()
                    || word.length()==answer.length() && word.compareTo(answer)<0){
                        answer=word;
                    }
                    for(TriNode n: node.children.values()){
                        stack.push(n);
                    }
                }
            }
            return answer;
        }

        String dfsWithQueue(){
            String answer="";
            //use either queue or stack is ok.
            //just means for all elements in a leaf,
            // do we want to search from left(queue) or stack(queue)

            Queue<TriNode> queue = new LinkedList();
            queue.add(root);
            for(TriNode n: root.children.values()){
                queue.add(n);
            }
            while(!queue.isEmpty()){
                TriNode node = queue.poll();
                if(node.end>-1) {
                    String word = words[node.end];
                    if(word.length()>answer.length()
                            || word.length()==answer.length() && word.compareTo(answer)<0){
                        answer=word;
                    }
                    for(TriNode n: node.children.values()){
                        queue.add(n);
                    }
                }
            }
            return answer;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
