import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class LongestWordInDictionaryTest_720 {

    @Test
    public void longestWordTest(){
        //Wrong Answer: input:["yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"]
        // Output:"ewqz" Expected:"yodn" stdout:
        String[] words = new String[]{"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
        String ret = longestWord(words);
        assertEquals(ret, "yodn");

        //input:["m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"]
        // Output:"mocha" Expected:"latte" stdout:
        words = new String[]{"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
        ret=longestWord(words);
        assertEquals(ret, "latte");

        //Wrong Answer: input:["k","lg","it","oidd","oid","oiddm","kfk","y","mw","kf","l","o",
        // "mwaqz","oi","ych","m","mwa"]
        // Output:"mwaqz" Expected:"oiddm" stdout:
        words = new String[]{"k","lg","it","oidd","oid","oiddm","kfk","y","mw","kf","l","o","mwaqz","oi","ych","m","mwa"};
        ret=longestWord(words);
        assertEquals(ret, "oiddm");

        //input:["ogz","eyj","e","ey","hmn","v","hm","ogznkb","ogzn","hmnm","eyjuo","vuq","ogznk","og","eyjuoi","d"]
        // Output:"eyjuoi" Expected:"eyj" stdout

        words = new String[]{"ogz","eyj","e","ey","hmn","v","hm","ogznkb","ogzn","hmnm","eyjuo","vuq","ogznk","og","eyjuoi","d"};
        ret=longestWord(words);
        assertEquals(ret, "eyj");

        //["rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"]
        // Output:"racy" Expected:"otif" stdout:
        words = new String[]{"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        ret=longestWord(words);
        assertEquals(ret, "otif");
    }

    public String longestWord(String[] words) {
        Trie trie = new Trie();
        int index = 0;
        for (String word: words) {
            trie.insert(word, ++index); //indexed by 1
        }
        trie.words = words;
        //return trie.dfs();
        return trie.dfsWithQueue();
    }
    class Node {
        char c;
        Map<Character, Node> children = new HashMap();
        int end;
        public Node(char c){
            this.c = c;
        }
    }

    class Trie {
        Node root;
        String[] words;

        public Trie() {
            root = new Node('0');
        }

        public void insert(String word, int index) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                cur.children.putIfAbsent(c, new Node(c));
                cur = cur.children.get(c);
            }
            cur.end = index;
        }

        public String dfs() {
            String ans = "";
            Stack<Node> stack = new Stack();
            stack.push(root);
            while (!stack.empty()) {
                Node node = stack.pop();
                if (node.end > 0 || node == root) {
                    if (node != root) {
                        String word = words[node.end - 1];
                        if (word.length() > ans.length() ||
                                word.length() == ans.length() && word.compareTo(ans) < 0) {
                            ans = word;
                        }
                    }
                    for (Node nei : node.children.values()) {
                        stack.push(nei);
                    }
                }
            }
            return ans;
        }

        public String dfsWithQueue() {
            String ans = "";
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node.end > 0 || node == root) {
                    if (node != root) {
                        String word = words[node.end - 1];
                        if (word.length() > ans.length() ||
                                word.length() == ans.length() && word.compareTo(ans) < 0) {
                            ans = word;
                        }
                    }
                    for (Node nei : node.children.values()) {
                        queue.add(nei);
                    }
                }
            }
            return ans;
        }
    }
}
