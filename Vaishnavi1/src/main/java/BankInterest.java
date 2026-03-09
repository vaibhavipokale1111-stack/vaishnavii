import java.util.Scanner;

public class BankInterest {

    static double calculateInterest(double principal, int year, double rate) {
        return (principal * rate * year) / 100;
    }


    static double calculateTax(double interest) {
        return interest * 0.10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Years: ");
        int year = sc.nextInt();

        double rate;

        if (principal <= 50000) {
            rate = 10;
        }
        else if (principal <= 100000) {
            rate = 12;
        }
        else {
            rate = 15;
        }

        double interest = calculateInterest(principal, year, rate);

        double tax = calculateTax(interest);

        double finalInterest = interest - tax;

        double totalAmount = principal + finalInterest;

        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Interest Earned: " + interest);
        System.out.println("Tax Deducted (10%): " + tax);
        System.out.println("Interest After Tax: " + finalInterest);
        System.out.println("Total Amount Given to User: " + totalAmount);

        sc.close();
    }
}
