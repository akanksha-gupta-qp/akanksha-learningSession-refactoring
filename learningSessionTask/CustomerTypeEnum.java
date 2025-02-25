package akanksha-learningSession-refactoring.learningSessionTask

public enum ContentTypeEnum {
    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.1),
    VIP("VIP", 0.2);

    private final String columnName;
    private final double discount;

    ContentTypeEnum(String columnName, double discount){
        this.columnName = columnName;
        this.discount = discount;
    }

    public String getColumnName() {
        return columnName;
    }
    public double getDiscount() {return discount;}
}