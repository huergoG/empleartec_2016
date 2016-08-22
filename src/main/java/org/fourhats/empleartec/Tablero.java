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
            put("45","45");
            put("Punto","Punto para el Jugador ");
        }
    };
    public String marcador() {
        return this.marcador.get("jugador1") +" - " +this.marcador.get("jugador2");
    }
    public void setPoint(String puntos[]) {
        for (Integer indice=0;indice<puntos.length;indice++ ){
             Integer jugador = indice+1;
            if (validPoints.containsKey(puntos[indice])){
                this.marcador.replace("jugador"+jugador.toString(),this.getPunto(puntos[indice],jugador));
            }
        }
    }
    private String getPunto(String punto,Integer jugador){
        return (punto.equals("Punto"))? validPoints.get(punto)+ jugador.toString() : validPoints.get(punto);
    }
}