package Repository;

public interface ReporteRepository <DTO>{
	public boolean save(DTO dto);
	
	public DTO getById(int id);
	
	public boolean deleteById(int id);
	
	public boolean update(DTO dto);
}
