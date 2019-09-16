/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli;

/**
 *
 * @author invitado
 */
public class programainterfaz {

     public static void main(String arg[]) { 
        persona pavaroti = new persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        burro burro = new burro();
        burro.cantar();
        hacerCantar(burro); 
    } 
 
    public static void hacerCantar(Ipuedecantar cant) { 
        cant.cantar();
    }     
}
