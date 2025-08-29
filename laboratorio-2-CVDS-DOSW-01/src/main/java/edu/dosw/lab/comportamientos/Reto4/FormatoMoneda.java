
package edu.dosw.lab.comportamientos.Reto4;

import java.math.BigDecimal;

public class FormatoMoneda {

    public static String aplicar(BigDecimal numero, String moneda) {
        if ("JPY".equals(moneda) && numero.compareTo(BigDecimal.valueOf(1000)) >= 0) {
            String str = numero.toPlainString();
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1, count = 0; i >= 0; i--) {
                if (count == 3) {
                    sb.insert(0, ".");
                    count = 0;
                }
                sb.insert(0, str.charAt(i));
                count++;
            }
            return sb.toString();
        }
        return "EUR".equals(moneda)
                ? numero.toPlainString().replace(".", ",")
                : numero.toPlainString();
    }
}
