package br.com.gincana.entities;

import javax.persistence.ManyToOne;

public class Membro {
	
	private String nome;
	
	private String numero_documento;
	
	@ManyToOne
	private Equipe equipe;
	
	private String email;
	
	private String celular;
	
	private Boolean presencaMissa;

}
