package ie.atu.ordermanagement;

import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private  String name;
    private int age;
    private String email;
}
