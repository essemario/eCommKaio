package br.com.fiap.knsecommerce.entity;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePF extends Cliente {
	private String nome;
	private String CPF;

	/**
	 * 
	 */
	public ClientePF() {
		super();
	}

	/**
	 * @param email
	 * @param telefone
	 */
	public ClientePF(String email, String telefone) {
		super(email, telefone);
	}
	
	/**
	 * @param id
	 * @param email
	 * @param telefone
	 */
	public ClientePF(int id, String email, String telefone) {
		super(id, email, telefone);
	}
	
	/**
	 * @param email
	 * @param telefone
	 * @param nome
	 * @param cPF
	 */
	public ClientePF(String email, String telefone, String nome, String cPF) {
		super(email, telefone);
		this.nome = nome;
		CPF = cPF;
	}
	
	/**
	 * @param id
	 * @param email
	 * @param telefone
	 * @param nome
	 * @param cPF
	 */
	public ClientePF(int id, String email, String telefone, String nome, String cPF) {
		super(id, email, telefone);
		this.nome = nome;
		CPF = cPF;
	}

	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cPF
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientePF [getNome()=" + getNome() + ", getCPF()=" + getCPF() + "]";
	}
}
