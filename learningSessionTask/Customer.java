import java.util.ArrayList;
import java.util.List;
import static CustomerTypeEnum

class Customer {
    String name;
    String customerType;
    double discount;

    public Customer(String name, String customerType) {
        this.name = name;
        this.customerType = customerType;
        setDiscount(customerType);
    }

    public void setDiscount(String customerType) {
        switch (String customerType) {
            case CustomerTypeEnum.REGULAR.getColumnName():
                RegularCustomer.calculateDiscount();
                break;
            case CustomerTypeEnum.PREMIUM.getColumnName():
                PremiumCustomer.calculateDiscount();
                break;
            case CustomerTypeEnum.VIP.getColumnName():
                VIPCustomer.calculateDiscount();
            default:
                0
        }
    }
}



