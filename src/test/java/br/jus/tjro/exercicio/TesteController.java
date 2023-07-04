package br.jus.tjro.exercicio;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import  br.jus.tjro.exercicio.controller.PilhaController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(PilhaController.class)
public class TesteController {

	 @Autowired
	    private MockMvc mockMvc;

	    @Test
	    @DisplayName("Se retorno status 200 para usuario")
	    public void testar_retorno_http200() throws Exception {
	        this.mockMvc.perform(MockMvcRequestBuilders.get("/pilha/usuario?id=1"))
	                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	    }
	    
	    @Test
	    @DisplayName("Se retorno status 400 para usuário")
	    public void testar_retorno_http400() throws Exception {
	        this.mockMvc.perform(MockMvcRequestBuilders.get("/pilha/usuario?id=0"))
	                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	    }

	    @Test
	    @DisplayName("Se retorno status 200 pilha")
	    public void testar_retorno_http200_pilha() throws Exception {
	        this.mockMvc.perform(MockMvcRequestBuilders.get("/pilha/pilha/15"))
	                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	    }

	    @Test
	    @DisplayName("Se retorno status 400 pilha")
	    public void testar_retorno_http400_pilha() throws Exception {
	        this.mockMvc.perform(MockMvcRequestBuilders.get("/pilha/pilha"))
	                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	    }
}
