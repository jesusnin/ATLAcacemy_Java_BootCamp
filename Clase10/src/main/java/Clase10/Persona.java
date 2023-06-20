package Clase10;

import java.util.Date;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private Date fechaNacimiento = new Date ();
    private String dni;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, Date fechaNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrar()
    {
        System.out.println ("\n Id: "+getId ()+
                            "\n Nombre: "+getNombre()
                           +"\n Edad: "+getEdad ()
                           +"\n Fecha de nacimiento: "+getFechaNacimiento ()
                           +"\n DNI: "+getDni ()
                           +"\n Es "+(esMayorDeEdad ( getEdad () )?"mayor": "menor")
                           +" de edad");
    }

    public boolean esMayorDeEdad(int edad)
    {
        return edad >= 18;
    }
}
