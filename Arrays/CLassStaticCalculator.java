/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author alviar
 */
public class CLassStaticCalculator {
    public static void main(String[] args) {
        int[] grade = {
            85,
            75,
            95,
            88,
            78,
            87,
            98,
            80,
        };
        
        int sum = 0;
        int highest = grade[0];
        int lowest = grade[0];

        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];

            if (grade[i] > highest) {
                highest = grade[i];
            }

            if (grade[i] < lowest) {
                lowest = grade[i];
            }
        }

        double average = (double) sum / grade.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        
    }
}
