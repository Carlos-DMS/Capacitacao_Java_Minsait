package br.com.cdms.utils;

public class Funcoes {

    public static boolean isNumeric(String numero) {
        try {
            Double d = Double.parseDouble(numero);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
