package com.rodrigopepato.course.repositories;

import com.rodrigopepato.course.entities.enums.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
