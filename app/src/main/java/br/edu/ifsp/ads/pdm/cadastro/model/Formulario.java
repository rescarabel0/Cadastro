package br.edu.ifsp.ads.pdm.cadastro.model;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private Boolean emailLista;
    private int genero;
    private String cidade;
    private String uf;

    public Formulario(String nomeCompleto, String telefone, String email, Boolean emailLista, int genero, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.emailLista = emailLista;
        this.genero = genero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Formulario() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getEmailLista() {
        return emailLista;
    }

    public int getGenero() {
        return genero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
