package net.escoz.bestiarybff.services;

import net.escoz.bestiarybff.models.Alignment;
import net.escoz.bestiarybff.models.Type;

import java.util.List;

public interface MetadataService {

	List<Alignment> getAligments();

	Alignment getAlignment(long id);

	List<Type> getTypes();

	Type getType(long id);
}
