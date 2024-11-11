package net.escoz.bestiarybff.controllers.dtos;

public record BasicResponse(int status, String message) {

	public BasicResponse(String message) {
		this(200, message);
	}

}
