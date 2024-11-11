package net.escoz.bestiarybff.mappers;

import net.escoz.bestiarybff.controllers.dtos.responses.MetadataOutDTO;
import net.escoz.bestiarybff.models.Aligment;
import net.escoz.bestiarybff.models.Type;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MetadataMapper {

	MetadataOutDTO toDTO(List<Aligment> alignments, List<Type> types);

	default List<String> mapToAligments(List<Aligment> alignments) {
		return alignments.stream()
				.map(Aligment::getName)
				.toList();
	}

	default List<String> mapToTypes(List<Type> types) {
		return types.stream()
				.map(Type::getName)
				.toList();
	}
}
