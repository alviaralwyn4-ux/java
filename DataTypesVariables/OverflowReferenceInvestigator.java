/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypesVariables;

/**
 *
 * @author alviar
 */
public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        
        byte number = 127;
        number++;
        
        System.out.println(number);
        System.out.println("\n===============");
        
        String name1 = new String ("Alwyn");
        String name2 = new String ("Alwyn");
        String name3 = "Alwyn"; 
        
        System.out.println(name1 == name2); /*Compares two variable refer to the same object*/
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);
        System.out.println(name1.equals(name2)); /*compares the text inside the strings.*/
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name3));
        System.out.println("===============");
        
        String [] cars ={"Tuyuta", "Hunda", "Misyubibi"};
        String [] cars2 = cars;
        
        System.out.println("\nBefore modification");
        System.out.println("Cars[1]: " + cars[1]);
        System.out.println("Cars2[1]: " + cars2[1]);
        
        cars2 [1] = "Purd";
        System.out.println("\nAfter Modification");
        System.out.println("Cars[1]: " + cars[1]);
        System.out.println("Cars2[1]: " + cars2[1]);
        
       
    }
}
