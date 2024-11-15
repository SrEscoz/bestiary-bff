package net.escoz.bestiarybff.services;

import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.LegendaryAction;

import java.util.List;

public interface ActionService {

	List<Action> getActions();

	Action getAction(long id);

	List<LegendaryAction> getLegendaryActions();

	LegendaryAction getLegendaryAction(long id);

}
