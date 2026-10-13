/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart1;

/**
 *
 * @author alviar
 */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        
        double purchaseAmount = 2500.00;
        double discount;
        String tier;
        
        if (purchaseAmount < 500){
            discount = 0;
            tier = "0% Discount";
        }
        else if (purchaseAmount < 1000){
            discount = 0.05;
            tier = "5% Discount";
        }
        else if (purchaseAmount < 1500){
            discount = 0.10;
            tier = "10% Discount";
        }
        else{
            discount = 0.15;
            tier = "15% Discount";
        }
        
        double finaltotal = purchaseAmount - (purchaseAmount*discount);
        
        System.out.println("Discount Tier: " + tier);
        System.out.println("Discounted Total: " + finaltotal);
    }
}
