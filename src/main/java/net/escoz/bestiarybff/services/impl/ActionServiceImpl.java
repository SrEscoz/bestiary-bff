package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.exceptions.NotFoundException;
import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.LegendaryAction;
import net.escoz.bestiarybff.repositories.ActionRepository;
import net.escoz.bestiarybff.repositories.LegendaryActionRepository;
import net.escoz.bestiarybff.services.ActionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService {

	private final ActionRepository actionRepository;
	private final LegendaryActionRepository legendaryActionRepository;

	@Override
	public List<Action> getActions() {
		return actionRepository.findAll();
	}

	@Override
	public Action getAction(long id) {
		return actionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Action with id: " + id + " not found"));
	}

	@Override
	public List<LegendaryAction> getLegendaryActions() {
		return legendaryActionRepository.findAll();
	}

	@Override
	public LegendaryAction getLegendaryAction(long id) {
		return legendaryActionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Legendary Action with id: " + id + " not found"));
	}
}
