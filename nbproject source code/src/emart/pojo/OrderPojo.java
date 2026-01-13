package emart.pojo;

public class OrderPojo {
    private String orderId;
    private String userId;
    private String productId;
    private int quantity;

    // Default constructor
    public OrderPojo() {}

    // Parameterized constructor
    public OrderPojo(String orderId, String userId, String productId, int quantity) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
