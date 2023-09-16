package resthw.repo;

import resthw.model.Order;

import java.util.HashMap;

public class OrderRepository {
    private final HashMap<Integer, Order> orders = new HashMap<>();

    public HashMap<Integer, Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }

}
