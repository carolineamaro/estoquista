package com.estoquista.modelo;

public class Fornecedor {
    private String nomeDaEmpresa;
    private String nomeDoVendedor;
    private String telefone;
    private String cnpf;

    public Fornecedor(String nomeDaEmpresa, String nomeDoVendedor, String telefone, String cnpf) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.nomeDoVendedor = nomeDoVendedor;
        this.telefone = telefone;
        this.cnpf = cnpf;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getNomeDoVendedor() {
        return nomeDoVendedor;
    }

    public void setNomeDoVendedor(String nomeDoVendedor) {
        this.nomeDoVendedor = nomeDoVendedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpf() {
        return cnpf;
    }

    public void setCnpf(String cnpf) {
        this.cnpf = cnpf;
    }
}