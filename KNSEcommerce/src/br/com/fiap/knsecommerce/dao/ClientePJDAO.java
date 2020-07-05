/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.ClientePJ;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePJDAO extends DAO<ClientePJ> implements I_DAO<ClientePJ>{
	
	/**
	 * 
	 */
	public ArrayList<ClientePJ> listar() {
		ArrayList<ClientePJ> retorno = new ArrayList<ClientePJ>();
		retorno.add(new ClientePJ(3, "usuario3@users.com", "11 3333 4444", "JB Importações", "11.222.333/0001-44", "986.414.359.669"));
		retorno.add(new ClientePJ(4, "usuario4@users.com", "11 5555 6666", "Orange Textil", "12.111.888/0001-17", "987.456.321.999"));
		return retorno; 
	}
}