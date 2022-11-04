/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_javierreyes;
import java.util.Scanner;
//import java.util.Random;
/**
 *
 * @author Javier Reyes
 */
public class Lab4P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in); 
        // TODO code application logic here
       boolean salir = false;
       int opcion;
       while(!salir){
           System.out.println("bienvenido al menu de laboratorio 4");
           System.out.println("las opciones del menu son las siguientes");
           System.out.println("1.fallout words ");
           System.out.println("2.rodatcripne ");
           System.out.println("3.alpha: ");
           System.out.println("4.salir ");
           opcion = lea.nextInt();
           switch (opcion){
               case 1:
                  opcion1();
                   break;
               case 2:
                   opcion2();
                   break;
      
               case 3: 
                   is_alpha();
                   case 4:
                   salir=true;
               break;
           } 
           System.out.println("fin del menu"); 
       }        
    }
    
    public static void opcion1(){      
        Scanner entrada = new Scanner(System.in);
     //   new Random().nextInt((max-min)+1)+min
        System.out.println("selecciono fallout words");
        System.out.println("lista de palabras");
        System.out.println("Comer  Unida");
        System.out.println("Jugar  Venti");
        System.out.println("Salta  Llama");
        System.out.println("Llora  Eevee");
        System.out.println("Muere  Local");
        System.out.println("ingrese la palabra que selecciono: ");
        
       
    }    
        
        
    public static void opcion2(){
  //    int num = 0;
 //     int acumulador = 0;
      String contraseña = "";
      int i;
      Scanner contra = new Scanner(System.in);
      System.out.println("selecciono rodatcripne");
      System.out.println("ingrese su contraseña: ");
          contraseña=contra.nextLine();
      //    String invertir = "";
            for (i = contraseña.length()-1; i > 0; i--) {
                System.out.println(contraseña.charAt(i)); 
            }
            System.out.println("");
    }
      public static void is_alpha(){
      Scanner alpha = new Scanner(System.in);
      System.out.println("selecciono alpha");
      System.out.println("ingrese la cadena que desea evaluar: ");
      String cadena=alpha.nextLine();
                   
                  
  
               
           
           
       }
    }
    

