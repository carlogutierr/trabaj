/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author invitado
 */
public class Persona {

    String nombre;
    String apelidos;
    String ID;
    String edad;

    public  void Persona() {
        System.out.println(nombre );
        System.out.println( apelidos );
        System.out.println(ID);
        System.out.println(edad);
    }

    public void imprimir() {
        System.out.println(nombre + apelidos + ID);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public String getID() {
        return ID;
    }

    public String getEdad() {
        return edad;
    }

}
