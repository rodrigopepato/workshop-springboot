package com.rodrigopepato.course.repositories;

import com.rodrigopepato.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
