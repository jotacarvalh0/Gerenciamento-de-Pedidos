package org.example.ordermanagement;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public double calculateOrderTotal(String orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontado!"));
        return order.getTotalPrice();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

}
