package net.escoz.bestiarybff.exceptions;

public class ValidationException extends RuntimeException {
	public ValidationException(String fields) {
		super("Error validating " + fields + ", is / are in the request?");
	}
}
