package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.responses.ActionOutDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.LegendaryActionOutDTO;
import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.LegendaryAction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActionMapper {

	ActionOutDTO toActionDTO(Action action);

	List<ActionOutDTO> toActionDTO(List<Action> actions);

	LegendaryActionOutDTO toLegendaryActionDTO(LegendaryAction legendaryAction);

	List<LegendaryActionOutDTO> toLegendaryActionDTO(List<LegendaryAction> legendaryActions);
}
