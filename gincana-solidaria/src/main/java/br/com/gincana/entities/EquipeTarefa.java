package br.com.gincana.entities;

import javax.persistence.ManyToOne;

public class EquipeTarefa {

	@ManyToOne
	private Equipe equipe;
	
	@ManyToOne
	private Tarefa tarefa;
}
