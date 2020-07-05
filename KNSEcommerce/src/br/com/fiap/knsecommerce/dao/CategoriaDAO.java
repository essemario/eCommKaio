package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.Categoria;

/**
 * @author Kaio Nylander
 *
 */
public class CategoriaDAO extends DAO<Categoria> implements I_DAO<Categoria>{

	/**
	 * 
	 */
	public ArrayList<Categoria> listar() {
		ArrayList<Categoria> retorno = new ArrayList<Categoria>();
		
		retorno.add(new Categoria(1, "Bebidas"));
		retorno.add(new Categoria(2, "Biscoitos"));
		
		return retorno;
	}

}
