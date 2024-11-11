package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.requests.CreatureInDTO;
import net.escoz.bestiarybff.controllers.dtos.responses.CreatureOutDTO;
import net.escoz.bestiarybff.models.Creature;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreatureMapper {

	@Mapping(target = "type", source = "type.name")
	@Mapping(target = "alignment", source = "alignment.name")
	CreatureOutDTO toDTO(Creature creature);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "type.id", source = "typeId")
	@Mapping(target = "alignment.id", source = "alignmentId")
	Creature toEntity(CreatureInDTO creatureInDTO);

}