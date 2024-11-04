import java.util.Scanner;

public class Problem05 {

public static void main (String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int number = input.nextInt();
    {
        if (number == 0) {
            System.out.println(number + " It's Zero.");
        } else if (number<=0){
            System.out.println(number + " It's Negative");
        }
        else {
            System.out.println(number + " It's Positive");
        }
    }
    input.close();
}

}
