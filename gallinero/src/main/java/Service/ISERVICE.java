package Service;

public interface ISERVICE <DTO,T>{

	public boolean save (DTO dto);
	
	public DTO getById (int id);
	
	public boolean update (DTO dto);
	
	public boolean deleteById (int id);
	
	public DTO classToDTO (T date);
	
	public T DTOToClass (DTO dto);
	
}

