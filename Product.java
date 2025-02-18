class Product {
    
    String pcode;
    String pname;
    double price;
    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
    public void display() {
        System.out.println("Product Code: " + pcode + ", Product Name: " + pname + ", Price: " + price);
    }
    public static void main(String[] args) {
        
        Product product1 = new Product("P001", "Product1", 50);
        Product product2 = new Product("P002", "Product2", 30);
        Product product3 = new Product("P003", "Product3", 40);
        
        Product[] products = {product1, product2, product3};
        Product lowestPriceProduct = products[0];

        for (Product product : products) {
            if (product.price < lowestPriceProduct.price) {
                lowestPriceProduct = product;
            }
        }

        
        System.out.println("Product with the lowest price:");
        lowestPriceProduct.display();
    }
}
