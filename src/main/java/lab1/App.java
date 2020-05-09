package lab1;
 
import java.util.Scanner;



public class App {
    public static void main(String[] args) {  
        String menu1;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opción \n 1. Aplicacion de propiedades matematicas \n2. Aplicacion que trabaja con JSON \n");
        menu1 = teclado.nextLine();
        int menu1Int = Integer.parseInt(menu1.trim());
        
        if (menu1Int == 1){
            System.out.println("Seleccione una opción: \n a. Numero primo \n b. Maximo comun divisor \n c. Serie Fibonacci \n d. Factorial \n");
            String menu2 = teclado.nextLine();
            int menu2Int = Integer.parseInt(menu2.trim());
            
            switch(menu2){
                
                case "a":
                    
                break;
                
                case "b":
                    
                break;
            }

        }
        if(menu1Int == 2){
            
            System.out.println("Seleccione una opción: \n a. Listar \n b. Crear \n c. Eliminar \n d. Guardar \n e. Salir");
            String menu2 = teclado.nextLine();
            int menu2Int = Integer.parseInt(menu2.trim());
            
            switch(menu2){
                
                case "a":
                    
                break;
                case "b":
                    
                break;
                case "c":
                    
                break;
                case "d":
                    
                break;
                case "e":
                break;
            }
        }
} 
}
