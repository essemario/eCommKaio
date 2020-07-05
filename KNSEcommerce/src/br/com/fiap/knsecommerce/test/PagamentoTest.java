package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.dao.PagamentoDAO;
import br.com.fiap.knsecommerce.entity.Pagamento;

public class PagamentoTest {

	public static void main(String[] args) {
		I_DAO<Pagamento> dao = new PagamentoDAO();
		
		Pagamento objeto = new Pagamento(88, CalendarBuilder.getNowCalendar(), "Pendente", "Visa", "6547 2316 6574 2314", "798", CalendarBuilder.getCalendar(10, 5, 2022), "Ricardo Robson Antonio");
		dao.inserir(objeto);

		objeto.setStatus("Aprovado");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<Pagamento> objetosNoBd = dao.listar();	
		for (Pagamento obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
