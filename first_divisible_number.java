import java.util.Scanner;

public class first_divisible_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n (end of range): ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of d (divisor): ");
        int d = scanner.nextInt();


        int result = findFirstDivisible(n, d);
        if (result != -1) {
            System.out.println("The first number in the range [1, " + n + "] divisible by " + d + " is: " + result);
        } else {
            System.out.println("There is no number in the range [1, " + n + "] divisible by " + d);
        }

        scanner.close();
    }

    public static int findFirstDivisible(int n, int d) {
        // Iterate through each number in the range from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is divisible by the divisor
            if (i % d == 0) {
                
                return i;
            }
        }

        return -1;
    }
}


