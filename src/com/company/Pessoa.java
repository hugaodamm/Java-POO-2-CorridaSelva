package com.company;

public class Pessoa {

    private final String rg;
    private final String nome;
    private final String sobrenome;
    private final int idade;
    private final String telefone;
//    private final int nrEmergencia;
//    private final String grupoSanguineo;
    private double valorInscricao;

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

//    public int getNrEmergencia() {
//        return nrEmergencia;
//    }
//
//    public String getGrupoSanguineo() {
//        return grupoSanguineo;
//    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Pessoa(String rg, String nome, String sobrenome, String telefone, int idade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idade = idade;
//        this.nrEmergencia = nrEmergencia;
//        this.grupoSanguineo = grupoSanguineo;
//        this.valorInscricao = valorInscricao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
//                ", nrEmergencia=" + nrEmergencia +
//                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
