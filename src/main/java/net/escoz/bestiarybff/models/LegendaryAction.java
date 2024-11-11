package net.escoz.bestiarybff.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "legendary_action")
@NoArgsConstructor
@RequiredArgsConstructor
public class LegendaryAction {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(length = 1000)
	private String description;

	@ManyToOne
	@JoinColumn(name = "creature_id")
	private Creature creature;

}