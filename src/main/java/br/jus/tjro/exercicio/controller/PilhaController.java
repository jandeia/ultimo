package br.jus.tjro.exercicio.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import br.jus.tjro.exercicio.model.Pilha;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pilha")
@RequiredArgsConstructor
public class PilhaController {

	@GetMapping("usuario")
    public String getUsuario(@RequestParam Integer id){
        if (id == null || id == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id da pesquisa não informado.");
        }
        if(id == 2) {
        	return "Usuário da pilha";
        }
        return null;
    }

    @GetMapping("/pilha/{valor}")
    public String getFizz(@PathVariable Integer valor){
        Pilha pilha = new Pilha(valor);
        return pilha.toString();
    }
    
}
