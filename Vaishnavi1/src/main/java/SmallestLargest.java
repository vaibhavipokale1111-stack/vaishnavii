import java.util.Scanner;
import java.util.Arrays;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int num = sc.nextInt();

        int[] digits = new int[4];

       
        for(int i=3; i>=0; i--){
            digits[i] = num % 10;
            num = num / 10;
        }


        Arrays.sort(digits);

        int smallest = 0;
        int largest = 0;


        for(int i=0; i<4; i++){
            smallest = smallest * 10 + digits[i];
        }


        for(int i=3; i>=0; i--){
            largest = largest * 10 + digits[i];
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}