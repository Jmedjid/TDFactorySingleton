package fr.paris10.poa.td3.products;

/**
 * Created by jomedjid on 10/10/2016.
 */
public class ProductFactory {

    private static ProductFactory instance;

    public ProductFactory() {
    }

    public static synchronized ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }

    public Product createProduct() {
        return new ProductA();
    }

    public Product createProduct(String productName) {

        if (productName.equals("Product A")) {
            return new ProductA();
        }

        if (productName.equals("Product B")) {
            return new ProductB();
        }
        if (productName.equals("Product C")) {
            return new ProductC();
        }

        return new ProductA();
    }
}
