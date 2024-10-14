import java.util.*;
import java.lang.*;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        int low=shub.nextInt();
        int high=shub.nextInt();

        while(low++<=high){
            if(isPrime(low)){
                System.out.println(low);
            }
        }
    }

    static boolean isPrime(int n){
        boolean flag=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
