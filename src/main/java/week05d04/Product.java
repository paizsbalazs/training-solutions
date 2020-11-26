package week05d04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

    private String name;
    private LocalDate expire;

    public Product(String name, int year, int month, int day ) {
        this.name = name;
        String datum = "" + year + "." + month + "." +day;
        LocalDate dt = LocalDate.of(year, month, day);
        this.expire = dt;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpire() {
        return expire;
    }

}
