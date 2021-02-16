package alg.dp;


import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer, Integer> fibMap = new HashMap<>();

    @Test
    public void testFib() {
        System.out.println("fibonacci 10 = " + fibRecursive(10));
        System.out.println("fibonacci 10 = " + dpMemorizeFib(10));
    }

    /**
     * T(n) = T(n-1) + T(n-2) + Const(1).
     * BigO  O(2exp(n/2))
     *
     * @param n
     * @return
     */
    private int fibRecursive(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    /**
     * Memorized DP algorithm
     * fib(n) -
     * if n in memo: return memo[n]
     * if n<=2: f=1
     * else: f=fib(n-1)+fib(n-2)
     * return f
     * <p>
     * time=#subproblems * time/subproblem (here time/subproblem = const(1))
     * BigO O(n) -- best is O(log(n))
     *
     * @param n
     * @return
     */
    private int dpMemorizeFib(int n) {
        if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        }
        if (n == 1 || n == 2) {
            fibMap.put(n, 1);
        } else {
            fibMap.put(n, dpMemorizeFib(n - 1) + dpMemorizeFib(n - 2));
        }
        return fibMap.get(n);
    }
}
