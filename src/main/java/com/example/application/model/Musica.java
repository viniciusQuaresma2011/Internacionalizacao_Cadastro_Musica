package com.example.application.model;

public class Musica {

	private Long id;
	
	private String titulo;
	private String autor_letra;
	private String autor_musica;
	private String interprete;
	private String qtde;
	private String biografia;
	
	
	public Musica(String biografia) {
		super();
		this.biografia = biografia;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public Musica() {
		super();
	}
	public Musica(Long id, String titulo, String autor_letra, String autor_musica, String interprete,
			String qtde) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor_letra = autor_letra;
		this.autor_musica = autor_musica;
		this.interprete = interprete;
		this.qtde = qtde;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor_letra() {
		return autor_letra;
	}
	public void setAutor_letra(String autor_letra) {
		this.autor_letra = autor_letra;
	}
	public String getAutor_musica() {
		return autor_musica;
	}
	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public String getQtde() {
		return qtde;
	}
	public void setQtde(String qtde) {
		this.qtde = qtde;
	}
	
	
	
	
}
