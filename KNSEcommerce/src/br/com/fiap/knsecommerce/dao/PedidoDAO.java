/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.Cliente;
import br.com.fiap.knsecommerce.entity.ClientePF;
import br.com.fiap.knsecommerce.entity.ClientePJ;
import br.com.fiap.knsecommerce.entity.ItemPedido;
import br.com.fiap.knsecommerce.entity.Pedido;
import br.com.fiap.knsecommerce.entity.Produto;
import br.com.fiap.knsecommerce.test.CalendarBuilder;

/**
 * @author Kaio Nylander
 *
 */
public class PedidoDAO extends DAO<Pedido> implements I_DAO<Pedido>{
	/**
	 * 
	 */
	public ArrayList<Pedido> listar() {
		ArrayList<Pedido> retorno = new ArrayList<Pedido>();
		
		ItemPedido ip1 = new ItemPedido();
		ItemPedido ip2 = new ItemPedido();
		
		ip1.setId(1);
		ip1.setProduto(new Produto(1, "Coca cola Lata", 4.2, 200, new Categoria(1, "Bebida"), false));
		ip1.setQuantidade(2);
		ip1.setValor((ip1.getQuantidade() * ip1.getProduto().getValor()));
		
		ip2.setId(2);
		ip2.setProduto(new Produto(2, "Pitchula Lata", 2.5, 250, new Categoria(1, "Refrigerante"), true));
		ip2.setQuantidade(1);
		ip2.setValor((ip2.getQuantidade() * ip2.getProduto().getValor()));
		
		Cliente cli1 = new ClientePJ(3, "usuario3@users.com", "11 3333 4444", "JB Importações", "11.222.333/0001-44", "986.414.359.669");
		Cliente cli2 = new ClientePF(9, "usuario7@users.com", "12 4455 9977", "Maria Bicudo", "324.456.897-55");

		retorno.add(new Pedido(1, 20123, CalendarBuilder.getNowCalendar(), CalendarBuilder.getCalendar(20, 12, 2020), CalendarBuilder.getCalendar(15, 12, 2020), 52.4, "Aprovado", cli1, ip1));
		retorno.add(new Pedido(4, 20135, CalendarBuilder.getNowCalendar(), CalendarBuilder.getCalendar(20, 8, 2020), CalendarBuilder.getCalendar(15, 11, 2020), 25.4, "Pendente", cli2, ip2));
		return retorno; 
	}
}
