package app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.livroEntity;
import app.service.livroService;

@RestController
@RequestMapping("/api/livroEntity")
public class livroController {

	@Autowired
	private livroService livroService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody livroEntity livro) {
		try {
			String mensagem = this.livroService.save(livro);
			return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);
		} catch (Exception ex) {
			return new ResponseEntity<String>("ERRO! " + ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/listAll")
	public ResponseEntity<List<livroEntity>> listAll() {
		try {
			List<livroEntity> list = this.livroService.listAll();
			return new ResponseEntity<List<livroEntity>>(list, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<List<livroEntity>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody livroEntity livro) {
		try {
			String message = this.livroService.delete(livro);
			return new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/put")
	public ResponseEntity<String> put(@RequestBody livroEntity livro) {
		try {
			String message = this.livroService.put(livro);
			return new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
