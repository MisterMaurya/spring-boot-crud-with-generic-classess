package org.crud.generic.service.impl;

import org.crud.generic.repo.EntityRepo;
import org.crud.generic.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityServiceImpl<T, ID> implements EntityService<T, ID> {

	@Autowired
	private EntityRepo<T, ID> repo;

	@Override
	public T saveEntity(T t) {
		return repo.save(t);
	}

}
