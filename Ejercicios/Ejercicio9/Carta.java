package Ejercicios.Ejercicio9;

import java.util.Objects;

public class Carta implements Comparable <Carta>{
    private String [] tipo = { "bastos", "copas", "espadas", "oros"};
    private String [] numeros = { "as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};

    private String valor;
    private String palo;

    public Carta(){
        this.palo = tipo[(int)(Math.random()*4)];
        this.valor = numeros[(int)(Math.random()*10)];
    }

    public String getValor(){
        return this.valor;
    }

    public String getPalo(){
        return this.palo;
    }

    @Override 
    public String toString(){
        return this.valor + " de " + this.palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Carta other = (Carta) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }

        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }

    @Override
    //PARA HACER EL .sort() DEBEMOS DE IMPLEMENTAR ESTE MÉTODO
    public int compareTo(Carta o) {
        //SI EL PALO DE LA CARTA ACTUAL ES IGUAL AL DEL OBJETO QUE NOS PASAN COMO PARAMETRO
        if (this.palo.equals(o.getPalo())) {
            //COMPARAREMOS EL VALOR PARA SABER CUAL VA ANTES O DESPUÉS PARA ORDENARLOS TAMBIÉN
            return this.valor.compareTo(o.getValor());
            //SI LOS PALOS NO SON IGUALES VEREMOS CUAL VA ANTES ALFABÉTICAMENTE Y ASÍ LO ORDENAREMOS
        } else {
            return this.palo.compareTo(o.getPalo());
        }
    }
}
