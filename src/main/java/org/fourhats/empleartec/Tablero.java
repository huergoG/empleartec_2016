package org.fourhats.empleartec;

import java.util.HashMap;
import java.util.Map;

public class Tablero {
    private Map<String, String> marcador = new HashMap<String, String>() {{
        put("jugador1", "0");
        put("jugador2", "0");
    }};
    private static Map<String,String> validPoints=new HashMap<String,String>(){
        {
            put("0","0");
            put("15","15");
            put("30","30");
            put("40","40");
            put("Punto","Punto");
        }
    };
    public String marcador() {
        return this.marcador.get("jugador1") +" - " +this.marcador.get("jugador2");
    }

    public void setPoint(String punto1, String punto2) {
        if (validPoints.containsKey(punto1)){
            this.marcador.replace("jugador1", punto1);
        }
        if (validPoints.containsKey(punto2)){
            this.marcador.replace("jugador2", punto2);
        }
    }
}