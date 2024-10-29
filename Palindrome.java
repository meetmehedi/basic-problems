import java.util.Scanner;
public class Palindrome { public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int n = Scanner.nextInt();
    int d;
    int p=n;
    int rev=0;
    while(n!=0){
        d=n%10;
        rev=rev*10 +d;
        n/=10;}
        if(p==rev){
            System.out.println(p + " Is a Palindrome");
        } else{
            System.out.println(p + " Is not a Palindrome");
        }
    }
}

