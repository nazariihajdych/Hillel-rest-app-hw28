package resthw.services;

import resthw.model.Order;
import resthw.repo.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceDefault implements OrderService {
    OrderRepository orderRepository = new OrderRepository();

    public OrderServiceDefault() {
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orderRepository.getOrders().values());
    }

    @Override
    public Order getOrderById(Integer orderId) throws Exception {
        Order order = orderRepository.getOrders().get(orderId);
        if (order == null) {
            throw new Exception();
        }
        return order;
    }
}
