package Clase10;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double setCantidad(double cantidad) {
        this.cantidad = cantidad;
        return cantidad;
    }

    public void mostrar()
    {
        System.out.println ("\n Titular: " + getTitular () + "\n Cantidad: " + (getCantidad ()<0?" balance en negativo":getCantidad ()));
    }

    public void ingresar(double monto)
    {
        System.out.println ("Realizando deposito de: " + monto);
        if(monto <= 0 )
        {
            return;
        }
        setCantidad ( getCantidad () + monto);
    }

    public void retirar(double monto)
    {
        System.out.println ("Realizando retiro de: " + monto);
        setCantidad ( getCantidad () - monto);
    }

}
