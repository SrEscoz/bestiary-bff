package net.escoz.bestiarybff.services;

import net.escoz.bestiarybff.models.Aligment;
import net.escoz.bestiarybff.models.Type;

import java.util.List;

public interface MetadataService {

	List<Aligment> getAligments();

	List<Type> getTypes();
}
