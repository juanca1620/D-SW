package Service;

import DTO.AlimentoDTO;
import java.util.List;

public interface AlimentoService <DTO>{
	public boolean save (DTO dto);
	
	public DTO getById (int id);
	
	public boolean update (DTO dto);
	
	public boolean deleteById (int id);
        
        public List<AlimentoDTO> getAll();
}
