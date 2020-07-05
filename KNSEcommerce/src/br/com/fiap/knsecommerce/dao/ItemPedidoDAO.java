package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Produto;

public class ItemPedidoDAO extends DAO<ItemPedido> implements I_DAO<ItemPedido>{
	
	/**
	 * 
	 */
	public ArrayList<ItemPedido> listar() {
		ArrayList<ItemPedido> retorno = new ArrayList<ItemPedido>();
		
		ItemPedido ip1 = new ItemPedido();
		ItemPedido ip2 = new ItemPedido();
		
		ip1.setId(1);
		ip1.setProduto(new Produto(1, "Coca cola Lata", 4.2, 200, new Categoria(1, "Bebida"), false));
		ip1.setQuantidade(2);
		ip1.setValor((ip1.getQuantidade() * ip1.getProduto().getValor()));
		
		ip2.setId(2);
		ip2.setProduto(new Produto(2, "Trakinas", 2.5, 250, new Categoria(2, "Biscoito"), true));
		ip2.setQuantidade(1);
		ip2.setValor((ip2.getQuantidade() * ip2.getProduto().getValor()));
		
		retorno.add(ip1);
		retorno.add(ip2);
		return retorno; 
	}
}
