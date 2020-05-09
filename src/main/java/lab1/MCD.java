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
public class MCD {
    public static void Divisor(){
        try{
        int res; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int A = Integer.valueOf(sc.nextLine());
        System.out.println("Ingrese un numero: ");
        int B = Integer.valueOf(sc.nextLine());
        
        int a = Math.max(A,B);
        int b = Math.max(A, B);
        
        do{
            res = b;
            b = a%b;
            a= res;
        }while(b!=0);
        System.out.println("El Maximo comun Divisor de: "+ A + " y "+ B + " es " + res);
        } catch(Exception e){
            System.out.println("Deben de ingresar un numero");
        }
       
        
}
}
