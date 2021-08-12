//We are given some website visits:
// the user with name username[i] visited the
// website website[i] at time timestamp[i].
//
// A 3-sequence is a list of websites of length 3 sorted in ascending order by
// the time of their visits. (The websites in a 3-sequence are not necessarily
// distinct.)
//
// Find the 3-sequence visited by the largest number of users. If there is more 
//than one solution, return the lexicographically smallest such 3-sequence. 
//
// 
//
// Example 1: 
//
// 
//Input: username = ["joe","joe","joe","james","james","james","james","mary","m
//ary","mary"], timestamp = [1,2,3,4,5,6,7,8,9,10], website = ["home","about","car
//eer","home","cart","maps","home","home","about","career"]
//Output: ["home","about","career"]
//Explanation: 
//The tuples in this example are:
//["joe", 1, "home"]
//["joe", 2, "about"]
//["joe", 3, "career"]
//["james", 4, "home"]
//["james", 5, "cart"]
//["james", 6, "maps"]
//["james", 7, "home"]
//["mary", 8, "home"]
//["mary", 9, "about"]
//["mary", 10, "career"]
//The 3-sequence ("home", "about", "career") was visited at least once by 2 user
//s.
//The 3-sequence ("home", "cart", "maps") was visited at least once by 1 user.
//The 3-sequence ("home", "cart", "home") was visited at least once by 1 user.
//The 3-sequence ("home", "maps", "home") was visited at least once by 1 user.
//The 3-sequence ("cart", "maps", "home") was visited at least once by 1 user.
// 
//
// 
//
// Note: 
//
// 
// 3 <= N = username.length = timestamp.length = website.length <= 50 
// 1 <= username[i].length <= 10 
// 0 <= timestamp[i] <= 10^9 
// 1 <= website[i].length <= 10 
// Both username[i] and website[i] contain only lowercase characters. 
// It is guaranteed that there is at least one user who visited at least 3 websi
//tes. 
// No user visits two websites at the same time. 
// 
// Related Topics Array Hash Table Sorting 
// 👍 209 👎 1912


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class AnalyzeUserWebsiteVisitPattern_1152 {

    
    
    @Test
    public void testAnalyzeUserWebsiteVisitPattern(){
       Solution solution = new AnalyzeUserWebsiteVisitPattern_1152()
                        .new Solution();
       String[] username = new String[] {"ua","ua","ua","ub","ub","ub"};
       int[] timestamp = new int[]{1,2,3,4,5,6};
       String[] website = new String[]{"a","b","a","a","b","c"};
       List<String> ans = solution.mostVisitedPattern(username,timestamp,website);
        PrintUtils.printStringList(ans);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        class Tuple implements Comparable {
            String userName;
            int timestamp;
            String website;
            public Tuple(String username, int timestamp, String website){
                this.userName=username;
                this.timestamp=timestamp;
                this.website=website;
            }


            @Override
            public int compareTo(Object o) {
                return this.timestamp<((Tuple)o).timestamp?-1:1;
//                return this.website.compareTo(((Tuple)o).website);
            }
        }
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        Map<String, List<Tuple>> userVisitedWebs = new HashMap<>();
        Map<String, Set<String>> siteUsers = new HashMap<>();
        Tuple[] tuples = new Tuple[username.length];
        for(int i=0; i< username.length; i++){
            tuples[i]=new Tuple(username[i], timestamp[i], website[i]);
        }
        Arrays.sort(tuples);
        for(int i=0; i< username.length; i++){
            if(userVisitedWebs.containsKey(tuples[i].userName)){
                userVisitedWebs.get(tuples[i].userName).add(tuples[i]);
            } else {
                List<Tuple> tupleList = new ArrayList<>();
                tupleList.add(tuples[i]);
                userVisitedWebs.put(tuples[i].userName, tupleList);
            }
        }

        for(Map.Entry<String, List<Tuple>> entry: userVisitedWebs.entrySet()){
           addEntry(entry, siteUsers);
        }

        int maxUserVisited = 0;
        String mostVisited="";
        for(Map.Entry<String, Set<String>> entry: siteUsers.entrySet()){
            if(entry.getValue().size()>maxUserVisited
            ||(entry.getValue().size()==maxUserVisited
                    && mostVisited.compareTo(entry.getKey())>0)){
                maxUserVisited = entry.getValue().size();
                mostVisited=entry.getKey();
            }
        }
        String[] ans = mostVisited.substring(1).split("\\|");

        return Arrays.asList(ans);
    }

    private void addEntry(Map.Entry<String, List<Tuple>> entry, Map<String, Set<String>> siteUsers) {
        int i=0;
        int size = entry.getValue().size();
        while(i+2<size){
            String sites="";
            for(int j=0; j<3; j++){
                sites=sites+"|"+entry.getValue().get(i+j).website;
            }
            if(siteUsers.containsKey(sites)){
                siteUsers.get(sites).add(entry.getKey());
            } else {
                Set<String> userSets = new HashSet<>();
                userSets.add(entry.getKey());
                siteUsers.put(sites, userSets);
            }
            i++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
