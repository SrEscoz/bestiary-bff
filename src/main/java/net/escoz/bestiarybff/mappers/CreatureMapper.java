package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.responses.CreatureOutDTO;
import net.escoz.bestiarybff.models.Creature;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreatureMapper {

	CreatureOutDTO toDTO(Creature creature);

}