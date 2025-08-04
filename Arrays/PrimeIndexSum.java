package Arrays;
public class PrimeIndexSum {
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && number != i) {
                return false;
            }
        }
        return true;
    }

    // Function to calculate the sum of values at prime indices
    public static int sumOfPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                sum += input1[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example inputs
        int[] input1 = {1,-2,-3,3,2,-7};
        // write from here 
        int input2 = input1.length;

        
        int sum = sumOfPrimeIndexValues(input1, input2);
        System.out.println("The sum of values at prime indices is: " + sum);
    }
}
