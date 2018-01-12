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
    public String nombre, identificacion, genero;
    public int edad;

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
