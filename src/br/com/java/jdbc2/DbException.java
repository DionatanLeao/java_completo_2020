package br.com.java.jdbc2;

/***
 * 
 * @author dionatan
 *
 */

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}

}
