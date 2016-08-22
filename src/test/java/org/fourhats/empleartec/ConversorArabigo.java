package org.fourhats.empleartec;
import java.util.*;
public class ConversorArabigo {
    private  static Map<Integer,String> simbolos;
    static{
        simbolos = new HashMap<Integer,String>();
        simbolos.put(50,"L");
        simbolos.put(40,"XL");
        simbolos.put(10,"X");
        simbolos.put(9,"IX");
        simbolos.put(5,"V");
        simbolos.put(4,"IV");
        simbolos.put(1,"I");
        simbolos.put(90,"XC");
        simbolos.put(100,"C");
    }
    public String toRoman(int numero) {
        String romano = "";
        ArrayList<Integer> numeros = new ArrayList<Integer>(simbolos.keySet());
        Collections.sort(numeros,Collections.reverseOrder());
        for (int i=0;i< numeros.size();i++) {
            while(numero>= numeros.get(i)){
                romano += simbolos.get(numeros.get(i));
                numero = numero - numeros.get(i);
            }
        }
        return romano;
    }
}