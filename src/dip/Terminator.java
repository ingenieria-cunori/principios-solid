/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip;

/**
 *
 * @author hendrick
 */
public class Terminator {

    /**
     * Violentando el IDP.
     */
    
    public void caminar() {
        System.out.println("Caminando");
    }

    public void disparar() {
        System.out.println("Disparando");
    }

    public void correr() {
        System.out.println("Corriendo");
    }
    
    public void asesinarSaraConhor(){
        caminar();
        correr();
        disparar();
    }

}
