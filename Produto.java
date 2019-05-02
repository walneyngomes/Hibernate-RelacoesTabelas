package br.edu.unifacisa.bd;

import java.io.Serializable; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
  

@Entity
@Table(name = "produtos")
public class Produto  extends BaseEntity {

	
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date data_inicio;
	@Temporal(TemporalType.DATE)
	private Date data_termino;
	private String descricao;

	@ManyToMany
	
	private List<Fabricante> fabricantes = new ArrayList<Fabricante>();

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_termino() {
		return data_termino;
	}

	public void setData_termino(Date data_termino) {
		this.data_termino = data_termino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Fabricante> getfabricantes() {
		return fabricantes;
	}

	public void setfabricantes(List<Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}

}
