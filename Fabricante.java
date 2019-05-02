package br.edu.unifacisa.bd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricante extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cnpj;

	// MESMO NAO EXISTINDO produto_fabricante, JA ESTA LA, <<-TODAVIA
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "produto_fabricante", joinColumns = {
			@JoinColumn(name = "id_fabricante", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_produto", referencedColumnName = "id", nullable = false) })
	private List<Produto> produtos = new ArrayList<Produto>();
	
	@OneToOne
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
