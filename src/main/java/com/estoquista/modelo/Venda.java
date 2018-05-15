package com.estoquista.modelo;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produto = new ArrayList<>();
    private Cliente cliente;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}