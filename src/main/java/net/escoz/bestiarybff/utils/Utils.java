package net.escoz.bestiarybff.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class Utils {

	public static String getFieldErrors(BindingResult result) {
		return result.getFieldErrors().stream()
				.map(FieldError::getField)
				.toList()
				.toString();
	}
}
