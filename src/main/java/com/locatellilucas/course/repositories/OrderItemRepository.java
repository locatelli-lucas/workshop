package com.locatellilucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locatellilucas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
