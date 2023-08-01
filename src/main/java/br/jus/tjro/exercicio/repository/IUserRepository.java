package br.jus.tjro.exercicio.repository;

import br.jus.tjro.exercicio.model.dto.UserDto;

public interface IUserRepository {

	public UserDto getByUsername(String username);
}
