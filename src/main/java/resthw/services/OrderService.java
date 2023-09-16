package resthw.services;

import org.glassfish.jersey.spi.Contract;
import resthw.model.Order;

import java.util.List;

@Contract
public interface OrderService {
    void addOrder(Order order);

    List<Order> getOrders();

    Order getOrderById(Integer orderId) throws Exception;
}
