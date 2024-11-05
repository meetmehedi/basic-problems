import java.util.Scanner;
public class Sum_of_Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, i);
        }
        System.out.println("The sum of the series from 1^1 to " + n + "^" + n + " is: " + sum);
        scanner.close();
    }}