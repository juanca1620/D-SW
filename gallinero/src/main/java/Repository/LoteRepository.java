package Repository;

import java.util.List;

public interface LoteRepository <DTO>{
	public boolean save(DTO dto);
	
	public DTO getById(int id);
	
	public boolean deleteById(int id);
	
	public boolean update(DTO dto);
        
        public List<DTO> missingToFeed ();
}
