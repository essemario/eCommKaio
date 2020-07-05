/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

import java.util.Calendar;

/**
 * @author Kaio Nylander
 *
 */
public class Pagamento {
	private int id;
	private Calendar data;
	private String status;
	
	private String bandeira;
	private String numeroCartao;
	private String codigoVerficacao;
	private Calendar validade;
	private String nomeImpresso;
	
	
	/**
	 * 
	 */
	public Pagamento() {
	}

	/**
	 * @param data
	 * @param status
	 * @param bandeira
	 * @param numeroCartao
	 * @param codigoVerficacao
	 * @param validade
	 * @param nomeImpresso
	 */
	public Pagamento(Calendar data, String status, String bandeira, String numeroCartao, String codigoVerficacao,
			Calendar validade, String nomeImpresso) {
		this.data = data;
		this.status = status;
		this.bandeira = bandeira;
		this.numeroCartao = numeroCartao;
		this.codigoVerficacao = codigoVerficacao;
		this.validade = validade;
		this.nomeImpresso = nomeImpresso;
	}

	/**
	 * @param id
	 * @param data
	 * @param status
	 * @param bandeira
	 * @param numeroCartao
	 * @param codigoVerficacao
	 * @param validade
	 * @param nomeImpresso
	 */
	public Pagamento(int id, Calendar data, String status, String bandeira, String numeroCartao,
			String codigoVerficacao, Calendar validade, String nomeImpresso) {
		this.id = id;
		this.data = data;
		this.status = status;
		this.bandeira = bandeira;
		this.numeroCartao = numeroCartao;
		this.codigoVerficacao = codigoVerficacao;
		this.validade = validade;
		this.nomeImpresso = nomeImpresso;
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
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the bandeira
	 */
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira the bandeira to set
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	/**
	 * @return the numeroCartao
	 */
	public String getNumeroCartao() {
		return numeroCartao;
	}
	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	/**
	 * @return the codigoVerficacao
	 */
	public String getCodigoVerficacao() {
		return codigoVerficacao;
	}
	/**
	 * @param codigoVerficacao the codigoVerficacao to set
	 */
	public void setCodigoVerficacao(String codigoVerficacao) {
		this.codigoVerficacao = codigoVerficacao;
	}
	/**
	 * @return the validade
	 */
	public Calendar getValidade() {
		return validade;
	}
	/**
	 * @param validade the validade to set
	 */
	public void setValidade(Calendar validade) {
		this.validade = validade;
	}
	/**
	 * @return the nomeImpresso
	 */
	public String getNomeImpresso() {
		return nomeImpresso;
	}
	/**
	 * @param nomeImpresso the nomeImpresso to set
	 */
	public void setNomeImpresso(String nomeImpresso) {
		this.nomeImpresso = nomeImpresso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pagamento [getId()=" + getId() + ", getData()=" + getData() + ", getStatus()=" + getStatus()
				+ ", getBandeira()=" + getBandeira() + ", getNumeroCartao()=" + getNumeroCartao()
				+ ", getCodigoVerficacao()=" + getCodigoVerficacao() + ", getValidade()=" + getValidade()
				+ ", getNomeImpresso()=" + getNomeImpresso() + "]";
	}
	
}
