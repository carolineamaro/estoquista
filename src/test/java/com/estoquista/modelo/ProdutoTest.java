/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoquista.modelo;

import com.estoquista.servicos.EnviadorDeEmail;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Caroline
 */
public class ProdutoTest {

    public ProdutoTest() {
    }

    @Test
    public void testProduto() {
        Fornecedor fornecedor = new Fornecedor("Brinquedos e Cia", "Carlao", "9990-0000", "12346789");
        Produto produto = new Produto("boneca", 30.0, 1, fornecedor);

        assertEquals("Brinquedos e Cia", produto.getFornecedor().getNomeDaEmpresa());
        assertEquals("Carlao", produto.getFornecedor().getNomeDoVendedor());
        assertEquals("9990-0000", produto.getFornecedor().getTelefone());
        assertEquals("12346789", produto.getFornecedor().getCnpf());
        assertEquals("boneca", produto.getNome());
        assertEquals(30.0, produto.getValor(), 0.001);
        assertEquals(1, produto.getQuantidade());
    }

    @Test
    public void testRealizarVenda() {
        Fornecedor fornecedor = new Fornecedor("Brinquedos e Cia", "Carlao", "9990-0000", "12346789");
        Produto produto1 = new Produto("boneca", 30.0, 4, fornecedor);
        Produto produto2 = new Produto("carrinho", 10.0, 2, fornecedor);
        
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        
        Cliente cliente = new Cliente("Fabricio Oliveira", "Rua piaui - 300", "41749519243", "993512737", "fabricio.chatinho@gmail.com");
        
        EnviadorDeEmail enviadorDeEmailMock = mock(EnviadorDeEmail.class);
        Venda venda = new Venda(cliente, listaDeProdutos, enviadorDeEmailMock);
        
        boolean statusDaVenda = venda.realizarVenda();
        
        assertTrue(statusDaVenda);
        assertEquals(3, produto1.getQuantidade());
        assertEquals(1, produto2.getQuantidade());
        
    }
}
