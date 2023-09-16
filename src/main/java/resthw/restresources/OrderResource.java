package resthw.restresources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import resthw.model.Order;
import resthw.model.Product;
import resthw.services.OrderService;

import java.util.List;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    OrderService orderService;

    @GET
    public List<Order> getAllOrders() {
        return orderService.getOrders();
    }

    @GET
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") Integer id) {
        try {
            return orderService.getOrderById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @POST()
    @Path("/product/{orderId}")
    public Order addProduct(@PathParam("orderId") Integer orderId, Product product) {
        try {
            orderService.getOrderById(orderId).getProducts().add(product);
            return orderService.getOrderById(orderId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
