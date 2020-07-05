/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.dao.ItemPedidoDAO;
import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Produto;

/**
 * @author Kaio Nylander
 *
 */
public class ItemPedidoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<ItemPedido> dao = new ItemPedidoDAO();
		
		ItemPedido objeto = new ItemPedido();
		
		objeto.setId(1);
		objeto.setProduto(new Produto(1, "Coca cola Lata", 4.2, 200, new Categoria(1, "Bebida"), false));
		objeto.setQuantidade(2);
		objeto.setValor((objeto.getQuantidade() * objeto.getProduto().getValor()));
		
		dao.inserir(objeto);

		objeto.setQuantidade(1);
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<ItemPedido> objetosNoBd = dao.listar();	
		for (ItemPedido obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
