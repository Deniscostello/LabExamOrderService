package ie.atu.ordermanagement;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="order-service", url="http://localhost:8082")
public interface NewCustomerOrderClient {
    @PostMapping("/createOrder")
    String orderDetails(@RequestBody Order order);

}
