package Verificator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProduccionVerificator {
    
    public static boolean verificarFormatoFecha (String fecha){
        String regex = "^(19|20)\\d{2}-(0[1-9]|1[0-2])-([0-2]\\d | 3[01])$"; 
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }
    
    public static boolean isCantidadValida (int cantidadHuevos){
        return cantidadHuevos > 0;
    }
    
    
}
