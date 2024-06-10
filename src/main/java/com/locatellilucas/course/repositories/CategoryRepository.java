package com.locatellilucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locatellilucas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
