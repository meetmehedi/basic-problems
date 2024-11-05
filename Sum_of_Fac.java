import java.util.Scanner;

public class Sum_of_Fac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }

        System.out.println("The sum of factorials up to " + n + " is: " + sum);
        scanner.close();
    }
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}