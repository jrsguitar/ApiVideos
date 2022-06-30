package br.com.jrcode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Video {
	private long id;
	private String titulo;
	private String descricao;
	private String url;	
}
