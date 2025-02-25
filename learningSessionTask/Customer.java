import java.util.ArrayList;
import java.util.List;
import static CustomerTypeEnum

class Customer {
    String name;
    String type;
    double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount(type);
    }

    public void setDiscount(String type) {
        switch (String type) {
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



