/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia1;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Tope {
    
    Scanner entrada = new Scanner(System.in);
    
    
    boolean ok=false;
    String tam;
     
    public void establecerTope() {
        
        ok=false;
                while(!ok) {
                    System.out.print("Digite el tope de la cola de prioridades: ");
                    tam = entrada.next();
                    
                    try {
                        Integer.parseInt(tam);
                        ok=true;
                        if(Integer.parseInt(tam)<=0) {
                            System.out.println("Error: no se permite poner un número menor o igual que cero.\n");
                            ok=false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: no se permiten poner caracteres diferentes a un número.\n");
                        
                    }
                    

                }
    }
    
    
    
    
    
}
