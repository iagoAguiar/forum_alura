package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dot.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		Topico topico1 = new Topico("Dúvida", "Dúvida com React", new Curso("React", "Front end"));
		Topico topico2 = new Topico("Dúvida", "Dúvida com Python", new Curso("Data Science", "Data Science"));
		Topico topico3 = new Topico("Dúvida", "Dúvida com Javascript", new Curso("Javascript", "Programação"));
		
		

		return  TopicoDto.converter(Arrays.asList(topico, topico1, topico2));
		
	}

}
