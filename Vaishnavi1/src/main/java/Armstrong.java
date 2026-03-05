import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter Your no:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int sum=0;

        while (num>0){
            int remindr = num%10;
            sum = sum+(remindr*remindr*remindr);
            num= num/10;
        }
        if(sum==original){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a armstrong");
        }


    }
}

