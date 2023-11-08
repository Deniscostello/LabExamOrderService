package ie.atu.ordermanagement;

import lombok.Data;

@Data
public class Order {
    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;
}
