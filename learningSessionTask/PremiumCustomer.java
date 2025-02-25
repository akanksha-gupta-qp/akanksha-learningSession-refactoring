class PremiumCustomer implements Discount {
    public double calculateDiscount() {
        return ContentTypeEnum.PREMIUM.getDiscount();
    }
}
