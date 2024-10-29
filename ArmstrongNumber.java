import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int temp = n;
        int count = 0;
        int num = n;
        while (num != 0) {
            num /= 10;
            count++;
        }
        int sum = 0;
        num = n;
        while (num > 0) {
            int d = num % 10;
            int mul = 1;
            for (int i = 0; i < count; i++) {
                mul *= d;}
            sum += mul;
            num /= 10;
        }
        if (sum == temp) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }}