package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;

	// Métodos de acesso aos atributos
	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome válido! "
					+ "\nDeve conter pelo menos três letras");
		}

	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null,
					descricao + "não e um nome válido! \nDeve conter pelo menos dez letras");
		}
	}

	public String getDescriçao() {
		return descricao;
	}
}
