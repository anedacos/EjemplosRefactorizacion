/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Modelo.Usuario;
import Modelo.Evento;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class MenuProveedor {
    public static Scanner sc = new Scanner(System.in);
    
    //METODO DE MENU PARA PROVEEDORES
    public static int mostrarMenuProveedor(){
        System.out.println("1. Consultar eventos disponibles");
        System.out.println("2. Consultar eventos anteriores");
        System.out.println("3. Crear evento");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la opción: ");
        int opcion = teclado.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.println("Ingrese la opción: ");
            opcion = teclado.nextInt();
        }
        return opcion;
    }
    //METODO QUE DEVUELVE EL TIPO DE EVENTO POR CREAR
    public static int  menuCrearEvento(){
        System.out.println("\nElija una categoria\n ");
        System.out.println("1.Teatro");
        System.out.println("2.Partido");
        System.out.println("3.Concierto");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la opción: ");
        int tipoEvento = teclado.nextInt();
        while (tipoEvento < 1 || tipoEvento > 3) {
            System.out.println("Ingrese la opción: ");
            tipoEvento = teclado.nextInt();
        }
        return tipoEvento;
    }
    //MENU PARA INGRESAR DATOS Y CREAR UN EVENTO, LLAMA AL METODO CREAR EVENTO EN LA CLASE EVENTO
    public static Evento ingresarDatosEvento(String nombreEvento,int tipoEvento,String usuarioProveedor){
        System.out.println("Codigo evento:");
        String codigoEvento = sc.nextLine();
        System.out.println("Descripcion:");
        String descripcion = sc.nextLine();
        String categoria="";
        if (tipoEvento==1){
            categoria="teatro";
        }
        if (tipoEvento==3){
            categoria="partido";
        }
        if (tipoEvento==3){
            categoria="concierto";
        }
        System.out.println("Codigo escenario:");
        String codigoEscenario = sc.nextLine();
        System.out.println("Fecha:");
        String fecha = sc.nextLine();
        System.out.println("Hora:");
        String hora = sc.nextLine();
        System.out.println("Precio de boleto:");
        String precio = sc.nextLine();
        String boletosVendidos = "0";
        Evento e= new Evento(codigoEvento,nombreEvento,descripcion,categoria,codigoEscenario,usuarioProveedor,fecha,hora,precio,boletosVendidos);
        return e;
    }
}
