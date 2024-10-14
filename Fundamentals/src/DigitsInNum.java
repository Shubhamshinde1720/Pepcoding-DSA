import java.util.Scanner;

public class DigitsInNum {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=shub.nextInt();
        int temp=reverse(n);



        while(temp>0){
            int d=temp%10;
            System.out.println(d);
            temp/=10;
        }


    }


    static int reverse(int n){
        int rev=0;

        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }

        return rev;
    }
}
