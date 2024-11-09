package net.escoz.bestiarybff.controllers;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.mappers.CreatureMapper;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.services.CreatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/creatures")
@AllArgsConstructor
public class CreatureController {

	private final CreatureService creatureService;
	private final CreatureMapper mapper;

	@GetMapping
	public ResponseEntity<List<Creature>> getCreatures() {
		List<Creature> creatures = creatureService.getCreatures();

		return ResponseEntity
				.ok()
				.body(creatures);
	}

}
