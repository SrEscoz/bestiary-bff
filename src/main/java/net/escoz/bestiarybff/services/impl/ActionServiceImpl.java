package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
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
	public List<LegendaryAction> getLegendaryActions() {
		return legendaryActionRepository.findAll();
	}
}
