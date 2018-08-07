/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñodesoftware;

/**
 *
 * @author Administrador
 */
public class Perro{
    String nombre, genero;
    int edad;
    
    public Perro() {
    }

    public Perro(String nombre, String genero, int edad) {
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    private String ladrar(){
        return "guauf";
    }
    
}
