package Controller;

import DTO.ProduccionDTO;
import Service.ProduccionService;
import Service.ProduccionServiceIMP;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorAdminGeneral {

    ProduccionService service = new ProduccionServiceIMP();
    
    public  boolean verificarFormatoFecha (String fecha){
    	return service.verificarFormatoFecha(fecha);
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
