/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opermat_java;

/**
 *
 * @author Alienware
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Opermat_JAVA {
    public static boolean finalizar_programa= false;
 //Aqui puedo escribir las variables globales
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String comando;
    String com;
    String[] lista_de_comandos;
    System.out.println("OPERMAT: OPERACIONES SOBRE MATRICES");
        while (finalizar_programa==false){
            System.out.print("cmd--> ");
            comando=leer.nextLine();
            lista_de_comandos=(eliminar_caracteres(comando));
            com=lista_de_comandos[0];
            System.out.println(comando);
            System.out.println(Arrays.toString(eliminar_caracteres(comando)));
            if ("fin".equals(com) || "finalizar".equals(com))
                finalizar_programa=true;
            if ("ayu".equals(com) || "ayuda".equals(com)){
                try {
     File path = new File ("manual_de_usuario_opermat_JAVA1.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
}
        }
    }
public static String[] eliminar_caracteres(String string){
    String[] lista2;
    ArrayList<String> lista = new ArrayList<>( );
    lista2= string.split(" ");
    return lista2;
    } 
}
