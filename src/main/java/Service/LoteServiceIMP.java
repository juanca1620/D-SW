package Service;

import DTO.LoteDTO;
import Repository.LoteRepositoryIMP;
import java.util.List;

public class LoteServiceIMP implements LoteService<LoteDTO>{
	
	private LoteRepositoryIMP repo = new LoteRepositoryIMP();
	
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

    public List<LoteDTO> missingToFeed() {
        return repo.missingToFeed();
    }
        
        
}
