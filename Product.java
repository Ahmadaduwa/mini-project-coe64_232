public class Product {
    private String id_product; // รหัสสินค้า
    private String name_product; // ชื่อสินค้า
    private String type_product; // ประเภทสินค้า
    private double price; // ราคาสินค้า
    private int product_quantity; // จำนวนสินค้า
    private double cost_Product; // ราคาทุน

    public Product(String id, String n, String type, double p, int p_q, double cost) {
        this.id_product = id;
        this.name_product = n;
        this.type_product = type;
        this.price = p;
        this.product_quantity = p_q;        
        this.cost_Product = cost;
    }

    public String getIdProduct() {
        return this.id_product;
    }

    public void setIdProduct(String id) {
        this.id_product = id;
    }

    public String getNameProduct() {
        return this.name_product;
    }

    public void setNameProduct(String name) {
        this.name_product = name;
    }

    public String getTypeProduct() {
        return this.type_product;
    }

    public void setTypeProduct(String type) {
        this.type_product = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public double getQuantityProduct() {
        return this.product_quantity;
    }

    public void setQuantityProduct(int q) {
        this.product_quantity = q;
    }

    public double getCostProduct() {
        return this.cost_Product;
    }

    public void setPhoneNumberEmployee(double cost) {
        this.cost_Product = cost;
    }
}
