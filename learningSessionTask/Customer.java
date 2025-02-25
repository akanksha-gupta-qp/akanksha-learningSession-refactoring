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
        setDiscount();
    }

    public void setDiscount() {
        switch () {
            case CustomerTypeEnum.REGULAR.getColumnName():
                RegularCustomer.calculateDiscount(amount)
                break;
            case CustomerTypeEnum.PREMIUM.getColumnName():
                PremiumCustomer.calculateDiscount(amount)

                break;
            case CustomerTypeEnum.VIP.getColumnName():
                VIPCustomer.calculateDiscount(amount)
            default:
                0
        }
    }
}



