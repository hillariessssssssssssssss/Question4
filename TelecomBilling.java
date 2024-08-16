/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.examqn4;

/**
 *
 * @author HILARY UGO453
 */
public class TelecomBilling {
    public static void main(String[] args) {
        double initialBalance = 10000.0; 
        double airtimeCharge = initialBalance * 0.10;
        double balanceAfterAirtimeCharge = initialBalance - airtimeCharge;

        int callDuration = 5 * 60;
        double callChargePerSecond = 200.0;
        double totalCallCharge = callDuration * callChargePerSecond;

        double finalBalance = balanceAfterAirtimeCharge - totalCallCharge;

        System.out.println("Final balance after call: UGX " + finalBalance);
    }
}