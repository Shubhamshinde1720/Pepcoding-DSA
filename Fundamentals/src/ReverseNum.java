import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=shub.nextInt();


        while(n>0){
            int d=n%10;
            System.out.print(d);
            n/=10;
        }
    }
}
