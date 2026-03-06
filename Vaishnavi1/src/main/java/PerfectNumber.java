import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = isPerfectNumber(num);

        if(result){
            System.out.println(num + " is a Perfect Number");
        }else{
            System.out.println(num + " is NOT a Perfect Number");
        }
    }

    static boolean isPerfectNumber(int number){

        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }

        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
}