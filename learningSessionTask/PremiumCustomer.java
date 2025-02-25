class PremiumCustomer implements Discount {
    public double calculateDiscount(double amount) {
        return amount*ContentTypeEnum.PREMIUM.getDiscount();
    }
}
