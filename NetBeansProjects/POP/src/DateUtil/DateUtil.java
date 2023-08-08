
package DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ale y Choy
 */
public class DateUtil {
     private static final String FORMATO_FECHA = "dd/MM/yyyy";

    public static String convertirDateAString(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
        return sdf.format(fecha);
    }

    public static Date convertirStringADate(String fechaString) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
        try {
            return sdf.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
