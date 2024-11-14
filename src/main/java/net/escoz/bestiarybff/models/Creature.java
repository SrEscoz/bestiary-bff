package net.escoz.bestiarybff.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

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

	@ManyToMany
	@JoinTable(name = "creatures_actions",
			joinColumns = @JoinColumn(name = "creature_id"),
			inverseJoinColumns = @JoinColumn(name = "actions_id"))
	private Set<Action> actions = new LinkedHashSet<>();

	@OneToMany(mappedBy = "creature", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<LegendaryAction> legendaryActions = new LinkedHashSet<>();

}