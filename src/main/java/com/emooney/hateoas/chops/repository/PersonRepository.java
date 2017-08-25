package com.emooney.hateoas.chops.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.emooney.hateoas.chops.entity.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	
	List<Person> findByLastName(@Param("name") String name);
	List<Person> findByFirstName(@Param("name") String name);
	List<Person> findByFavoriteLanguage(@Param("fav") String fav);
	List<Person> findByOtherLanguages(@Param("other") String other);
	List<Person> findByImage(@Param("image") String image);
	List<Person> findByTitle(@Param("title") String title);
}



