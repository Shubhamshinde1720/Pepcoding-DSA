import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=shub.nextInt();

        boolean flag=true;
        for(int i=2;i<n; i++){
            if(n%i==0){
                flag=false;
            }
        }
        System.out.println((flag)?"This is Prime number":"This is NonPrime Number");
    }
}
