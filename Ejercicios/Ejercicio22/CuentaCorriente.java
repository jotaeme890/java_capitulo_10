package Ejercicios.Ejercicio22;

import java.util.ArrayList;

public class CuentaCorriente {
    private String numero = "";
    private double saldo;
    private ArrayList<String> movimientos = new ArrayList<>();

    public CuentaCorriente() {
        this.generaNumero();
    }

    public CuentaCorriente(double saldo) {
        this.generaNumero();
        this.saldo = saldo;
    }

    private void generaNumero() {
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random() * 10);
        }
    }
    
    @Override
    public String toString() {
        return "Número de cta: " + this.numero + " Saldo: " + String.format("%.2f", saldo) + " eur";
    }

    public void ingreso(double dinero){
        this.saldo += dinero;
        movimientos.add("Ingreso de " + dinero + " eur Saldo: " + String.format("%.2f", saldo) + " eur");
    }

    public void cargo(int dinero) {
        saldo -= dinero;
        movimientos.add("Cargo de " + dinero + " eur Saldo: " + String.format("%.2f", saldo) + " eur");
    }
    
    public void transferencia(CuentaCorriente c, int dinero){
        this.saldo -= dinero;
        c.cargo(dinero);
        movimientos.add("Transf. emitida de " + dinero + " eur a la cuenta "+ c.numero + " Saldo " + String.format("%.2f", saldo) + " eur");
        c.movimientos.add("Transf. recibida de " + dinero+ " eur de la cuenta " + c.numero + " Saldo " + String.format("%.2f", c.saldo) + " eur");
    }

    public void movimientos(){
        System.out.println("Movimientos de la cuenta " + this.numero);
        System.out.println("-----------------------------------");
        for (String string : movimientos) {
            System.out.println(string);
        }
    }

}
