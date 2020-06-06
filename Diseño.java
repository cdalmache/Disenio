/*
Implemente un algoritmo que pida los niveles de auomatizacion 
en el diseño automotiz
 */
package diseño;
import java.util.Scanner;

/**
 *
 * @author Grupo1
 */
public class Diseño {

    public static void main(String[] args) {
        
        Scanner objeto = new Scanner(System.in);
        
        System.out.println("¿CUALES SON LOS ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE CAMPO?");
        /*
        * ROBOT DE BRAZO ARTICULADO
        * ROBOTS SEGUIDORES DE LÍNEA
        * SENSORES 
        * ACTUADORES
        */
        String nivel1= objeto.nextLine();
        System.out.println("¿CUALES SON LOS ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE CONTROL DE PLC?");
        /*
        * GENERACIÓN DEL CAD (ORDENADORES)
        * PROGRAMACIÓN DE LA MAQUINARIA DE LA LÍNEA DE PRODUCCIÓN.
        * CREACIÓN DE COLORES
        * DISEÑO INTERIOR
        */
        String nivel2= objeto.nextLine();
        System.out.println("¿CUALES SON LOS ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE SUPERVISION?");
        /*
        * MODELO DE CLAY (ESCULPIDO EN ARCILLA)
        * FROZEN MODEL (MODELO A ESCALA REAL)
        * CORTE DE PIEZAS
        */
        String nivel3= objeto.nextLine();
        System.out.println("¿CUALES SON LOS ELEMENTOS DEL REGISTRO DEL NIVEL MES?");
        /*
        * ENSAMBLE PROTOTIPO
        * ENSAMBLE DE CHASIS Y CARROCERÍA
        * MONTAJE FINAL
        */
        String nivel4= objeto.nextLine();
        System.out.println("¿CUALES SON LOS ELEMENTOS DEL REGISTRO DEL NIVEL ERP?");
        /*
        * REQUISITOS LEGALES
        * LA NOMINACIÓN O LICITACIONES DE PROVEEDORES
        * DECISIÓN DE COLORES
        * EL DEPARTAMENTO DE VENTAS
        * DISTRIBUCIÓN
        */
        String nivel5= objeto.nextLine();
        System.out.println("¿QUE ELEMENTOS CONFORMAN LA IMPRESION DEL REPORTE?");
        /*
        * EL CONTROL DE CALIDAD
        */
        String nivel6= objeto.nextLine(); 

        System.out.println("____________________________________________________________________________________");
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("GRUPO#1");
        System.out.println("MODELO DE COMPUTACION - CASO PRACTICO - ROBOTS");
        System.out.println("EN LA INDUSTRIA AUTOMOTRIZ -  DISEÑO");
        System.out.println("");
        System.out.println("");
        System.out.println("ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE CAMPO:");
        System.out.println(""+nivel1);
        System.out.println("ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE CONTROL DE PLC:");
        System.out.println(""+nivel2);
        System.out.println("ELEMENTOS DE LA ADMINSTRACION DEL NIVEL DE SUPERVISION:");
        System.out.println(""+nivel3);
        System.out.println("ELEMENTOS DEL REGISTRO DEL NIVEL MES:");
        System.out.println(""+nivel4);
        System.out.println("ELEMENTOS DEL REGISTRO DEL NIVEL ERP");
        System.out.println(""+nivel5);
        System.out.println("ELEMENTOS DE LA IMPRESION DEL REPORTE:");
        System.out.println(""+nivel6);
        System.out.println("____________________________________________________________________________________");
        
    }
    
}
