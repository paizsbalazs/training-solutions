package classsctructureconstructors;

public class Store {

    private String product;
    private Integer stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public Integer getStock() {
        return stock;
    }

    public void store(Integer stock) {
        this.stock = this.stock + stock;
    }

    public void dispatch(Integer dispatch) {
        this.stock = this.stock - dispatch;
    }
}
