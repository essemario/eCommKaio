package br.com.fiap.knsecommerce.test;

import java.util.Calendar;

public class CalendarBuilder {

	/**
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return Calendar
	 */
	public static Calendar getCalendar(int dia, int mes, int ano) {
		Calendar retorno = Calendar.getInstance();
		retorno.set(ano, mes, dia);
		return retorno;
	}
	
	/**
	 * @return Calendar
	 */
	public static Calendar getNowCalendar() {
		return Calendar.getInstance();
	}
	
}
