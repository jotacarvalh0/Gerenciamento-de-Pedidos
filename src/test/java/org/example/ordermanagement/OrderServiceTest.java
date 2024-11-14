package org.example.ordermanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCalculateOrderTotal() {
        Order order = new Order ("1", "Laptop", 2, 1500.00);
        when(orderRepository.findById("1")).thenReturn(Optional.of(order));


        double total = orderService.calculateOrderTotal("1");

        assertEquals(3000.00, total, "O total do pedido deve ser 3000.00");
    }

    @Test
    public void testCalculateOrderTotal_OrderNotFound() {
        when(orderRepository.findById("1")).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> orderService.calculateOrderTotal("1"));
    }
}
