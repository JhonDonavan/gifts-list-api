package br.com.ListaPresentes.exceptions;

import com.mongodb.lang.NonNull;

public class GiftNotfoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5604689864625422951L;

	@NonNull
	private final String id;
	private String message;
	
	
	public GiftNotfoundException(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
