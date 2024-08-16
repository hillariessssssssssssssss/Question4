/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.examqn4;

/**
 *
 * @author HILARY UGO453
 */
public class Examqn4 {
    public static void main(String[] args) {
        double porridge = 2.0;
        double milk = 2.0;
        double cupSize = 0.5;
        int porridgeInterval = 45; 
        int milkInterval = 30; 

        int totalTime = 0;

        while (porridge > 0 || milk > 0) {
            if (porridge > 0) {
                porridge -= cupSize;
                totalTime += porridgeInterval;
            }
            if (milk > 0) {
                milk -= cupSize;
                totalTime += milkInterval;
            }
        }

        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
}


