package br.jus.tjro.exercicio.repository;

import br.jus.tjro.exercicio.model.dto.UserDto;

public class UserRepository implements IUserRepository{

	@Override
	public UserDto getByUsername(String username) {
		// TODO Auto-generated method stub
		return new UserDto(username);
	}

}
