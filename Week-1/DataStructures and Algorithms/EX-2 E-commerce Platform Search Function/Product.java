public class Product implements Comparable<Product> {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName.toLowerCase();
        this.category = category.toLowerCase();
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Product other) {
        return this.productId.compareTo(other.productId);
    }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " | Category: " + category;
    }
}