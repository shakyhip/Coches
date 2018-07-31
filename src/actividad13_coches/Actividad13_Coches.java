/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13_coches;

/**
 *
 * @author SHAVA
 */
public class Actividad13_Coches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche carro1 = new Coche("Nissan", "Camioneta", 200);
        Coche carro2 = new Coche("Ferrari", "Deportivo", 100);
        
        final int DISTANCIA = 100; //final significa que nunca cambiará el valor
        
        double tiempo1 = Tiempo(DISTANCIA, carro1.getVelocidad());
        double tiempo2 = Tiempo(DISTANCIA, carro2.getVelocidad());
        
        CompararTiempo(tiempo1, tiempo2);
        
        Coche carroGanador = compararTiempoObjetos(carro1,carro2,DISTANCIA);
        
        System.out.println("El carro ganador es " + carroGanador.getMarca());
    }
    
    public static double Tiempo(int DISTANCIA,int velocidad)
    {
        double tiempo = (double)DISTANCIA/(double)velocidad;
        return tiempo;
    }
    
    public static void CompararTiempo(double tiempo1, double tiempo2){
        if(tiempo1 < tiempo2)
        {
            System.out.println("El coche más rápido es el primer coche");
        }
        else if (tiempo1 == tiempo2){
            System.out.println("Ambos son igual de rapidos");
        }
        else{
            System.out.println("El coche más rápido es el segundo coche");
        }
    }
    
    private static Coche compararTiempoObjetos(Coche coche1, Coche coche2, int DISTANCIA) {
        
        double tiempo1 = Tiempo(DISTANCIA,coche1.getVelocidad());
        double tiempo2 = Tiempo(DISTANCIA,coche2.getVelocidad());
        
        if(tiempo1<tiempo2)
            return coche1;
        else
            return coche2;
    }
}
