/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author alviar
 */
public class Intermediate {
    public static void main(String[] args) {
        
        int grade = 90;
        int absences = 4;
        
        boolean passed = ((grade >= 75 && absences <= 3)|| grade >= 90);
        
        if (passed) {
        System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}

    

