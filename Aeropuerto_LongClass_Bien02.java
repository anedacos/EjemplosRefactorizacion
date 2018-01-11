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
public class Aeropuerto {
    ArrayList<Avion> aterrizados=null;
    ArrayList<Avion> enVuelo=null;
    ArrayList<Avion> porDespegar=null;
    
    public void aeropuerto(int estado, Avion avion){
        if (estado==0){
            aterrizados.add(avion);
        }
        if (estado==1){
            enVuelo.add(avion);
        }   
        if (estado==2){
            porDespegar.add(avion);
        }
    }
}
