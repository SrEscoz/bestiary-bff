package net.escoz.bestiarybff.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "action")
@NoArgsConstructor
@RequiredArgsConstructor
public class Action {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(length = 1000)
	private String description;

	@ManyToMany(mappedBy = "actions")
	private Set<Creature> creatures = new LinkedHashSet<>();

}