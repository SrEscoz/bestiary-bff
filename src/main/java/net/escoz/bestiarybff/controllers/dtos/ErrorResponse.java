package net.escoz.bestiarybff.controllers.dtos;

import lombok.Builder;

@Builder
public record ErrorResponse(String timestamp, int status, String error) {
}