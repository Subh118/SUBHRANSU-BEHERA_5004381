//Method to Calculate Future Value Using a Recursive Approach
//We'll assume a simplified model where the future value 
//𝐹𝑉
//FV is calculated based on the past value 
//𝑃𝑉
//PV and a constant growth rate 𝑟 over n periods:
//𝐹𝑉(𝑛)=𝑃𝑉×(1+𝑟)𝑛FV(n)=PV×(1+r)n
//For recursion, we can define it as:
//𝐹𝑉(𝑛)=𝑃𝑉×(1+𝑟)×𝐹𝑉(𝑛−1)
//FV(n)=PV×(1+r)×FV(n−1)
//with the base case:
//𝐹𝑉(0)=𝑃 𝑉 FV(0)=PV

package exercise7;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue; // Base case
        }
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // Number of periods (years, for example)

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}

