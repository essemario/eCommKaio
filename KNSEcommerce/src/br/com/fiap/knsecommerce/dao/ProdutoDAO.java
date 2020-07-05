/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Categoria;
import br.com.fiap.knsecommerce.entity.Produto;

/**
 * @author Kaio Nylander
 *
 */
public class ProdutoDAO extends DAO<Produto> implements I_DAO<Produto> {
	
	/**
	 * 
	 */
	public ArrayList<Produto> listar() {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		retorno.add(new Produto(22, "Coca cola Lata", 4.2, 200, new Categoria(9, "Bebidas"), false));
		retorno.add(new Produto(32, "Trakinas", 2.2, 170, new Categoria(17, "Biscoitos"), true));
		return retorno; 
	}
}
