/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadiseño;

import java.util.ArrayList;

/**
 *
 * @author Antho
 */
public class Buscador {
    ArrayList numeros=new ArrayList();
    String nombre;
    int contador;
    public Buscador(){        
    }
    public Buscador(String nombre){
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        this.nombre=nombre;
        Listado l=new Listado();
        this.contador=l.contador(numeros);        
    }
    
}
