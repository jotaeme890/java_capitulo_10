package Ejercicios.Ejercicio7;

public class Moneda {
    private String [] posicion = {"cara","cruz"};
    private String [] cantidad = { "1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};

    private String lado;
    private String valor;

    public Moneda(){
        this.valor = cantidad[(int)(Math.random()*8)];
        this.lado = posicion[(int)(Math.random()*2)];
    }

    public String getValor(){
        return this.valor;
    }

    public String getLado(){
        return this.lado;
    }

    @Override
    public String toString(){
        return this.valor + " - " + this.lado; 
    }
}
