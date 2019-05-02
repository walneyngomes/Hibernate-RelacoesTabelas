package br.edu.unifacisa.bd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "estados")
public class Estado extends BaseEntity  {
	private String name;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Cidade> cidades = new ArrayList<Cidade>();

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
