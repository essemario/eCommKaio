/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

/**
 * @author Kaio Nylander
 *
 */
public class ClientePJ extends Cliente{
	private String razaoSocial;
	private String CNPJ;
	private String inscricaoEstadual;
	
	/**
	 * 
	 */
	public ClientePJ() {
		super();
	}

	/**
	 * @param id
	 * @param email
	 * @param telefone
	 */
	public ClientePJ(int id, String email, String telefone) {
		super(id, email, telefone);
	}

	/**
	 * @param email
	 * @param telefone
	 */
	public ClientePJ(String email, String telefone) {
		super(email, telefone);
	}

	/**
	 * @param email
	 * @param telefone
	 * @param razaoSocial
	 * @param cNPJ
	 * @param inscricaoEstadual
	 */
	public ClientePJ(String email, String telefone, String razaoSocial, String cNPJ, String inscricaoEstadual) {
		super(email, telefone);
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	/**
	 * @param id
	 * @param email
	 * @param telefone
	 * @param razaoSocial
	 * @param cNPJ
	 * @param inscricaoEstadual
	 */
	public ClientePJ(int id, String email, String telefone, String razaoSocial, String cNPJ, String inscricaoEstadual) {
		super(id, email, telefone);
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	/**
	 * @return the cNPJ
	 */
	public String getCNPJ() {
		return CNPJ;
	}
	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientePJ [getRazaoSocial()=" + getRazaoSocial() + ", getCNPJ()=" + getCNPJ()
				+ ", getInscricaoEstadual()=" + getInscricaoEstadual() + "]";
	}
}
