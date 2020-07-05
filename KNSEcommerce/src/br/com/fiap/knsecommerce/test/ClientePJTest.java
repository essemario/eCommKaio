/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.ClientePJDAO;
import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.entity.ClientePJ;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePJTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<ClientePJ> dao = new ClientePJDAO();
		
		ClientePJ objeto = new ClientePJ(95, "empresa@megasite.com", "88 6547 9876", "Mega Empresa LTDA", "65.789.321/0001-78", "2315679833");
		dao.inserir(objeto);

		objeto.setInscricaoEstadual("987564321");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<ClientePJ> objetosNoBd = dao.listar();	
		for (ClientePJ obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
