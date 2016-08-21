package org.fourhats.empleartec.tenis;

import org.fourhats.empleartec.Tablero;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

public class TableroTests {

    @Test
    public void chequear(){
        chequear_marcador("0","0","0 - 0");
        chequear_marcador("15","0","15 - 0");
        chequear_marcador("30","0","30 - 0");
        chequear_marcador("45","0","45 - 0");
        chequear_marcador("Punto","0","Punto para el Jugador 1 - 0");
    }


    private void chequear_marcador(String punto1,String punto2,String marcadorEsperado) {

        //Given - Dado
        Tablero tablero = new Tablero();
        //When - Cuando
        tablero.setPoint(punto1,punto2);
        String marcador = tablero.marcador();
        //Then - Entonces
        Assert.assertEquals("El tablero dice", marcadorEsperado, marcador);
    }

}
