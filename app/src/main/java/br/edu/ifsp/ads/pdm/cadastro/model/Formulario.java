package br.edu.ifsp.ads.pdm.cadastro.model;

import androidx.annotation.NonNull;

public class Formulario {
    private final String nomeCompleto;
    private final String telefone;
    private final String email;
    private final Boolean emailLista;
    private final Genero genero;
    private final String cidade;
    private final String uf;

    public Formulario(String nomeCompleto, String telefone, String email, Boolean emailLista, Genero genero, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.emailLista = emailLista;
        this.genero = genero;
        this.cidade = cidade;
        this.uf = uf;
    }

    @NonNull
    @Override
    public String toString() {
        return "{\n" +
                "    \"nome_completo\": " + nomeCompleto + ",\n" +
                "    \"telefone\": " + telefone + ",\n" +
                "    \"email\": " + email + ",\n" +
                "    \"email_lista\": " + emailLista + ",\n" +
                "    \"gênero\": " + genero + ",\n" +
                "    \"cidade\": " + cidade + ",\n" +
                "    \"UF\": " + uf + "\n" +
                "}";
    }
}
