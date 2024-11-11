package net.escoz.bestiarybff.controllers;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.controllers.dtos.responses.ActionOutDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.LegendaryActionOutDTO;
import net.escoz.bestiarybff.mappers.ActionMapper;
import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.LegendaryAction;
import net.escoz.bestiarybff.services.ActionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/creatures")
public class ActionController {

	private final ActionService actionService;
	private final ActionMapper mapper;

	@GetMapping("/actions")
	public ResponseEntity<List<ActionOutDTO>> getActions() {
		List<Action> actions = actionService.getActions();

		return ResponseEntity
				.ok()
				.body(mapper.toActionDTO(actions));
	}


	@GetMapping("/legendary-actions")
	public ResponseEntity<List<LegendaryActionOutDTO>> getLegendaryActions() {
		List<LegendaryAction> actions = actionService.getLegendaryActions();

		return ResponseEntity
				.ok()
				.body(mapper.toLegendaryActionDTO(actions));
	}
}
