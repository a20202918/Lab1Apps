/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Fibonacci {
    
   public void numerosFibonacci(){
    
    System.out.print("Ingrese número de términos: ");
    Scanner sc = new Scanner(System.in);
    int n = Integer.valueOf(sc.nextLine());
    
    int a = 0;
    int b = 1;
    int c = 1;
    
    int i = 1;
    
    
        while(i <= n){
           System.out.print(c + " ");
           a = b;
           b = c;
           c = a+ b;
           i++;
          
           
        }
    
    }   
    
}
