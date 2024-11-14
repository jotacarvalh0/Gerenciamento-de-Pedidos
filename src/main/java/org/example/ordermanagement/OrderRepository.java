package org.example.ordermanagement;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(String id);
    void save(Order order);
    List<Order> findAll();
}
