package org.crud.generic.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepo<T, ID> extends CrudRepository<T, ID> {

}
