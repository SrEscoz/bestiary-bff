package net.escoz.bestiarybff.controllers;

import net.escoz.bestiarybff.controllers.dtos.ErrorResponse;
import net.escoz.bestiarybff.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {NotFoundException.class})
	protected ResponseEntity<ErrorResponse> handleNotFoundException(Exception exception) {
		ErrorResponse response = ErrorResponse.builder()
				.timestamp(Instant.now().toString())
				.status(HttpStatus.NOT_FOUND.value())
				.error(exception.getMessage())
				.build();

		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(response);
	}

}