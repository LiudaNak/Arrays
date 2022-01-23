import java.util.StringJoiner;

public class Product {
    private String name;
    private int price;
    private String description;
    private final Product.Category Category;
    enum Category {Low, High, Premium }


    public Product.Category getCategory() {
        return Category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }



    public Product(String name, int price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.Category = category;
    }
}
