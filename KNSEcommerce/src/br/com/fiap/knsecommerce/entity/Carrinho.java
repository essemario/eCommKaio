/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

import java.util.ArrayList;

/**
 * @author Kaio Nylander
 *
 */
public class Carrinho {
	private int id;
	private ArrayList<ItemPedido> itensPedido;
	private Cliente cliente;
	private Pagamento pagamento;
	
	public Carrinho() {
	}
	/**
	 * @param itensPedido
	 * @param cliente
	 * @param pagamento
	 */
	public Carrinho(ArrayList<ItemPedido> itensPedido, Cliente cliente, Pagamento pagamento) {
		this.itensPedido = itensPedido;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}
	/**
	 * @param id
	 * @param itensPedido
	 * @param cliente
	 * @param pagamento
	 */
	public Carrinho(int id, ArrayList<ItemPedido> itensPedido, Cliente cliente, Pagamento pagamento) {
		this.id = id;
		this.itensPedido = itensPedido;
		this.cliente = cliente;
		this.pagamento = pagamento;
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
	 * @return the itensPedido
	 */
	public ArrayList<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	/**
	 * @param itensPedido the itensPedido to set
	 */
	public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the pagamento
	 */
	public Pagamento getPagamento() {
		return pagamento;
	}
	/**
	 * @param pagamento the pagamento to set
	 */
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carrinho [getId()=" + getId() + ", getItensPedido()=" + getItensPedido() + ", getCliente()="
				+ getCliente() + ", getPagamento()=" + getPagamento() + "]";
	}
}
