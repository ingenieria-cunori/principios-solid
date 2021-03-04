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
public interface ITrabajador {
    /**
     * Esta interfaz violentaría el principio ISP al momento de implementar
     * un trabajador que no utilice el sanitario y no se alimente como por 
     * ejemplo un autómata.
     */
    public void trabajar();
    public void descansar();
    public void usarSanitario();
    public void alimentar();
}
