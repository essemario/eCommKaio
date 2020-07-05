package br.com.fiap.knsecommerce.dao;

public abstract class DAO<T> {

	/**
	 * 
	 * @param objeto
	 * @return
	 */
	public T inserir(T objeto) {
		try {
			System.out.println("Inserido no banco >> " + objeto);
		} catch (Exception e) {
			System.out.println("ERRO AO INSERIR:" + e.getMessage());
		}
		return objeto;
	}
	
	/**
	 * 
	 * @param objeto
	 * @return
	 */
	public T atualizar(T objeto) {
		try {
			System.out.println("Atualizado no banco >>" + objeto);
		} catch (Exception e) {
			System.out.println("ERRO AO ATUALIZAR:" + e.getMessage());
		}
		return objeto;
	}
	
	/**
	 * 
	 * @param objeto
	 * @return
	 */
	public boolean remover(T objeto) {
		try {
			System.out.println("Removido do banco >> " + objeto);
		} catch (Exception e) {
			System.out.println("ERRO AO REMOVER:" + e.getMessage());
		}
		return true;
	}

}
