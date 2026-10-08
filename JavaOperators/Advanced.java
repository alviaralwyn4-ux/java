/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author alviar
 */
public class Advanced {
    public static void main(String[] args) {
        
        double initialbal = 1000;
        
        initialbal += 200;
        System.out.println(initialbal);
        
        initialbal *= 1.25;
        System.out.println(initialbal);
        
        initialbal += 200;
        System.out.println(initialbal);
        
        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("After postfix: " + count);

        System.out.println("Prefix: " + ++count);
        System.out.println("After prefix: " + count);
        
    }
    
}
