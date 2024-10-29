import java.util.Scanner;

public class LeapYear {public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int n = Scanner.nextInt();
    if((n%4==0 && n%100!=0) || (n%400==0)){
    System.out.println(n+ " Is leap year ");}
    else {
        System.out.println(n+" Is not Leap year");
    }
}
}
