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
public class Dia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int semana =1;
       String dia="";
       switch (semana) {
         case 1:
           dia = "Lunes";
           break;
         case 2:
           dia = "Martes";
	   break;
         case 3:
           dia = "Miercoles";
           break;
         case 4:
           dia = "Jueves";
           break;
         case 5:
           dia = "Viernes";
           break;
         case 6:
           dia = "Sabado";
           break;
         case 7:
           dia = "Domingo";
           break;
         default: 
           dia = "Dia no existe";
           break;
      }
      System.out.println(dia);
    }
    
}
