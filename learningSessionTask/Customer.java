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
        if (type.equals(CustomerTypeEnum.REGULAR.getColumnName())) {
             discount = RegularCustomer.getDiscount();
        } else if (CustomerTypeEnum.PREMIUM.getColumnName()) {
            discount = 0.1;
        } else if (CustomerTypeEnum.VIP.getColumnName() {
            discount = 0.2;
        }
    }
}



