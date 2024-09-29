package Repository;

import java.util.List;

public interface IRepository <DTO>{
	
	public boolean save(DTO dto);
	
	public DTO getById(int id);
	
	public boolean deleteById(int id);
	
	public boolean update(DTO dto);
	
	public boolean removeChilds(int id);
}
