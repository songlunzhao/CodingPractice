import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class FindingUsersActiveMinutesTest_1817 {

    @Test
    public void testFindingUsersActiveMinutes() {
        //Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
        //Output: [0,2,0,0,0]
        int[][]logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int[] output = findingUsersActiveMinutes(logs,5);
        assertEquals(output.length,5);
    }
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //key: user, value: minuteSet
        Map<Integer, Set<Integer>> userCount = new HashMap<>();
        //key: uam, value: uamCount
        Map<Integer, Integer> uamCount = new HashMap<>();
        int[] result = new int[k];


        for(int i=0; i<logs.length; i++){
            Set<Integer> minuteSet;
            if(userCount.containsKey(logs[i][0])){
                minuteSet = userCount.get(logs[i][0]);
            } else {
                minuteSet = new HashSet<>();
                userCount.put(logs[i][0], minuteSet);
            }
            minuteSet.add(logs[i][1]);
        }
        for(Set<Integer> set: userCount.values()){
            int uam = set.size();
            if(uam>k) continue;
            if(uamCount.containsKey(uam)){
                uamCount.put(uam, uamCount.get(uam)+1);
            } else {
                uamCount.put(uam,1);
            }
        }
        for(int i=0;i<k;i++){
            if(uamCount.containsKey(i+1)){
                result[i]=uamCount.get(i+1);
            }
        }

        return result;
    }
}
