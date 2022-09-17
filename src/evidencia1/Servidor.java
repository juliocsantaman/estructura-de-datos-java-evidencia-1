/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia1;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz
 */
public class Servidor {
    
    Scanner entrada = new Scanner(System.in);
    
    boolean ok=false, checar=false;
    String tiempoMinimoS="", tiempoMaximoS="";
    
    
    public void establecerTiempoServidor() {
                        ok=false;
                while(!ok) {
                    System.out.print("Ingresa el tiempo mínimo de servicio del servidor: ");
                    tiempoMinimoS = entrada.next();

                    System.out.print("Ingresa el tiempo máximo de servicio del servidor: ");
                    tiempoMaximoS = entrada.next();
                    
                    try {
                        Integer.parseInt(tiempoMinimoS);
                        Integer.parseInt(tiempoMaximoS);
                        ok=true;
                        if(Integer.parseInt(tiempoMinimoS)<=0 || Integer.parseInt(tiempoMaximoS)<=0) {
                            System.out.println("Error: no se permite poner un número menor o igual que cero.\n");
                            ok=false;
                        }
                    } catch (Exception e) {
                        System.out.println("Error: no se permiten poner caracteres diferentes a un número.\n");
                    }
                }
                
           
                
                //Validar que el tiempo minimo sea simpre menor que el maximo. 
                do {
                    

                    if(Integer.parseInt(tiempoMinimoS) > Integer.parseInt(tiempoMaximoS)) {
                        System.out.println("ERROR: El tiempo mínimo es mayor al tiempo máximo. Vuelve a intentarlo.");
                        checar = false;

                        System.out.print("Ingresa el tiempo mínimo de llegada de tus elementos: ");
                        tiempoMinimoS = entrada.next();

                        System.out.print("Ingresa el tiempo máximo de llegada de tus elementos: ");
                        tiempoMaximoS = entrada.next();


                    } else {
                        checar = true;
                    }
                }while(checar == false);
    }
    
}
