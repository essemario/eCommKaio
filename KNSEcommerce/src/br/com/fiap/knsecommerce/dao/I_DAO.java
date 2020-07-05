package br.com.fiap.knsecommerce.dao;

import java.util.ArrayList;

public interface I_DAO <T> {
	
	T inserir(T model);
	T atualizar(T model);
	boolean remover(T model);
	ArrayList<T> listar();
}