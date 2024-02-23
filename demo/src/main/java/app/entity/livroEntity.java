package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class livroEntity {
	private String titulo;
	private String autor;
	private String editora;
	private String ano;
}