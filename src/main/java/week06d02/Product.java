package week06d02;

public class Product {

    private Category category;
    private String name;
    private int price;

    public Product(Category category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category.name();
    }


}
