/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.ClientePFDAO;
import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.entity.ClientePF;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<ClientePF> dao = new ClientePFDAO();
		
		ClientePF objeto = new ClientePF(88, "user@site.com", "+55 11 3209 9875", "João Ganildo", "654.658.789-99");
		dao.inserir(objeto);

		objeto.setTelefone("11 6547 9856");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<ClientePF> objetosNoBd = dao.listar();	
		for (ClientePF obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
