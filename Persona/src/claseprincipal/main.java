
package claseprincipal;
import persona.Administrarivos;
import persona.Docente;
import persona.Estudiantes;

/**
 *
 * @author invitado
 */
public class main {

    /**
     * @param args the command line arguments
     */
    String Estudiante, Adminstrarivos, Docente;

    public static void main(String[] args) {
        
        Administrarivos admi = new Administrarivos();
        admi.setSueldo(2000);
        
        Estudiantes es = new Estudiantes();
        es.setSemestre("tercero");
        
        
        Docente dc = new Docente();
        dc.setTipodecontrato("");
        

    }

}


