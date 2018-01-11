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
    
    public static void main(String arg[]){
        //Aqui defino a un perro con su sonido y su genero
        Animal a1 = new Animal("guauf" , "m");
        //Aqui defino a un gato con su sonido y su genero
        Animal a2 = new Animal("miau" , "f");
        //Aqui defino a una vaca con su sonido y su genero
        Animal a3 = new Animal("mu" , "m");
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a1.sonido=="guauf") {a1.tipo="Perro"; System.out.println("Es un(a) "+a1.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a1.sonido=="miau") {a1.tipo="Gato"; System.out.println("Es un(a) "+a1.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a1.sonido=="mu") {a1.tipo="Vaca"; System.out.println("Es un(a) "+a1.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a2.sonido=="guauf") {a2.tipo="Perro"; System.out.println("Es un(a) "+a2.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a2.sonido=="miau") {a2.tipo="Gato"; System.out.println("Es un(a) "+a2.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a2.sonido=="mu"){ a2.tipo="Vaca"; System.out.println("Es un(a) "+a2.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a3.sonido=="guauf") {a3.tipo="Perro"; System.out.println("Es un(a) "+a3.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a3.sonido=="miau"){ a3.tipo="Gato"; System.out.println("Es un(a) "+a3.tipo);}
        //Aqui pregunto el sonido que hace este animal y luego lo clasifico, y posteriormente imprimo que es.
        if(a3.sonido=="mu") {a3.tipo="Vaca"; System.out.println("Es un(a) "+a3.tipo);}
        
    }
       
}

