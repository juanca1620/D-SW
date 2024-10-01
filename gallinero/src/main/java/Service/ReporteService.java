package Service;

import java.util.List;

public interface ReporteService <DTO>{
	public boolean save (DTO dto);
	
	public DTO getById (int id);
	
	public boolean update (DTO dto);
	
	public boolean deleteById (int id);
        
        public List<DTO> returnProductionReports ();
        
        public List<DTO> returnBatchReports();
}
