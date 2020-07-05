/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

/**
 * @author Kaio Nylander
 *
 */
public class ItemPedido {
	private int id;
	private double valor;
	private int quantidade;
	private Produto produto;
	
	/**
	 * 
	 */
	public ItemPedido() {
	}

	/**
	 * @param valor
	 * @param quantidade
	 * @param produto
	 */
	public ItemPedido(double valor, int quantidade, Produto produto) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	/**
	 * @param id
	 * @param valor
	 * @param quantidade
	 * @param produto
	 */
	public ItemPedido(int id, double valor, int quantidade, Produto produto) {
		this.id = id;
		this.valor = valor;
		this.quantidade = quantidade;
		this.produto = produto;
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
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemPedido [getId()=" + getId() + ", getValor()=" + getValor() + ", getQuantidade()=" + getQuantidade()
				+ ", getProduto()=" + getProduto() + "]";
	}
}
