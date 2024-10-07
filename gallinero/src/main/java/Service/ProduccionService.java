package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ProduccionService <DTO>{

	public boolean save (DTO dto);
	
	public DTO getById (int id);
	
	public boolean update (DTO dto);
	
	public boolean deleteById (int id);
	
        public boolean verificarFormatoFecha (String fecha);
}
