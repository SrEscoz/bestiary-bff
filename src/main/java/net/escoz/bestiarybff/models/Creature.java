package net.escoz.bestiarybff.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "creatures")
public class Creature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String type;
	private String size;
	private String armorClass;
	private String hitPoints;
	private String challengeRating;

}