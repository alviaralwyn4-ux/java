/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author alviar
 */
public class Expert {
    public static void main(String[] args) {
        
        
        // Expression 1
        int a = 5;
        int b = 3;

        // PREDICTED RESULT: false
        System.out.println((a++ + 2 > b * 2) && (++b > 4));


        // Expression 2
        int x = 4;

        // PREDICTED RESULT: true
        System.out.println((++x * 2 == 12) || (x-- > 4 && x + 1 == 5));


        // Expression 3
        int p = 7;
        int q = 2;

        // PREDICTED RESULT: true
        System.out.println((p-- - q * 2 >= 3) && (++q < p));
        
    }
    
}
