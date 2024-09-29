package Service;

import DTO.VentaDTO;
import Model.Venta;
import Repository.VentaRepository;

public class VentaService implements ISERVICE<VentaDTO, Venta>{
	
	private VentaRepository repo = new VentaRepository();
	@Override
	public boolean save(VentaDTO dto) {
		return repo.save(dto);
	}

	@Override
	public VentaDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(VentaDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return deleteById(id);
	}

	@Override
	public VentaDTO classToDTO(Venta date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta DTOToClass(VentaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
