import java.util.*;

public class SumMultiples {
    // My original solution
    public int sumOfMultiples(int in) {
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = i + 1;
        }

        int sum = 0;

        for (int num: list) {
            if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    // Optimal Solution
    // Space Complexity = O(n)
    // Time Complexity = O(n)
    public int sumOfMultiples(int in) {
        // No need for an array. This will provide better space complexity.
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                ans += i;
            }
        }
        return ans;
    }
}