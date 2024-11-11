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

	@Column(unique = true)
	private String name;

	@ManyToOne(optional = false)
	@JoinColumn(name = "type_id", nullable = false)
	private Type type;

	@ManyToOne(optional = false)
	@JoinColumn(name = "aligment_id", nullable = false)
	private Alignment alignment;

	private String size;
	private Integer armorClass;
	private String hitPoints;
	private Integer challengeRating;

}