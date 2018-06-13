package Fachada;

import java.util.ArrayList;

import Repositorio.Conta;
import Repositorio.Garcom;
import Repositorio.Mesa;
import Repositorio.Produto;

public class Controller {
	
	public void addGarcom(Garcom g) {
		this.garcons.add(g);
	}
	
	public void removeGarcom(Garcom g){
		this.garcons.remove(g);
	}	
	
	public Garcom buscarGarcom(String apelido) {
		for(Garcom c:garcons) {
			if(c.getApelido().equals(apelido)) {
				return c;
			}
		}
		return null;
	}
	
	public void addConta(Conta c) {
		this.contas.add(c);
	}
	
	public void removeConta(Conta c) {
		this.contas.remove(c);
	}
	
	public Conta buscarConta(int id) {
		for(Conta c:contas) {
			if(c.getNumero()==id) {
				return c;
			}
		}
		return null;
	}
	
	public void addMesa(Mesa m) {
		this.mesas.add(m);
	}
	
	public void removeMesa(Mesa m) {
		this.mesas.remove(m);
	}
	
	public Mesa buscarMesa(int id) {
		for(Mesa m:mesas) {
			if(m.getId()==id) {
				return m;
			}
		}
		return null;
	}
	
	public void addProduto(Produto p){
		this.produtos.add(p);
	}
	
	public void removeProduto(Produto p) {
		this.produtos.remove(p);
	}
	
	public Produto buscarProduto(String nome) {
		for(Produto p:produtos) {
			if(p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}
	
	//adiciona os metodos dele, construtor, to string, get, set...
}
