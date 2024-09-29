package Service;

import DTO.LoteDTO;
import Model.Lote;
import Repository.LoteRepository;

public class LoteService implements ISERVICE<LoteDTO, Lote>{
	
	private LoteRepository repo = new LoteRepository();
	
	@Override
	public boolean save(LoteDTO dto) {
		return repo.save(dto);
	}

	@Override
	public LoteDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(LoteDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public LoteDTO classToDTO(Lote date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lote DTOToClass(LoteDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
