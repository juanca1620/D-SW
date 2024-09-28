package Repository;

import java.util.List;

public interface IRepository <DTO>{
	
	public void save(DTO dto);
	
	public DTO getById(int id);
	
	public void deleteById(int id);
	
	public void update(DTO dto);
	
}
