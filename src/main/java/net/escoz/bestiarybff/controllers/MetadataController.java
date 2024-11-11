package net.escoz.bestiarybff.controllers;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.controllers.dtos.responses.MetadataOutDTO;
import net.escoz.bestiarybff.mappers.MetadataMapper;
import net.escoz.bestiarybff.models.Aligment;
import net.escoz.bestiarybff.models.Type;
import net.escoz.bestiarybff.services.MetadataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/metadata")
public class MetadataController {

	private final MetadataService metadataService;
	private final MetadataMapper mapper;

	@GetMapping
	public ResponseEntity<MetadataOutDTO> getMetadata() {
		List<Aligment> aligments = metadataService.getAligments();
		List<Type> types = metadataService.getTypes();

		return ResponseEntity
				.ok()
				.body(mapper.toDTO(aligments, types));
	}

}
