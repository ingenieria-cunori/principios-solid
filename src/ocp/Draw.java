/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;


/**
 *
 * @author hendrick
 */
public class Draw {

    /* public void dibujar(Personaje personaje){
    
        Violando el principio OCP                 
        if (personaje instanceof Goku){
            System.out.println("Pintando a Gokú");
        }else if(personaje instanceof Vegeta){
            System.out.println("Pintando a Vegeta");
        }    
     */
    public void dibujar(IDraw personaje) {
        personaje.dibujar();
    }

    /*
    public void dibujar2(List<IDraw> drawPersonaje){
        drawPersonaje.forEach(d -> {
            d.dibujar();
        });
    }
     */
}
