import java.util.Scanner;

public class Sum_of_squires {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("The sum of squares from 1^2 to " + n + "^2 is: " + sum);

        scanner.close();
    }}