package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ShopingList {
    Map<String, List<String>> orderlist = new HashMap<>();
    Map<String, Integer> productlist = new HashMap<>();

    public Map<String, List<String>> getOrderlist() {
        return orderlist;
    }

    public Map<String, Integer> getProductlist() {
        return productlist;
    }

    public void readFile(Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null ) {
                String[] row = line.split(" ");
                String[] items = row[1].split(",");
                orderlist.put(row[0], List.of(items) );
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("There is no file");
        }
    }

    public List<String> getProductListById(String s) {
        List<String> result = new ArrayList<>(orderlist.get(s));
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Path path = Path.of("list.txt");
        ShopingList sl = new ShopingList();
        sl.readFile(path);
        System.out.println(sl.orderlist.size());
        System.out.println(sl.orderlist.get("A233").size());
        System.out.println(sl.getProductListById("W34111"));
        sl.makeProductList();
        System.out.println(sl.getProductlist());
        System.out.println(sl.getOneProduct("sugar"));
        System.out.println(sl.numberOfProductByOrder("A233"));
    }

    public void makeProductList() {
        int count = 0;

        for (String s: orderlist.keySet()) {
            for (int i = 0; i < orderlist.get(s).size(); i++) {
                if (!productlist.containsKey(orderlist.get(s).get(i))) {
                    productlist.put(orderlist.get(s).get(i), 0);
                }
                System.out.println(productlist.size());
                count = productlist.get(orderlist.get(s).get(i))+1;
                productlist.put(orderlist.get(s).get(i), count);
            }
            count = 0;
        }
    }

    public Map.Entry<String, Integer> getOneProduct(String s) {
        for (Map.Entry<String, Integer> entry: productlist.entrySet()) {
            if (entry.getKey().equals(s)) {
                return entry;
            }
        }
        return null;
    }

    public int numberOfProductByOrder(String s) {
        int result = 0;

        for (String s1: orderlist.keySet()) {
            if (s1.equals(s)) {
                result = orderlist.get(s).size();
            }
        }

        return result;
    }

}
