/**
 * 
 */
package br.com.fiap.knsecommerce.test;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.dao.I_DAO;
import br.com.fiap.knsecommerce.dao.ProdutoDAO;
import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.Produto;

/**
 * @author Kaio Nylander
 *
 */
public class ProdutoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		I_DAO<Produto> dao = new ProdutoDAO();
		
		Produto objeto = new Produto(1, "Biscoito Globo", 1.5, 200, new Categoria(1, "Biscoito"), true);
		dao.inserir(objeto);

		objeto.setQuantidade((objeto.getQuantidade() - 1));
		dao.atualizar(objeto);
		
		dao.remover(objeto);
		
		System.out.println("Listando itens do banco de dados");
		ArrayList<Produto> objetosNoBd = dao.listar();	
		for (Produto obj : objetosNoBd) {
			System.out.println(obj);
		}
	}

}
