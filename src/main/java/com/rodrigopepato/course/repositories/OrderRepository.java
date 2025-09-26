package com.rodrigopepato.course.repositories;

import com.rodrigopepato.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
