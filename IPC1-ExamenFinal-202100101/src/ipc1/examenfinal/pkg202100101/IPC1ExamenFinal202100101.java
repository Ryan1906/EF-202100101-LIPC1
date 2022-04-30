/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.examenfinal.pkg202100101;

/**
 *
 * @author rjrsi
 * 
 */
 import java.util.Scanner;
public class IPC1ExamenFinal202100101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Eje
        
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("**********************");
        System.out.println("* 1. Programa 1      *");
        System.out.println("* 2. Programa 2      *");
        System.out.println("* 3. Programa 3      *");
        System.out.println("**********************");
        
        int opcion1 = scanner.nextInt();
        
          while (opcion1 > 3 || opcion1 <1){
        
           System.out.println("**********************");
        System.out.println("* 1. Programa 1         *");
        System.out.println("* 2. Programa 2         *");
        System.out.println("* 3. Programa 3         *");
        System.out.println("**********************"); 
            System.out.println("Valor Invalido, intente de nuevo");
            opcion1 = scanner.nextInt();
        }
        
        switch (opcion1){
            
            case 1:
                Scanner num1 = new Scanner(System.in); 
                Scanner num2 = new Scanner(System.in); 
                System.out.println("Ingrese el primer valor");
                int numero1 = num1.nextInt();
                System.out.println("Ingrese el segundo valor");
                int numero2 = num2.nextInt();
                
                
                if (numero1>numero2) {
                    System.out.println("El mayor es: "+numero1);
                    System.out.println("El menor es: "+numero2);
                }else{
                    System.out.println("El mayor es: "+numero2);
                    System.out.println("El menor es: "+numero1);
                }
                
                
                break;
                
            case 2:
                
                Scanner ast = new Scanner(System.in); 
                
                
                System.out.print("Introduce un numero ");
        int num = ast.nextInt();
        ast.nextLine();
 
        System.out.println();
        for(int altura = 1; altura<=Math.ceil((float)num/2); altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=num - altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
                
                
                break;
            case 3:
                
                System.out.println("tela kreiste");
                break;
            
        }
            
        
        
        // TODO code application logic here
    }
    
}
