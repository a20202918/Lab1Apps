/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Factorial {
    int numeroA;
        

    public static void factorial(){
        int i, res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numA = Integer.valueOf(sc.nextLine());
   
        for(i=1; i<=numA; i++){
            res *=i;
        }
        System.out.println("El facotorial de "+numA + " es: "+res);
    }
}
