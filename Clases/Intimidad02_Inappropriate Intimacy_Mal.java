package tareadiseño;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antho
 */
public class Intimidad02 {
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Intimidad02(){
        
    }
    
    public String descripcion(){
        Intimidad01 i = new Intimidad01();
        return nombre+" "+i.codigo;
    }
    
}
