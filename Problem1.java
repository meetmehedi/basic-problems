import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" ");
        }
    }
}

