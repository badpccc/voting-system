package model;

public class Eleitor {
    private long id;
    private String nome;
    private String cpf;
    private boolean votou;

    public Eleitor() {
    }

    public Eleitor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.votou = false;
    }

    public Eleitor(Long id, String nome, String cpf, boolean votou){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.votou = votou;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isVotou() {
        return votou;
    }

    public void setVotou(boolean votou) {
        this.votou = votou;
    }
}