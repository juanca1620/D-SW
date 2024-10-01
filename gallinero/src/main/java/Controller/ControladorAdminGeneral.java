package Controller;

import DTO.ProduccionDTO;
import Service.ProduccionServiceIMP;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorAdminGeneral {

    ProduccionServiceIMP service = new ProduccionServiceIMP();
    
    public  boolean verificarFormatoFecha (String fecha){
        String regex = "^(19|20)\\d{2}-(0[1-9]|1[0-2])-([0-2]\\d|3[01])$"; 
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }
    
    public LocalDate isoToLocalDate (String fecha){
        if(!verificarFormatoFecha(fecha)){
            throw new IllegalArgumentException("Este formato de fecha es invalido");
        }
        return LocalDate.parse(fecha);
    }
    
    public boolean saveProduccion (ProduccionDTO dto){
        return service.save(dto);
    }
}
