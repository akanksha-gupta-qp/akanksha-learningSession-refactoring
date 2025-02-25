class RegularCustomer implements Discount {
    public double calculateDiscount(double amount) {
        return amount*ContentTypeEnum.REGULAR.getDiscount();
    }
}
