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
public class NestedLoginValidator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String username = "Chinny";
        String password = "chinnylovewynwyn";
        boolean accountlock = true;
        
        System.out.println("Enter Username: ");
        String entereduser = sc.nextLine();
        
        if (entereduser.equals(username)) {
            
            System.out.println("Enter Password: ");
            String enteredpass = sc.nextLine();
            
            if (enteredpass.equals(password)) {
                
            if (!accountlock) {
                System.out.println("Login Successful!");
            }else {
                System.out.println("Account Locked!");
            }
            }else{
            System.out.println("Login Failed: Incorrect Password!");    
            }
        }
        else{
                System.out.println("Log in Failed!: Username is incorrect!");
            }
        
        sc.close();
    }
}
