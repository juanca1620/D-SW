package Service;

import DTO.UserDTO;
import Model.Usuario;
import Repository.UserRepository;

public class UserService implements ISERVICE<UserDTO, Usuario>{
	
	private UserRepository repo = new UserRepository();
	@Override
	public boolean save(UserDTO dto) {
		return repo.save(dto);
	}

	@Override
	public UserDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(UserDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public UserDTO classToDTO(Usuario date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario DTOToClass(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
