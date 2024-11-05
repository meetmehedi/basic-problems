import java.util.Scanner;

public class Sum_of_Series_With_Increasing_Powers_and_Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        float a = scanner.nextFloat();
        float sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += Math.pow(i, i) / i;
        }
        System.out.println("The sum of the series is: " + sum);
        scanner.close();
    }
}