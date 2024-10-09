package Controller;

import DTO.ProduccionDTO;
import Service.ProduccionService;
import Service.ProduccionServiceIMP;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.DateUtil;

public class ControladorAdminGeneral {

    ProduccionService service = new ProduccionServiceIMP();
    
    
    public LocalDate isoToLocalDate (String fecha){
        return DateUtil.isoToLocalDate(fecha);
    }
    
    public boolean saveProduccion (ProduccionDTO dto){
        return service.save(dto);
    }
}
