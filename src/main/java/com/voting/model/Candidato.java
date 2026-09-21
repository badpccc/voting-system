package com.voting.model;

public class Candidato {
    private Long id;
    private String nome;
    private int numero;

    public Candidato(){
    }

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Candidato(Long id, String nome, int numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Long getid() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}