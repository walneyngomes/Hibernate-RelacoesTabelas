package br.edu.unifacisa.bd;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cidade cidades = new Cidade();
		Estado estados = new Estado();
		estados.setName("PB");
		estados.getCidades().add(cidades);
		cidades.setEstado(estados);
		cidades.setNome("Campina Grande");

		Produto produto = new Produto();

		produto.setDescricao("");
		produto.setData_inicio(new Date());
		produto.setData_termino(new Date());
		produto.setNome("ney");

		Fabricante fabri = new Fabricante();
		fabri.setcnpj("BarDoCucCU");
		fabri.setNome("");

		produto.getfabricantes().add(fabri);
		fabri.getProdutos().add(produto);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo_persistencia");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		manager.persist(produto);
		manager.persist(estados);
		manager.persist(cidades);
		manager.persist(fabri);

		manager.getTransaction().commit();
		System.out.println("COMMIT COM ");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++");

		System.out.println("SUCESSO");
		manager.close();
		factory.close();

	}

}
