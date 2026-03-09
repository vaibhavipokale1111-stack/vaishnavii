import java.util.Scanner;
import java.util.Random;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        double balance = 1000 + r.nextInt(90000) + r.nextDouble();

        System.out.println("Insert Debit Card");

        System.out.println("Select Service");
        System.out.println("1. Withdrawal");
        System.out.println("2. Account Balance");
        System.out.println("3. Cancel");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Enter 4 digit PIN:");
            int pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("Invalid PIN. PIN must be 4 digits.");
            }
            else {

                System.out.println("Enter Amount:");
                int amount = sc.nextInt();

                if (amount >= 10000 || amount % 1000 != 0) {
                    System.out.println("Invalid Amount. Amount must be less than 10000 and multiple of 1000.");
                }
                else if (amount > balance) {
                    System.out.println("Insufficient Balance.");
                }
                else {

                    balance = balance - amount;

                    System.out.println("Please collect your cash: " + amount);
                    System.out.println("Remaining Balance: " + balance);
                }
            }

        }
        else if (choice == 2) {

            System.out.println("Enter 4 digit PIN:");
            int pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("Invalid PIN. PIN must be 4 digits.");
            }
            else {
                System.out.println("Your Account Balance is: " + balance);
            }

        }
        else if (choice == 3) {
            System.out.println("Transaction Cancelled. Thank you!");
        }
        else {
            System.out.println("Invalid Option");
        }


    }
}