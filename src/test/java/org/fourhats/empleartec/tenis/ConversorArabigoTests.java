package org.fourhats.empleartec.tenis;


import org.fourhats.empleartec.ConversorArabigo;
import org.junit.Assert;
import org.junit.Test;

public class ConversorArabigoTests {


    @Test
    public void debeConvertirRango() {
        chequear(1, "I");
        chequear(2, "II");
        chequear(3, "III");
        chequear(4, "IV");
        chequear(5, "V");
        chequear(6, "VI");
        chequear(7, "VII");
        chequear(8, "VIII");
        chequear(9, "IX");
        chequear(10, "X");
        chequear(11,"XI");
        chequear(12,"XII");
        chequear(13,"XIII");
        chequear(14,"XIV");
        chequear(15,"XV");
        chequear(16,"XVI");
        chequear(17,"XVII");
        chequear(18,"XVIII");
        chequear(19,"XIX");
        chequear(20,"XX");
        chequear(21,"XXI");
        chequear(22,"XXII");
        chequear(23,"XXIII");
        chequear(24,"XXIV");
        chequear(25,"XXV");
        chequear(29,"XXIX");
        chequear(30,"XXX");
        chequear(35,"XXXV");
        chequear(39,"XXXIX");
        chequear(40,"XL");
        chequear(50,"L");
        chequear(59,"LIX");
        chequear(70,"LXX");
        chequear(89,"LXXXIX");
        chequear(90,"XC");
    }

    public void chequear(int numero, String esperado) {
        //Given
        ConversorArabigo conversor = new ConversorArabigo();
        //When
        String numeroRomano = conversor.toRoman(numero);

        //Then
        Assert.assertEquals("El numero " + numero + " es " + esperado + " en Romano", esperado, numeroRomano);
    }

}
