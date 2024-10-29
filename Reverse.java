import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int n = Scanner.nextInt();
    int count =0,d;
    int rev=0;
    while(n!=0){
        d=n%10;
        n=n/10;
        rev=rev*10 +d;
    }
    System.out.println("Reverse Number: "+rev);
    }
}