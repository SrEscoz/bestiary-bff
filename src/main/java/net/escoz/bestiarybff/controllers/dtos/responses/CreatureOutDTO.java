package net.escoz.bestiarybff.controllers.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatureOutDTO {

	private long id;
	private String name;
	private String type;
	private String alignment;
	private String size;
	private int armorClass;
	private String hitPoints;
	private int challengeRating;
	private List<ActionOutDTO> actions;
	private List<LegendaryActionOutDTO> legendaryActions;
}
