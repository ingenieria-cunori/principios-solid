/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author hendrick
 */
public class Contador implements IAccion, IDescanso {

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando");
    }

    @Override
    public void descansar() {
        System.out.println("Estoy descansando");
    }

    @Override
    public void usarSanitario() {
        System.out.println("Estoy haciendo del 1");
    }

    @Override
    public void alimentar() {
        System.out.println("Estoy almorzando");
    }

}
