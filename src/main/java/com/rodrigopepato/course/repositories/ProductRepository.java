package com.rodrigopepato.course.repositories;

import com.rodrigopepato.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
