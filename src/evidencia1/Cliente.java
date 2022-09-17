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
public class Cliente {
    
    Scanner entrada = new Scanner(System.in);
    
    boolean ok=false, checar=false;
    String tiempoMinimoE="", tiempoMaximoE="";
    

    
    public void establecerTiempoCliente() {
        //Validar que no sean números menor o igual que cero o caracter diferente de número.
                ok=false;
                while(!ok) {
                    
                    System.out.print("Ingresa el tiempo mínimo de llegada de tus elementos: ");
                    tiempoMinimoE = entrada.next();

                    System.out.print("Ingresa el tiempo máximo de llegada de tus elementos: ");
                    tiempoMaximoE = entrada.next();
                    
                    try {
                        
                        Integer.parseInt(tiempoMinimoE);
                        Integer.parseInt(tiempoMaximoE);
                        ok=true;
                        if(Integer.parseInt(tiempoMinimoE)<=0 || Integer.parseInt(tiempoMaximoE)<=0) {
                            System.out.println("Error: no se permite poner un número menor o igual que cero.\n");
                            ok=false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: no se permiten poner caracteres diferentes a un número.\n");
                    }
                    
                    
                }
                 
                //Validar que el tiempo minimo sea simpre menor que el maximo.
                do {
                    
                    if(Integer.parseInt(tiempoMinimoE) > Integer.parseInt(tiempoMaximoE)) {
                        System.out.println("ERROR: El tiempo mínimo es mayor al tiempo máximo. Vuelve a intentarlo.");
                        checar = false;

                        System.out.print("Ingresa el tiempo mínimo de llegada de tus elementos: ");
                        tiempoMinimoE = entrada.next();

                        System.out.print("Ingresa el tiempo máximo de llegada de tus elementos: ");
                        tiempoMaximoE = entrada.next();


                    } else {
                        checar = true;
                    }
                }while(checar == false);
    }
    
}
