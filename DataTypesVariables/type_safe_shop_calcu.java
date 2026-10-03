/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypesVariables;

/**
 *
 * @author alviar
 */
public class type_safe_shop_calcu {
    public static void main(String[] args) {
        int quantity = 5;
        double unitprice = 120.00 , total;
        String name = "Shoppesmart";
        
        total = unitprice * quantity;
        
        System.out.println("===" + name + "===");
        System.out.println("\nQuantity: " + quantity);
        System.out.println("Unit Price: " + unitprice);
        System.out.println("Total: " + total);
        
        
    }
}
