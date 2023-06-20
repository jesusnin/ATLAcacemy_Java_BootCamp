package Clase10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Probar la clase Clase10.Persona
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse("26/10/1985");
        Persona persona = new Persona (1, "Miguel", 25, date, "00109115" );
        persona.mostrar();

        //Probar la clase Clase10.Cuenta
        Cuenta cuenta = new Cuenta ("Miguel", 27850.42);
        cuenta.mostrar ();
        cuenta.ingresar ( 80736.55 );
        cuenta.mostrar ();
        cuenta.retirar ( 90000.10 );
        cuenta.mostrar ();
    }
}
