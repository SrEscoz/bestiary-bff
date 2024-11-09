package net.escoz.bestiarybff.controllers;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.controllers.dtos.CreatureOutDTO;
import net.escoz.bestiarybff.controllers.dtos.PaginatedResponse;
import net.escoz.bestiarybff.mappers.CreatureMapper;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.services.CreatureService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/creatures")
@AllArgsConstructor
public class CreatureController {

	private final CreatureService creatureService;
	private final CreatureMapper mapper;

	@GetMapping
	public ResponseEntity<PaginatedResponse<CreatureOutDTO>> getCreatures(@RequestParam(name = "page", defaultValue = "0") int page,
	                                                                      @RequestParam(name = "size", defaultValue = "15") int size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Creature> creatures = creatureService.getCreatures(pageable);
		PaginatedResponse<CreatureOutDTO> response = new PaginatedResponse<>(creatures.map(mapper::toDTO));

		return ResponseEntity
				.ok()
				.body(response);
	}

}
