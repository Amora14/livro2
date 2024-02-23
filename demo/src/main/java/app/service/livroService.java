package app.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import app.entity.livroEntity;

@Service
public class livroService {

private List<livroEntity> lista = new ArrayList<>();
	
	public String save(livroEntity livro) {
		lista.add(livro);
		return "Salvo com sucesso!";
	}
	
	public List<livroEntity> listAll() {
        return this.lista;
	}
	
	public String delete(livroEntity livro) {
		lista.remove(livro);
		return "Excluído com sucesso!";
	}
	
	public String put(livroEntity livro) {
		var index = lista.indexOf(livro); 
		
		this.lista.set(index, livro);

		return "Atualizado com sucesso!";
	}
	
}
