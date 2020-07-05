/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

/**
 * @author Kaio Nylander
 *
 */
public abstract class Cliente  {
	private int id;
	private String email;
	private String telefone;
	
	public Cliente(String email, String telefone) {
		this.email = email;
		this.telefone = telefone;
	}
	
	public Cliente() {
	}

	public Cliente(int id, String email, String telefone) {
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
