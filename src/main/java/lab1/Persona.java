/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Liz
 */
public class Persona {
    String nombre;
    String apellido;
    String email;
    String genero;
    String ciudad;
    String fecha_nacimiento;
    int peso;
    String direccion_ip;

    public Persona(String nombre, String apellido, String email, String genero, String ciudad, String fecha_nacimiento, int peso, String direccion_ip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.ciudad = ciudad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.peso = peso;
        this.direccion_ip = direccion_ip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public String getDireccion_ip() {
        return direccion_ip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDireccion_ip(String direccion_ip) {
        this.direccion_ip = direccion_ip;
    }
    
    
}
