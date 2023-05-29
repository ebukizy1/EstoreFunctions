package EcommerceUml;

import java.util.ArrayList;

public class Customer extends Users{
    private ArrayList<BillingInformation> billingInformations;
    private ShoppingCart cart;


    public Customer(int age, String emailAddress, String homeAddress, String name, String password, String phone) {
        super(age, emailAddress, homeAddress, name, password, phone);
    }

}
