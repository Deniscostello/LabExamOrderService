package ie.atu.ordermanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    ArrayList<Order> orders = new ArrayList<>();

    public String createOrder(Order order){
        orders.add(order);
        return "You order has been placed";
    }
}
