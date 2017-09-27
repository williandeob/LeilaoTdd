package tacs.leilaotdd.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leilao {
	
	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		super();
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public void propoe(Lance lance) {
		lances.add(lance);
	}
	
	
}
