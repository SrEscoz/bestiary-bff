package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.responses.MetadataOutDTO;
import net.escoz.bestiarybff.models.Alignment;
import net.escoz.bestiarybff.models.Type;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MetadataMapper {

	MetadataOutDTO toDTO(List<Alignment> alignments, List<Type> types);

	default List<String> mapToAligments(List<Alignment> alignments) {
		return alignments.stream()
				.map(Alignment::getName)
				.toList();
	}

	default List<String> mapToTypes(List<Type> types) {
		return types.stream()
				.map(Type::getName)
				.toList();
	}
}
