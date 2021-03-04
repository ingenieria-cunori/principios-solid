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
public class Automata implements IAccion{

    @Override
    public void trabajar() {
        System.out.println("EStoy trabajando");
    }

    @Override
    public void descansar() {
        System.out.println("Estoy descansando");
    }
    
}
