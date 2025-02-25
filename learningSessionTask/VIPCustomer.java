class VIPCustomer implements Discount {
    public double calculateDiscount(double amount) {
        return amount*ContentTypeEnum.VIP.getDiscount();
    }
}
