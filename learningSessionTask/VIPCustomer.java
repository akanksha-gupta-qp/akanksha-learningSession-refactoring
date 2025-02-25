class VIPCustomer implements Discount {
    public double calculateDiscount() {
        return ContentTypeEnum.VIP.getDiscount();
    }
}
