package com.pinapp.exercice.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static boolean isValidDate(String dateString) {
        boolean result = false;
        try {
            if (StringUtils.isNotEmpty(dateString)) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(dateString);
                result = isValidDate(date);
            }
        } catch (Exception excepcion) {
            result = false;
        }
        return result;
    }

    public static boolean isValidDate(Date date) {

        boolean resultado = false;
        try {
            LocalDateTime dateTime = LocalDateTime.fromDateFields(date);
            int year = dateTime.getYear();

            if((year > LocalDateTime.now().getYear() || 1900 > year)) {
                resultado = false;
            } else {
                resultado = true;
            }
        } catch (Exception excepcion) {
            resultado = false;
        }
        return resultado;
    }
}
