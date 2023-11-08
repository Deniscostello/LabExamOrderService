package ie.atu.ordermanagement;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrderRequest(@RequestBody Order order){
        return orderService.createOrder(order);

    }

    @GetMapping("order/{orderId}")
    public Object getOrderId(@PathVariable int orderId){
        Object result= orderService.getWantedOrderById(orderId);
        return result;
    }

}
