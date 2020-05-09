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
public class NumeroPrimo {
   
    
    public void validarPrimo(){
         
        System.out.println("Ingrese número: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        
        int prim = num;
        int div = 0;
        
        while(prim > 0){
            
            if(num%prim == 0)div++;
            prim--;
            
        }
       
        if (div == 2) System.out.println("El "+ num +"si es primo");
        else System.out.println("El "+ num +"no es primo");
        
        
    }
    
}
