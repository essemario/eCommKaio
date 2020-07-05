/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.CarrinhoDAO;
import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.entity.Carrinho;
import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.ClientePF;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Pagamento;
import br.com.fiap.knsecommerce.entity.Produto;

/**
 * @author Kaio Nylander
 *
 */
public class CarrinhoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<Carrinho> dao = new CarrinhoDAO();
		
		Carrinho objeto = new Carrinho();
		ItemPedido ip1 = new ItemPedido();
		ItemPedido ip2 = new ItemPedido();
		Categoria cat1 = new Categoria();

		cat1.setId(1);
		cat1.setNome("Frutas");
		
		ip1.setId(1);
		ip1.setProduto(new Produto(1, "Tomate", 1.7, 1, cat1, false));
		ip1.setQuantidade(1);
		ip1.setValor((ip1.getQuantidade() * ip1.getProduto().getValor()));
		
		ip2.setId(2);
		ip2.setProduto(new Produto(2, "Maçã", 2.5, 7, cat1, false));
		ip2.setQuantidade(1);
		ip2.setValor((ip2.getQuantidade() * ip2.getProduto().getValor()));
				
		objeto.setId(123);
		objeto.setCliente(new ClientePF(1, "usuario1@users.com", "11 1111 2222", "João Bicudo", "111.222.333-44"));
		objeto.getItensPedido().add(ip1);
		objeto.getItensPedido().add(ip2);
		objeto.setPagamento(new Pagamento(1, CalendarBuilder.getNowCalendar(), "Aprovado", "Mastercard", "1234 5678 9101 1121", "123", CalendarBuilder.getCalendar(20, 10, 2025), "Joao Bicudo"));
		
		dao.inserir(objeto);

		objeto.getPagamento().setStatus("Aprovado");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<Carrinho> objetosNoBd = dao.listar();	
		for (Carrinho obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
