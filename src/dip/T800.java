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
public class T800 {
    private final IAsesinar asesinar;

    public T800(IAsesinar asesinar) {
        this.asesinar = asesinar;
    }
        
    
    public void asesinarSara(){
        asesinar.buscarSara();
        asesinar.disparar();
    }
}
