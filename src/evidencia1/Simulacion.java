/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia1;

import java.util.PriorityQueue;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Simulacion {
    
        Tope tope = new Tope();
        Cliente cli = new Cliente();
        Servidor ser = new Servidor();
        PriorityQueue miColaP = new PriorityQueue();
    
   
    
    
  
    
    public void IniciarSimulacion() {
        

        
        int cicloEntrada=0, cicloSalida=0;
                    
                //if(cli.tiempoMinimoE != "" && cli.tiempoMaximoE != "" && ser.tiempoMinimoS != "" && ser.tiempoMaximoS != "") {
                   
                    boolean verificar = true;
                    boolean verificar2 = true;
                    int tiempoAleatorioE=0;
                    int tiempoAleatorioS=0;


                    for(int i=1; i<=180; i++) {

                        System.out.println("\nCola de prioridad a " + i + " segundos" + ": " + miColaP + "\n");


                        //Push.
                        cicloEntrada++;

                        if(verificar == true) {
                            tiempoAleatorioE = (int) (Math.random()*(Integer.parseInt(cli.tiempoMaximoE)-Integer.parseInt(cli.tiempoMinimoE)+1)+Integer.parseInt(cli.tiempoMinimoE));

                        }

                        if(cicloEntrada == tiempoAleatorioE) {

                            if(Integer.parseInt(tope.tam)==miColaP.size()) {
                                System.out.println("\nIntentanto agregar un elemento a la cola...");
                                System.out.println("Tope máximo alcanzado");
                                System.out.print("Elemento rechazado\n");
                                cicloEntrada=0;
                                verificar=false;
                            } else {
                                //Crear un elemento con una prioridad entre 1 y 5.
                                //Esto es cuando ya se cumplió el tiempo aleatorio de push.
                                int valor = (int) (Math.random() * 5 + 1);
                                System.out.println("Valor: " + valor);

                                miColaP.add(valor);
                                System.out.println("Estado: PUSH.");
                                verificar=true;
                                cicloEntrada=0;
                            }

                        } else {
                            verificar=false;

                        }


                        //Pop

                        if(!miColaP.isEmpty()) {
                             cicloSalida++;
                            if(verificar2 == true) {
                                tiempoAleatorioS = (int) (Math.random()*(Integer.parseInt(ser.tiempoMaximoS)-Integer.parseInt(ser.tiempoMinimoS)+1)+Integer.parseInt(ser.tiempoMinimoS));

                            }

                            if(cicloSalida == tiempoAleatorioS) {

                                miColaP.remove();
                                System.out.println("\nEstado: POP");
                                System.out.println("Tiempo en ser atendido: " + tiempoAleatorioS + "\n");
                                verificar2=true;
                                cicloSalida=0;

                            } else {
                                verificar2=false;
                            }
                        }

                    }

                   
                //} else {
                    //System.out.println("Error: necesitas inicalizar los valores en los incisos a, b y c para realizar la simulación correctamente.\n");
                //} 
    }
    
}
