package Service;

public interface ISERVICE <DTO,T>{

	public void save (DTO dto);
	
	public DTO getById (int id);
	
	public void update (DTO dto);
	
	public void deleteById (int id);
	
	public DTO classToDTO (T date);
	
	public T DTOToClass (DTO dto);
	
}

