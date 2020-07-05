/**
 * 
 */
package br.com.fiap.knsecommerce.entity;

import java.util.Calendar;

/**
 * @author Kaio Nylander
 *
 */
public class Pedido {
	private int id;
	private int numero;
	private Calendar data;
	private Calendar previsaoEntrega;
	private Calendar dataEnvio;
	private double frete;
	private String status;
	
	private Cliente cliente;
	private ItemPedido itemPedido;
	
	/**
	 * 
	 */
	public Pedido() {
	}
	
	/**
	 * @param numero
	 * @param data
	 * @param previsaoEntrega
	 * @param dataEnvio
	 * @param frete
	 * @param status
	 * @param cliente
	 * @param itemPedido
	 */
	public Pedido(int numero, Calendar data, Calendar previsaoEntrega, Calendar dataEnvio, double frete, String status,
			Cliente cliente, ItemPedido itemPedido) {
		this.numero = numero;
		this.data = data;
		this.previsaoEntrega = previsaoEntrega;
		this.dataEnvio = dataEnvio;
		this.frete = frete;
		this.status = status;
		this.cliente = cliente;
		this.itemPedido = itemPedido;
	}
	/**
	 * @param id
	 * @param numero
	 * @param data
	 * @param previsaoEntrega
	 * @param dataEnvio
	 * @param frete
	 * @param status
	 * @param cliente
	 * @param itemPedido
	 */
	public Pedido(int id, int numero, Calendar data, Calendar previsaoEntrega, Calendar dataEnvio, double frete,
			String status, Cliente cliente, ItemPedido itemPedido) {
		this.id = id;
		this.numero = numero;
		this.data = data;
		this.previsaoEntrega = previsaoEntrega;
		this.dataEnvio = dataEnvio;
		this.frete = frete;
		this.status = status;
		this.cliente = cliente;
		this.itemPedido = itemPedido;
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
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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
	 * @return the previsaoEntrega
	 */
	public Calendar getPrevisaoEntrega() {
		return previsaoEntrega;
	}
	/**
	 * @param previsaoEntrega the previsaoEntrega to set
	 */
	public void setPrevisaoEntrega(Calendar previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}
	/**
	 * @return the dataEnvio
	 */
	public Calendar getDataEnvio() {
		return dataEnvio;
	}
	/**
	 * @param dataEnvio the dataEnvio to set
	 */
	public void setDataEnvio(Calendar dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	/**
	 * @return the frete
	 */
	public double getFrete() {
		return frete;
	}
	/**
	 * @param frete the frete to set
	 */
	public void setFrete(double frete) {
		this.frete = frete;
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
	 * @return the itemPedido
	 */
	public ItemPedido getItemPedido() {
		return itemPedido;
	}
	/**
	 * @param itemPedido the itemPedido to set
	 */
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pedido [getId()=" + getId() + ", getNumero()=" + getNumero() + ", getData()=" + getData()
				+ ", getPrevisaoEntrega()=" + getPrevisaoEntrega() + ", getDataEnvio()=" + getDataEnvio()
				+ ", getFrete()=" + getFrete() + ", getStatus()=" + getStatus() + ", getCliente()=" + getCliente()
				+ ", getItemPedido()=" + getItemPedido() + "]";
	}
}
