/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart2;

/**
 *
 * @author alviar
 */
import java.util.Scanner;
public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++) {

            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= size; col++) {

                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
        
}

