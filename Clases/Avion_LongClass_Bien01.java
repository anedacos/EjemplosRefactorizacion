/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadiseño;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antho
 */
public class Avion {
    String aerolinea="";
    String tipo="";
    int estado=0;
    
    public Avion(){
        
    }
    
    public Avion(String aerolinea, String tipo, int estado){
        this.aerolinea=aerolinea;
        this.tipo=tipo;
        this.estado=estado;
    }      
}
