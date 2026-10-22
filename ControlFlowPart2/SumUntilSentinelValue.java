/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart2;

/**
 *
 * @author alviar
 */
import java.util.Scanner;
public class SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int total= 0;

        System.out.print("Enter Positive Number: ");
        int number = sc.nextInt();

        while (number != -1) {
            total += number;
            System.out.print("Enter Positive Number: ");
            number = sc.nextInt();
        }

        System.out.println("Number Entered: " + total);
        sc.close();
}
}