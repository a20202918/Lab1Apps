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

/**
 *
 * @author Liz
 */
public class LeerJSON {
        try{
            ObjectMapper mapper = new ObjectMapper();
            LeerJSON persona;
            persona = ObjectMapper.readValue(Paths.get(this.getClass().getResource("/personas.json").getFile()), LeerJSON.class);
            
            System.out.println(persona);
        }

        catch (Exception ex) {
        ex.printStackTrace();
        }
