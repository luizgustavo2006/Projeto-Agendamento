package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
    
    private Integer codigo;
    private String nome;
    private String descricao;
    private static int contador = 99;
    
    // Construtores da classe
    public Especialidade() { // Construtor Default/Padrão
        this.nome = nome;
        gerarCodigo();
    }
    
    public void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }
    
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }

    // Métodos de acesso aos atributos

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
    
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
