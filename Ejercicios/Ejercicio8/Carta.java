package Ejercicios.Ejercicio8;

import java.util.Objects;

public class Carta {
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
    //LE PASAMOS UN OBJETO QUE NO SE SABE DE QUE TIPO SERÁ PARA COMPROBAR SI ES IGUAL O NO
    public boolean equals(Object obj) {
        //SI EL OBJETO ESTA VACÍO ES FALSO, YA QUE NO SON IGUALES
        if (obj == null) {
            return false;
        }
        //SI LAS CLASES SON DIFERENTES ES QUE TAMPOCO SON IGUALES
        if (getClass() != obj.getClass()) {
            return false;
        }
        //CREAMOS LA CONSTANTE DE TIPO Carta, Y LE DAMOS EL VALOR DE obj HACIENDOLE UN CASTING A Carta
        final Carta carta2 = (Carta) obj;
        //SI EL VALOR DE LA ACTUAL ES DIFERENTE A LA SIGUIENTE, ES FALSO YA QUE NO SON IGUALES
        if (!Objects.equals(this.valor, carta2.valor)) {
            return false;
        }
        //LO MISMO PASA CON EL PALO DE LA CARTA
        if (!Objects.equals(this.palo, carta2.palo)) {
            return false;
        }
        //SI NO OCURRE NADA DE ESTO, ES QUE SON IGUALES
        return true;
    }
}
