package classstructureintegrate;

public class Product {

    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void increasePrice(Integer increasePrice) {
        this.price = this.price + increasePrice;
    }

    public void decreasePrice(Integer decreasePrice) {
        this.price = this.price - decreasePrice;
    }
}
