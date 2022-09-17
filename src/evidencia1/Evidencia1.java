/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia1;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Evidencia1 {

       public static void main(String[] args) {
           
           Tope tope = new Tope();
           Cliente cli = new Cliente();
           Servidor ser = new Servidor();
           Simulacion simulacion = new Simulacion();
           
           Scanner entrada = new Scanner(System.in);
        
        //MENU.
        char opcion;
       
        
        System.out.println("***** MENU *****");
        System.out.println("a. Establecer el tope de la pila.");
        System.out.println("b. Establecer el rango de tiempo de llegada de los elementos.");
        System.out.println("c. Establecer el rango de tiempo de servicio del servidor.");
        System.out.println("d. Iniciar simulación");
        System.out.println("e. Salir del programa");
        String respuesta = "";
        
        
        do {            
            
            System.out.print("\nElige una opción: ");
            opcion = entrada.next().charAt(0);
        
        switch(opcion) {
            
            //Establecer el tope de la cola.
            case 'a':
                
                tope.establecerTope();
                System.out.println(tope.tam);
                
                
                break;
            
            //Establecer el rango de tiempo de llegada de los elementos.
            case 'b':
                
                cli.establecerTiempoCliente();
                System.out.println(cli.tiempoMinimoE);
                System.out.println(cli.tiempoMaximoE);
                
                break;
              
            //Establecer el rango de tiempo de servicio del servidor.
            case 'c':
                
                //Validar que no sean números menor o igual que cero o caracter diferente de número.
                
                ser.establecerTiempoServidor();
                
                
                break;
            
            //Iniciar simulación.
                /*
                La simulación durará tres minutos y deberá mostrar la cola priorizada cada segundo.

                Cada vez que se cumpla un tiempo de push, el programa deberá crear 
                un elemento con una prioridad entera entre 1 y 5 e intentar meterlo a la cola priorizada.

                Además, deberá desplegar un mensaje de cada vez que la cola cambie de estado, push, pop, rechazos, etc.
                */
                
                //un ciclo = un segundo.
                //tres minutos = 180 segundos.
            case 'd':
                
                //Verificar que se tengan los datos para poder hacer la simulación correctamente.
                
                simulacion.IniciarSimulacion();
                
                break;
                
                
            case 'e':
                System.exit(0);
                break;
                
                
                
            default: System.out.println("Elige una opción válida.");
        }
        
         System.out.println("Deseas realizar otra acción (si=1) (no=0)");
         respuesta = entrada.next();
         
         
            
         
        
        } while ("1".equals(respuesta));
        
    }
    
}
