package Service;

import DTO.LoteDTO;
import java.util.List;

public interface LoteService <DTO>{
	public boolean save (DTO dto);
	
	public DTO getById (int id);
	
	public boolean update (DTO dto);
	
	public boolean deleteById (int id);
        
        public List<LoteDTO> missingToFeed();
}
