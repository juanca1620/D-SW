
package util;

import exceptions.DateNotValidException;
import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class DateUtil {
        public static LocalDate isoToLocalDate(String date){
        try {
            return LocalDate.parse(date);
        } catch (Exception e) {
            throw new DateNotValidException();
        }
    }
}
