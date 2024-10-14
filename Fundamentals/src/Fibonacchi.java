import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("enter you want length of fibonacchi...");
        int n=shub.nextInt();

        int a=0;
        int b=1;

        for(int i=0;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;


        }
    }
}
