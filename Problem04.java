import java.util.Scanner;

public class Problem04  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number N: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        scanner.close();
    }
}
