class RegularCustomer implements Discount {
    public double calculateDiscount() {
        return ContentTypeEnum.REGULAR.getDiscount();
    }
}
