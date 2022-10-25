package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlanoDeSaude {

    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private Integer codigo;
    private static int contador = 99;


    public PlanoDeSaude() {
        gerarCodigo();
    }

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        gerarCodigo();
    }
    
    
    public PlanoDeSaude(String operadora, String numero, String categoria, LocalDate validade) {
        this.operadora = operadora;
        this.numero = numero;
        this.categoria = categoria;
        this.validade = validade;
        gerarCodigo();
    }
    
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }




}
