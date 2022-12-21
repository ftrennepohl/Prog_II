package br.edu.uffs.fabricio.controller;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//Torna classe disponível na camada de visão (html)
@Named
@RequestScoped
public class MeuNome {
	private String meuNome = "Fabricio";

	public String getMeuNome() {
		return meuNome;
	}

	public void setMeuNome(String meuNome) {
		this.meuNome = meuNome;
	}
}
