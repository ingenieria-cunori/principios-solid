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
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Draw d = new Draw();
        DrawGoku dg = new DrawGoku();
        DrawCrilin dc = new DrawCrilin();
        d.dibujar(dg);
        d.dibujar(dc);
    }
    
}
