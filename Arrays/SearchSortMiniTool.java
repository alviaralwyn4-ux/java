/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author alviar
 */
import java.util.Arrays;
import java.util.Scanner;
public class SearchSortMiniTool {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int scores[] = {85, 90, 78, 92, 88, 76, 95, 80};

        System.out.print("Enter target score to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                System.out.println("Score found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Score not found.");
        }

        int sortedScores[] = Arrays.copyOf(scores, scores.length);

        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));

        sc.close();
    }
}
