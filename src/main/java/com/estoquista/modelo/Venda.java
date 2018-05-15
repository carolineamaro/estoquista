package com.estoquista.modelo;

import com.estoquista.servicos.EnviadorDeEmail;
import java.util.ArrayList;

public class Venda {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private Cliente cliente;
    private EnviadorDeEmail enviadorDeEmail;

    public Venda(Cliente cliente, ArrayList<Produto> listaProdutos, EnviadorDeEmail enviadorDeEmail) {
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.enviadorDeEmail = enviadorDeEmail;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean realizarVenda() {
        for (Produto produto : this.listaProdutos) {
            int quantidadeModificada = produto.getQuantidade() - 1;
            produto.setQuantidade(quantidadeModificada);
        }
        
        this.enviadorDeEmail.envia(this.cliente.getEmail(), "Sua nota fiscal para o CPF" + this.cliente.getCpf());
        
        
        return true;
    }
}
