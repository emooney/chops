package com.emooney.hateoas.chops.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.emooney.hateoas.chops.entity.User;

@RepositoryRestResource()
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	List<User> findByFirstName(@Param("firstName") String firstName);
	List<User> findByLastName(@Param("lastName") String lastName);
	List<User> findByLang1(@Param("lang1") String lang1);
	List<User> findByWishLang1(@Param("wishLang1") String wishLang1);
	//List<User> findByImage(@Param("image") String image);
	List<User> findByTitle(@Param("title") String title);

}



