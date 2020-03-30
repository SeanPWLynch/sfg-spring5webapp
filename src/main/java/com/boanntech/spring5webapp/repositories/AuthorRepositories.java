package com.boanntech.spring5webapp.repositories;

import com.boanntech.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author, Long> {
}
