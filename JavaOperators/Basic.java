/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author alviar
 */
public class Basic {
    public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 5;
        
        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1/num2;
        int remainder = num1 % num2;
       
        System.out.println("Total: " + plus);
        System.out.println("Total: " + minus);
        System.out.println("Total: " + multiply);
        System.out.println("Total: " + divide);
        System.out.println("Total: " + remainder);
        
        /* Division and remainder behave differently with negative operands. */
    }
}
