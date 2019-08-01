package com.lincros.ivan.polovyi.test;
import java.math.BigDecimal;
import java.text.Normalizer;


public class HelloWord {


    public static void main(String[] args) {

String td = "6,10683e+13";
        String s;
        Double doubleValue = Double.valueOf(td);
        BigDecimal bd = new BigDecimal(doubleValue.toString());
        long lonVal = bd.longValue();
        String phoneNumber = Long.toString(lonVal).trim();
        System.out.print("PhoneNumber " + phoneNumber);






        System.out.println( removerAcento("Joço"));
    }

        public static String removerAcento(String str) {
            str = Normalizer.normalize(str, Normalizer.Form.NFD);
            str = str.replaceAll("[^\\p{ASCII}]", "");
            return str;


    }

}
