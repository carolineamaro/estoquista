package com.estoquista.modelo;

public class Fornecedor {
    private String nomeDaEmpresa;
    private String nomeDoVendedor;
    private String telefone;
    private String cnpf;
    private String produto;

    public Fornecedor(String nomeDaEmpresa, String nomeDoVendedor, String telefone, String cnpf, String produto) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.nomeDoVendedor = nomeDoVendedor;
        this.telefone = telefone;
        this.cnpf = cnpf;
        this.produto = produto;
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}