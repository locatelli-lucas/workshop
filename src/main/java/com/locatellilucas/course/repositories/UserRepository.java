package com.locatellilucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locatellilucas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
