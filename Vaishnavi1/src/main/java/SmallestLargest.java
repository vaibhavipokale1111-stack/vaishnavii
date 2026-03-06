import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");
        int num = sc.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        int smallest = Math.min(Math.min(d1,d2), Math.min(d3,d4));
        int largest = Math.max(Math.max(d1,d2), Math.max(d3,d4));

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);
    }
}
