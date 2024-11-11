package net.escoz.bestiarybff.controllers;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.controllers.dtos.responses.AlignmentOutDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.MetadataOutDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.TypeOutDTO;
import net.escoz.bestiarybff.mappers.MetadataMapper;
import net.escoz.bestiarybff.models.Alignment;
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


	@GetMapping("/alignments")
	public ResponseEntity<List<AlignmentOutDTO>> getAlignments() {
		List<Alignment> alignments = metadataService.getAligments();

		return ResponseEntity
				.ok()
				.body(mapper.toAlignmentDTO(alignments));
	}

	@GetMapping("/types")
	public ResponseEntity<List<TypeOutDTO>> getTypes() {
		List<Type> types = metadataService.getTypes();

		return ResponseEntity
				.ok()
				.body(mapper.toTypeDTO(types));
	}

	@GetMapping
	public ResponseEntity<MetadataOutDTO> getMetadata() {
		List<Alignment> aligments = metadataService.getAligments();
		List<Type> types = metadataService.getTypes();

		return ResponseEntity
				.ok()
				.body(mapper.toMetadataDTO(aligments, types));
	}

}
