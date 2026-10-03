/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypesVariables;

/**
 *
 * @author alviar
 */
public class unit_casting_coverter {
    public static void main(String[] args) {
        
        double centimeters = 325.8;
        
        int wholeMeters = (int) (centimeters / 100);
        
        double remainingCentimeters = centimeters - (wholeMeters * 100);
        
        System.out.println("\n--- Unit Conversion ---");
        System.out.println("Whole Meters: " + wholeMeters );
        System.out.printf("Remaining centimeters: %.2f%n", remainingCentimeters);
        
        int number = 25;
        double widenedNumber = number;
        
        System.out.println("\n--- Implicit Widening ---");
        System.out.println("Integer value: " + number);
        System.out.println("Double value: " + widenedNumber);
        
        double decimalNum = 23.32;
        int narrowedNum = (int) decimalNum;
        
        System.out.println("\n--- Explicit Narrowing ---");
        System.out.println("Decimal Number: " + decimalNum);
        System.out.println("Whole Number: " + narrowedNum);
    }
}
