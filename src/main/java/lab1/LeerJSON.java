/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jndi.toolkit.url.UrlUtil;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liz
 */
public class LeerJSON {
    
         ObjectMapper mapper = new ObjectMapper();
         String Persona[];
            // convert JSON array to list of books
        List<Persona> personas = Arrays.asList(mapper.readValue(Paths.get(this.getClass().getResource("/personas.json")).toFile(), Persona[].class));
            
        public void mostrar(){
            for (int i = 0; i < 11; ++i) System.out.println(Persona[i] + " ");
        }
        
        public void crear(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese nombre");
            String nombre = teclado.nextLine();
            
            Map<String, Object> map = new HashMap<>();
            map.put("nombre", nombre);

            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert map to JSON file
            mapper.writeValue(Paths.get("user.json").toFile(), map);
        }
}
