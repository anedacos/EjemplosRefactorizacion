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
public class Perro extends Persona{

    public Perro() {
    }

    public Perro(String nombre, String genero, int edad) {
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;        
    }
    
    private String ladrar(){
        return "guauf";
    }
    
}
