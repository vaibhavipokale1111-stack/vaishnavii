import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter your num:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int a=0, b=1;

        while (a<=num){
            System.out.println(a +" ");
            int c= a+b;
            a=b;
            b=c;
        }

    }
}

