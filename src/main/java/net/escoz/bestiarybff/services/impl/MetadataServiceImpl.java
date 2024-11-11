package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.models.Alignment;
import net.escoz.bestiarybff.models.Type;
import net.escoz.bestiarybff.repositories.AligmentRepository;
import net.escoz.bestiarybff.repositories.TypeRepository;
import net.escoz.bestiarybff.services.MetadataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MetadataServiceImpl implements MetadataService {

	private final AligmentRepository aligmentRepository;
	private final TypeRepository typeRepository;

	@Override
	public List<Alignment> getAligments() {
		return aligmentRepository.findAll();
	}

	@Override
	public List<Type> getTypes() {
		return typeRepository.findAll();
	}
}
