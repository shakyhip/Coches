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
public class Coche {
    private String marca;
    private String tipo;
    private int velocidad;
    
    //Constructor sin parametros
    public Coche(){}
    
    //Constructor con parametros
    public Coche(String marca, String tipo, int velocidad)
    {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }
    
    public void Avanzar(int n_km){
        System.out.println("El " + this.getMarca() + " avanza " + n_km);
    }
    public void Parar(){
        System.out.println("El " + this.getMarca() + " se detuvo");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
