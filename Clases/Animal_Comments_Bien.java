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
public class Animal {
    public String tipo, sonido, genero;
    public Animal(){        
    }

    public Animal(String sonido, String genero) {
        this.tipo = "";
        this.sonido = sonido;
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    public static void queAnimalEs(Animal a){
        if(a.sonido=="guauf") {a.tipo="Perro"; System.out.println("Es un(a) "+a.tipo);}        
        if(a.sonido=="miau") {a.tipo="Gato"; System.out.println("Es un(a) "+a.tipo);}        
        if(a.sonido=="mu") {a.tipo="Vaca"; System.out.println("Es un(a) "+a.tipo);}
    }
    
    public static void main(String arg[]){        
        Animal a1 = new Animal("guauf" , "m");        
        Animal a2 = new Animal("miau" , "f");       
        Animal a3 = new Animal("mu" , "m");        
        queAnimalEs(a1);
        queAnimalEs(a2);
        queAnimalEs(a3);
    }
       
}

