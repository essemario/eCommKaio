/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Carrinho;
import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.ClientePF;
import br.com.fiap.knsecommerce.entity.ClientePJ;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Pagamento;
import br.com.fiap.knsecommerce.entity.Produto;
import br.com.fiap.knsecommerce.test.CalendarBuilder;

/**
 * @author Kaio Nylander
 *
 */
public class CarrinhoDAO extends DAO<Carrinho> implements I_DAO<Carrinho>{

	/**
	 * 
	 */
	public ArrayList<Carrinho> listar() {
		ArrayList<Carrinho> retorno = new ArrayList<Carrinho>();
		
		Carrinho car1 = new Carrinho();
		ItemPedido ip1 = new ItemPedido();
		ItemPedido ip2 = new ItemPedido();
		Categoria cat1 = new Categoria();

		cat1.setId(1);
		cat1.setNome("Bebidas");
		
		ip1.setId(1);
		ip1.setProduto(new Produto(1, "Coca cola Lata", 4.2, 200, cat1, false));
		ip1.setQuantidade(2);
		ip1.setValor((ip1.getQuantidade() * ip1.getProduto().getValor()));
		
		ip2.setId(2);
		ip2.setProduto(new Produto(2, "Pitchula Lata", 2.5, 250, cat1, true));
		ip2.setQuantidade(1);
		ip2.setValor((ip2.getQuantidade() * ip2.getProduto().getValor()));
				
		car1.setId(1);
		car1.setCliente(new ClientePF(1, "usuario1@users.com", "11 1111 2222", "João Bicudo", "111.222.333-44"));
		car1.getItensPedido().add(ip1);
		car1.getItensPedido().add(ip2);
		car1.setPagamento(new Pagamento(1, CalendarBuilder.getNowCalendar(), "Aprovado", "Mastercard", "1234 5678 9101 1121", "123", CalendarBuilder.getCalendar(20, 10, 2025), "Joao Bicudo"));
		
		// ===============
		
		Carrinho car2 = new Carrinho();
		
		ItemPedido ip3 = new ItemPedido();
		ItemPedido ip4 = new ItemPedido();
		Categoria cat2 = new Categoria();

		cat2.setId(2);
		cat2.setNome("Doces");
		
		ip3.setId(31);
		ip3.setProduto(new Produto(3, "Laka 250mg", 12.2, 120, cat2, true));
		ip3.setQuantidade(3);
		ip3.setValor((ip3.getQuantidade() * ip3.getProduto().getValor()));
		
		ip4.setId(2);
		ip4.setProduto(new Produto(4, "Biscoito Trackinas - Morango", 4.3, 720, cat2, false));
		ip4.setQuantidade(5);
		ip4.setValor((ip4.getQuantidade() * ip4.getProduto().getValor()));
		
		car2.setId(2);
		car2.setCliente(new ClientePJ(2, "usuario1@users.com", "11 1111 2222", "JB Importações", "11.222.333/0001-44", "986.414.359.669"));
		car2.getItensPedido().add(ip3);
		car2.getItensPedido().add(ip4);
		car2.setPagamento(new Pagamento(2, CalendarBuilder.getNowCalendar(), "Pendente", "Visa", "4564 7889 9541 3265", "777", CalendarBuilder.getCalendar(5, 4, 2024), "Cristina Bicudo"));
		
		retorno.add(car1);
		retorno.add(car2);
		
		return retorno;
	}
}
