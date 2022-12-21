package br.edu.uffs.fabricio.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
//Torna classe disponível na camada de visão (html)
@Named
public class MeuNome {
	static private String MeuNome = "Fabricio";

	public String getMeuNome() {
		return MeuNome;
	}
}
