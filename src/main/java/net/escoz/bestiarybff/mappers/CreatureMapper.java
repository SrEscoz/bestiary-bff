package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.responses.CreatureOutDTO;
import net.escoz.bestiarybff.models.Creature;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreatureMapper {

	@Mapping(target = "type", source = "type.name")
	@Mapping(target = "alignment", source = "alignment.name")
	CreatureOutDTO toDTO(Creature creature);

}