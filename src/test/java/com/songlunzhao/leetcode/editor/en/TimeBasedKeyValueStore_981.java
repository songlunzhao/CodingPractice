//Design a time-based key-value data structure that can store multiple values fo
//r the same key at different time stamps and retrieve the key's value at a certai
//n timestamp. 
//
// Implement the TimeMap class: 
//
// 
// TimeMap() Initializes the object of the data structure. 
// void set(String key, String value, int timestamp) Stores the key key with the
// value value at the given time timestamp. 
// String get(String key, int timestamp) Returns a value such that set was calle
//d previously, with timestamp_prev <= timestamp. If there are multiple such value
//s, it returns the value associated with the largest timestamp_prev. If there are
// no values, it returns "". 
// 
//
// 
// Example 1: 
//
// 
//Input
//["TimeMap", "set", "get", "get", "set", "get", "get"]
//[[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4]
//, ["foo", 5]]
//Output
//[null, null, "bar", "bar", null, "bar2", "bar2"]
//
//Explanation
//TimeMap timeMap = new TimeMap();
//timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along wi
//th timestamp = 1.
//timeMap.get("foo", 1);         // return "bar"
//timeMap.get("foo", 3);         // return "bar", since there is no value corres
//ponding to foo at timestamp 3 and timestamp 2, then the only value is at timesta
//mp 1 is "bar".
//timeMap.set("foo", "bar2", 4); // store the key "foo" and value "ba2r" along w
//ith timestamp = 4.
//timeMap.get("foo", 4);         // return "bar2"
//timeMap.get("foo", 5);         // return "bar2"
// 
//
// 
// Constraints: 
//
// 
// 1 <= key.length, value.length <= 100 
// key and value consist of lowercase English letters and digits. 
// 1 <= timestamp <= 107 
// All the timestamps timestamp of set are strictly increasing. 
// At most 2 * 105 calls will be made to set and get. 
// 
// Related Topics Hash Table String Binary Search Design 
// 👍 1415 👎 160


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class TimeBasedKeyValueStore_981 {

    
    
    @Test
    public void testTimeBasedKeyValueStore(){
       Solution solution = new TimeBasedKeyValueStore_981()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class TimeMap {

    /** Initialize your data structure here. */
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        
    }
    
    public String get(String key, int timestamp) {
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
