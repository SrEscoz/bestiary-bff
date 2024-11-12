package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.requests.CreatureInDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.CreatureOutDTO;
import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.models.LegendaryAction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CreatureMapper {

	@Mapping(target = "type", source = "type.name")
	@Mapping(target = "alignment", source = "alignment.name")
	CreatureOutDTO toDTO(Creature creature);

	List<CreatureOutDTO> toDTOs(List<Creature> creatures);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "type.id", source = "typeId")
	@Mapping(target = "alignment.id", source = "alignmentId")
	Creature toEntity(CreatureInDTO creatureInDTO);

	default Set<Action> mapToActions(List<Long> actionIds) {
		if (actionIds == null || actionIds.isEmpty()) {
			return new LinkedHashSet<>();
		} else {
			return actionIds.stream()
					.map(Action::new)
					.collect(Collectors.toSet());
		}
	}

	default Set<LegendaryAction> mapToLegendaryActions(List<Long> actionIds) {
		if (actionIds == null || actionIds.isEmpty()) {
			return new LinkedHashSet<>();
		} else {
			return actionIds.stream()
					.map(LegendaryAction::new)
					.collect(Collectors.toSet());
		}
	}

}