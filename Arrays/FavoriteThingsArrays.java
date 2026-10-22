/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author alviar
 */
public class FavoriteThingsArrays {
    public static void main(String[] args) {
        String [] fav = {
            "gaming",
            "Music",
            "Food",
            "basketball",
            "Guitar",
        };
        System.out.println("My Favorite Things");
        
        for (int i = 0; i < fav.length; i++) {
            System.out.println((i + 1) + ". " + fav[i]);
        }
        System.out.println("Total number of Favorite Things: " + fav.length);
    }
}
