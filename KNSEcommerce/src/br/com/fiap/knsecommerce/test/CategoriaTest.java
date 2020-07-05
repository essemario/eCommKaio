/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.CategoriaDAO;
import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.entity.Categoria;

/**
 * @author Kaio Nylander
 *
 */
public class CategoriaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<Categoria> dao = new CategoriaDAO();
		
		Categoria objeto = new Categoria(99, "Sabonetes");
		dao.inserir(objeto);

		objeto.setNome("Sabonete");
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<Categoria> objetosNoBd = dao.listar();	
		for (Categoria obj : objetosNoBd) {
			System.out.println(obj);
		}
	}
}
