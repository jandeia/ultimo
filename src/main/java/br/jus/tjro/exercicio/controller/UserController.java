package br.jus.tjro.exercicio.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tjro.exercicio.api.LoginRequest;
import br.jus.tjro.exercicio.helper.PasswordHelper;
import br.jus.tjro.exercicio.model.dto.UserDto;
import br.jus.tjro.exercicio.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserRepository userRepository;

	@PostMapping("/login")
	public HttpStatus login(LoginRequest request) throws NoSuchAlgorithmException {
		if(!request.isValid()) {
            return HttpStatus.BAD_REQUEST;
		}
		UserDto user = userRepository.getByUsername(request.getLogin());
		if (user == null || PasswordHelper.hash(request.getSenha()).equals(user.getPassword())) {
			return HttpStatus.UNAUTHORIZED;
		}
		return HttpStatus.OK;
	}

}
