/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cajero;
import java.util.Scanner;
public class Cajero
{
    public static void main(String args[] )
    { 
        int balance = 1000, retirar, deposito;
        Scanner e = new Scanner(System.in);
        while(true)
        {
            System.out.println("CAJERO AUTOMATICO ");
            System.out.println("1 RETIRAR");
            System.out.println("2 DEPOSITAR");
            System.out.println("3 REVISAR FONDOS ");
            System.out.println("4 SALIR ");
            System.out.print("SELECCIONE UNA OPCION:");
            int n = e.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("INSERTE DINERO:");
                retirar = e.nextInt();
                if(balance >= retirar)
                {
                    balance = balance - retirar;
                    System.out.println("RETIRAR DINERO");
                }
                else
                {
                    System.out.println("FONDOS INSUFICIENTES");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("INSERTE DINERO PARA DEPOSITAR:");
                deposito = e.nextInt();
                balance = balance + deposito;
                System.out.println("DINERO DEPOSITADO CORRECTAMENTE");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
