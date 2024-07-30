//Time Complexity of Recursive Algorithm
//Time Complexity: The recursive algorithm has a time complexity of 𝑂(𝑛)O(n), where 𝑛
// is the number of periods. This is because each recursive call reduces the number of periods by 1 
//until it reaches 0.
//Space Complexity: The space complexity is also 
//𝑂(𝑛)O(n) due to the call stack used by recursion.
//Optimizing the Recursive Solution
//Memoization: To avoid excessive computation and redundant calculations, we can use memoization to 
//store previously computed results.
//Iterative Approach: Alternatively, we can convert the recursive algorithm to an iterative one, 
//which uses a loop instead of recursion and generally has better space efficiency.


package exercise7;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingO {
    

    // Memoized recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods, Map<Integer, Double> memo) {
        if (periods == 0) {
            return presentValue; // Base case
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods); // Return memoized result
        }
        double futureValue = (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1, memo);
        memo.put(periods, futureValue); // Store result in memo
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // Number of periods (years, for example)

        Map<Integer, Double> memo = new HashMap<>();
        double futureValue = calculateFutureValue(presentValue, growthRate, periods, memo);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}
