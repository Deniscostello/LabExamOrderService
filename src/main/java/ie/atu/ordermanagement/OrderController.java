package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class OrderController {
    private final OrderService orderService;
    private final NewCustomerOrderClient newCustomerOrderClient;

    @Autowired
    public OrderController(OrderService orderService, NewCustomerOrderClient newCustomerOrderClient) {
        this.orderService = orderService;
        this.newCustomerOrderClient=newCustomerOrderClient;
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrderRequest(@RequestBody Order order){
        String confirm =newCustomerOrderClient.orderDetails(order);
        return confirm;

    }

    @GetMapping("order/{orderId}")
    public Object getOrderId(@PathVariable int orderId){
        Object result= orderService.getWantedOrderById(orderId);
        return result;
    }



}
