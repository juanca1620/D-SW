package Verificator;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.DateUtil;

public class ProduccionVerificator {
    
    public static LocalDate verificarFormatoFecha (String fecha){
        return DateUtil.isoToLocalDate(fecha);
    }
    
    public static boolean isCantidadValida (int cantidadHuevos){
        return cantidadHuevos > 0;
    }
    
    
}
