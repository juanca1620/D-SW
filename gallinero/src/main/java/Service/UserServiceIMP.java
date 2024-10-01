package Service;

import DTO.UserDTO;
import Repository.UserRepositoryIMP;

public class UserServiceIMP implements UserService<UserDTO>{
	
	private UserRepositoryIMP repo = new UserRepositoryIMP();
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
}
