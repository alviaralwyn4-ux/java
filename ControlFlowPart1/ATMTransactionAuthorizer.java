/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart1;

/**
 *
 * @author alviar
 */
import java.util.Scanner;
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Alwyn";
        String pin = "1234";
        double balance = 25000.00;
        double dailyLimit = 0;
        String tier = "";

        System.out.print("Enter Username: ");
        String enteredUser = sc.nextLine();

        System.out.print("Enter 4 Digit PIN: ");
        String enteredPin = sc.nextLine();

        if (enteredUser.equals(username) && enteredPin.equals(pin)) {

            System.out.println("\nWelcome to National Bank of the Philippines\n");

            if (balance <= 5000) {
                tier = "Bronze Account";
                dailyLimit = 1000;
            } else if (balance <= 10000) {
                tier = "Silver Account";
                dailyLimit = 6000;
            } else if (balance <= 15000) {
                tier = "Gold Account";
                dailyLimit = 9000;
            } else {
                tier = "Platinum Account";
                dailyLimit = 14000;
            }

            System.out.println("Account Tier: " + tier);

            System.out.print("\nWould you like to proceed? Y/N: ");
            char proceed = sc.nextLine().charAt(0);

            if (proceed == 'Y' || proceed == 'y') {

                System.out.printf("Current Balance: %.2f%n", balance);
                System.out.printf("Daily Limit: %.2f%n", dailyLimit);

                System.out.print("\nProceed with withdrawal? Y/N: ");
                char proceed2 = sc.nextLine().charAt(0);

                if (proceed2 == 'Y' || proceed2 == 'y') {

                    System.out.print("Enter Amount: ");
                    double withdraw = sc.nextDouble();
                    sc.nextLine();

                    double feeRate = 0;

                    switch (tier) {
                        case "Bronze Account":
                            feeRate = 0.02;
                            break;

                        case "Silver Account":
                            feeRate = 0.05;
                            break;

                        case "Gold Account":
                            feeRate = 0.08;
                            break;

                        case "Platinum Account":
                            feeRate = 0.10;
                            break;

                        default:
                            System.out.println("DENIED: Invalid account tier.");
                            sc.close();
                            return;
                    }

                    double fee = withdraw * feeRate;
                    double total = withdraw + fee;

                    if (withdraw > 0) {

                        if (total <= dailyLimit) {

                            if (total <= balance) {
                                System.out.println("\nAPPROVED: Withdrawal Successful!");

                                System.out.printf("Withdrawal: %.2f%n", withdraw);
                                System.out.printf("Transaction Fee: %.2f%n", fee);
                                System.out.printf("Total Deduction: %.2f%n", total);

                                balance -= total;

                                System.out.printf(
                                    "Remaining Balance: %.2f%n", balance
                                );

                            } else {
                                System.out.println(
                                    "DENIED: Insufficient balance including transaction fee."
                                );
                            }

                        } else {
                            System.out.println(
                                "DENIED: Daily withdrawal limit exceeded."
                            );
                        }

                    } else {
                        System.out.println(
                            "DENIED: Withdrawal amount must be positive."
                        );
                    }

                } else {
                    System.out.println("Thank you!");
                }

            } else {
                System.out.println("Thank you!");
            }

        } else {
            System.out.println("DENIED: Wrong credentials!");
        }

        sc.close();
    }
}