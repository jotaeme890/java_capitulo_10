package Ejercicios.Ejercicio16;

import java.util.HashMap;

public class Paises {
    HashMap <String, String> capitales = new HashMap<>();

    Paises(){
        capitales.put("Espana", "Madrid");
        capitales.put("Portugal","Lisboa");
        capitales.put("Francia", "París");
    }

    public String getCapital(String pais){
        return capitales.get(pais);
    }

    public Boolean anade(String pais, String capital){
        if(capitales.containsKey(pais))
            return false;
        capitales.put(pais, capital);
        return true;
    }
}
