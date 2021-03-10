package br.com.java.tratamento_excecoes;

/***
 * 
 * @author dionatan
 *
 */

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
