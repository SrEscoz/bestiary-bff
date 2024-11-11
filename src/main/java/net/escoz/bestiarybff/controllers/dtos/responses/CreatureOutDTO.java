package net.escoz.bestiarybff.controllers.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatureOutDTO {

	private long id;
	private String name;
	private String type;
	private String size;
	private String armorClass;
	private String hitPoints;
	private String challengeRating;


}
