package net.escoz.bestiarybff.controllers.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetadataOutDTO {

	private List<String> alignments;
	private List<String> types;
}
