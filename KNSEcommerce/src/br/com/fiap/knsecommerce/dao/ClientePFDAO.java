/**
 * 
 */
package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

import br.com.fiap.knsecommerce.entity.ClientePF;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePFDAO extends DAO<ClientePF> implements I_DAO<ClientePF>{
	
	/**
	 * 
	 */
	public ArrayList<ClientePF> listar() {
		ArrayList<ClientePF> retorno = new ArrayList<ClientePF>();
		retorno.add(new ClientePF(7, "usuario5@users.com", "11 1111 2222", "João Bicudo", "111.222.333-44"));
		retorno.add(new ClientePF(9, "usuario7@users.com", "12 4455 9977", "Maria Bicudo", "324.456.897-55"));
		return retorno; 
	}
}
