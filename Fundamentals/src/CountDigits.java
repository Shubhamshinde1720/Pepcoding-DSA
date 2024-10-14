import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=shub.nextLong();

        long count=0;
        while(n!=0){
            long d=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
