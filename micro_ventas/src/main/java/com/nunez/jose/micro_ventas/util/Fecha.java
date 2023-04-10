package com.nunez.jose.micro_ventas.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jose Alfredo Nuñez Aguirre
 */
public class Fecha {

     // Método para parsear una cadena de texto en un objeto Date
     public static Date parser(String fecha) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return formato.parse(fecha);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // Método para formatear un objeto Date como una cadena de texto
    public static String parser(Date fecha) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return formato.format(fecha);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
