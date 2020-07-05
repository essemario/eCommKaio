/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Pagamento;
import br.com.fiap.knsecommerce.test.CalendarBuilder;

/**
 * @author Kaio Nylander
 *
 */
public class PagamentoDAO extends DAO<Pagamento> implements I_DAO<Pagamento>{
	
	/**
	 * 
	 */
	public ArrayList<Pagamento> listar() {
		ArrayList<Pagamento> retorno = new ArrayList<Pagamento>();
		retorno.add(new Pagamento(4, CalendarBuilder.getNowCalendar(), "Aprovado", "Mastercard", "1234 5678 9101 1121", "123", CalendarBuilder.getCalendar(20, 10, 2025), "Joao Bicudo"));
		retorno.add(new Pagamento(9, CalendarBuilder.getNowCalendar(), "Pendente", "Visa", "4564 7889 9541 3265", "777", CalendarBuilder.getCalendar(5, 4, 2024), "Cristina Bicudo"));
		return retorno; 
	}
}
