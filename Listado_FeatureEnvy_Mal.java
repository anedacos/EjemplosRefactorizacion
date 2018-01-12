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
public class Listado {
    public Listado() {
    }
    
    public int contador(ArrayList l){
        int c=0;
        for(int i=0; i<l.size();i++){
            int temp = (int) l.get(i);
            c=c+temp;
        }
        return c;
    }
        
}
