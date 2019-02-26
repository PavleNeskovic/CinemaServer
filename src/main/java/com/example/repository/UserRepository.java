package com.example.repository;


import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findOneByEmail(String email);
	Optional<User> findByEmail(String email);
	Optional<User> findOneById(Long id);
	@Query(value = "select u from User u where u.role <> 2")
	Collection<User> findAllFilteredUsers();
	
//	@Modifying
//	@Transactional
//	@Query(value = "delete from User u where u.id = ?1")
//	void deleteUser(Long id);
}