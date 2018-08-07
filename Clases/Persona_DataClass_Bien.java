/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antho
 */
public class Persona {
    private String nombre, identificacion, genero;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(){
        
    }
    
    public Persona(String nombre, String identificacion, String genero, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.genero = genero;
        this.edad = edad;
    }
    
    private String hablar(){
        return "Hola a todos, como estan";
    }
}
