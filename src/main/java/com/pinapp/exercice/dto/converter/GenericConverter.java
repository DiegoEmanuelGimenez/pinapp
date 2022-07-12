package com.pinapp.exercice.dto.converter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericConverter<A, B> {

	public abstract A toDto(B entity);
	
	public List<A> toDtoList(List<B> entities) {
		List<A> result = new ArrayList<>();
		for (B b : entities) {
			result.add(toDto(b));
		}
		return result;
	}
	
	public Page<A> toDtoPage(Page<B> entities, Pageable pageable) {
		List<B> entityList = entities.getContent();
		List<A> dtoList = toDtoList(entityList);
		Page<A> result = new PageImpl<>(dtoList, pageable, dtoList.size());
		return result;
	}
	
	public abstract B toEntity(A dto);
}