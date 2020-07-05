/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

/**
 * @author Kaio Nylander
 *
 */
public class Produto {
	private int id;
	private String nome;
	private double valor;
	private int quantidade;
	private Categoria categoria;
	private boolean vitrine;
	
	/**
	 * 
	 */
	public Produto() {
	}
	
	/**
	 * @param nome
	 * @param valor
	 * @param quantidade
	 * @param categoria
	 * @param vitrine
	 */
	public Produto(String nome, double valor, int quantidade, Categoria categoria, boolean vitrine) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.vitrine = vitrine;
	}
	/**
	 * @param id
	 * @param nome
	 * @param valor
	 * @param quantidade
	 * @param categoria
	 * @param vitrine
	 */
	public Produto(int id, String nome, double valor, int quantidade, Categoria categoria, boolean vitrine) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.vitrine = vitrine;
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
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the vitrine
	 */
	public boolean isVitrine() {
		return vitrine;
	}
	/**
	 * @param vitrine the vitrine to set
	 */
	public void setVitrine(boolean vitrine) {
		this.vitrine = vitrine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produto [getId()=" + getId() + ", getNome()=" + getNome() + ", getValor()=" + getValor()
				+ ", getQuantidade()=" + getQuantidade() + ", getCategoria()=" + getCategoria() + ", isVitrine()="
				+ isVitrine() + "]";
	}
}
