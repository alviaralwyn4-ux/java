/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart2;

/**
 *
 * @author alviar
 */
public class NumbersAndSquarePrinter {
    public static void main(String[] args) {
        
        
        for (int i = 1; i<=10; i++ ){
            int square = i*i;
            
            System.out.println("Number: " + i + "| " + "Square: " + square);
        }
        
        System.out.println("\n20 Numbers");
        for (int i = 1; i<=20; i++ ){
            int square = i*i;
            
            System.out.println("Number: " + i + "| " + "Square: " + square);
        }
        
    }
}
