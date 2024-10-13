import java.util.Scanner;

public class PrintGrade     {
    public static void main(String[] args) {
        Scanner shub=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=shub.nextInt();

        if(marks>90)
            System.out.println("Excellent marks");
        else if(marks<91&&marks>80)
            System.out.println("Good marks");
        else if(marks<81&&marks>70)
            System.out.println("Fair marks");
        else if(marks<71&&marks>50)
            System.out.println("Meets Expectations");
        else
            System.out.println("Below level marks");


    }
}
