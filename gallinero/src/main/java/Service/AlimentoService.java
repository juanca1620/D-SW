package Service;

import DTO.AlimentoDTO;
import Model.Alimento;
import Repository.AlimentoRepository;

public class AlimentoService implements ISERVICE<AlimentoDTO, Alimento>{
	private AlimentoRepository repo = new AlimentoRepository();
	@Override
	public boolean save(AlimentoDTO dto) {
		return repo.save(dto);
	}

	@Override
	public AlimentoDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(AlimentoDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public AlimentoDTO classToDTO(Alimento date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alimento DTOToClass(AlimentoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
