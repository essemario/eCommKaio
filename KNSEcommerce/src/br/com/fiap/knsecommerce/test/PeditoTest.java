/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.dao.PedidoDAO;
import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.ClientePF;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Pedido;
import br.com.fiap.knsecommerce.entity.Produto;

/**
 * @author Kaio Nylander
 *
 */
public class PeditoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<Pedido> dao = new PedidoDAO();
		
		Pedido objeto = new Pedido(12, 20565, CalendarBuilder.getNowCalendar(), CalendarBuilder.getCalendar(10, 12, 2020), CalendarBuilder.getCalendar(5, 12, 2020), 52.4, "Pendente", new ClientePF(17, "cidadao@cidade.com.br", "22 3245 6789", "Cidadão de Bem", "654.987.321.01"), new ItemPedido(45, 52, 5, new Produto(88, "Picanha Bassi", 110.4, 2, new Categoria(22, "Açougue"), true)));
		dao.inserir(objeto);

		objeto.setStatus("Aprovado");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<Pedido> objetosNoBd = dao.listar();	
		for (Pedido obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
