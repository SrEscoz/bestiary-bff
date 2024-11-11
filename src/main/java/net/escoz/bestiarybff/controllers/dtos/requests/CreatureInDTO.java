package net.escoz.bestiarybff.controllers.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatureInDTO {

	@NotBlank
	private String name;

	@NotNull
	private Integer typeId;

	@NotNull
	private Integer alignmentId;

	@NotBlank
	private String size;

	@NotNull
	private Integer armorClass;

	@NotBlank
	private String hitPoints;

	@NotNull
	private Integer challengeRating;

}
